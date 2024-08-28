package com.accioproj.bookMyShow.Services;

import com.accioproj.bookMyShow.Entity.*;
import com.accioproj.bookMyShow.Enums.seatType;
import com.accioproj.bookMyShow.Repositories.movieRepo;
import com.accioproj.bookMyShow.Repositories.showRepo;
import com.accioproj.bookMyShow.Repositories.showSeatRepo;
import com.accioproj.bookMyShow.Repositories.theaterRepo;
import com.accioproj.bookMyShow.Requests.addShowRqst;
import com.accioproj.bookMyShow.Requests.addShowSeatRqst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class showService {
    @Autowired
    private theaterRepo theaterRepo1;
    @Autowired
    private movieRepo movieRepo1;
    @Autowired
    private showRepo showRepo1;
    @Autowired
    private showSeatRepo showSeatRepo1;

    public String addShow(addShowRqst showDto) throws Exception {
        Optional<Theater> optionalTheater = theaterRepo1.findById(showDto.getTheaterId());
        if (optionalTheater.isEmpty()) {
            throw new Exception("Theater ID dont Exist");
        }
        Theater theater = optionalTheater.get();
        Optional<Movie> optionalMovie = movieRepo1.findByMovieName(showDto.getMovieName());
        if (optionalMovie.isEmpty()) {
            throw new Exception("Movie  Don't Exist");
        }
        Movie movie = optionalMovie.get();

        Show show = new Show();
        show.setShowDate(showDto.getShowDate());
        show.setShowTime(showDto.getShowTime());
        show.setMovie(movie);
        show.setTheater(theater);

        movie.getShowList().add(show);
        theater.getShowList().add(show);
        showRepo1.save(show);

        return "Show Added Successfully with Timing of-- " + show.getShowTime() + " At-- " + theater.getTheaterName() + " For movie-- " + movie.getMovieName() + " on-- " + show.getShowDate();
    }

    public String addShowSeat(addShowSeatRqst showSeatDto) throws Exception {
        Optional<Show> optionalShow = showRepo1.findById(showSeatDto.getShowId());
        if (optionalShow.isEmpty()) {
            throw new Exception("Show ID Dont Exist In System");
        }
        Show shows = optionalShow.get();
        List<ShowSeat> showSeatList = new ArrayList<>();
        if (showSeatList.size() > 0) {
            throw new Exception("Seats already  Alloted");
        }
        Theater theater = shows.getTheater();
        List<TheaterSeat> theaterSeatList = theater.getTheaterSeatList();
        for (int i = 0; i < theaterSeatList.size(); i++) {
            TheaterSeat tSeat = theaterSeatList.get(i);
            if (tSeat.getSeattype().equals(seatType.PRIMIUM)) {
                ShowSeat showS = new ShowSeat();
                showS.setSeatNo(tSeat.getSeatNo());
                showS.setSeattype(tSeat.getSeattype());
                showS.setAvailable(Boolean.TRUE);
                showS.setPrice(showSeatDto.getPriceOfPrimium());
                showS.setFoodAttached(Boolean.FALSE);
                showS.setSeattype(seatType.PRIMIUM);
                showS.setShow(shows);

                showSeatList.add(showS);
                showS = showSeatRepo1.save(showS);
                showSeatList.add(showS);
            } else {
                ShowSeat showS = new ShowSeat();
                showS.setSeatNo(tSeat.getSeatNo());
                showS.setSeattype(tSeat.getSeattype());
                showS.setAvailable(Boolean.TRUE);
                showS.setFoodAttached(Boolean.FALSE);
                showS.setSeattype(seatType.CLASSIC);
                showS.setPrice(showSeatDto.getPriceOfClassic());
                showS.setShow(shows);

                showSeatList.add(showS);
                showSeatList.add(showS);
            }
        }
        shows.setShowSeatList(showSeatList);
        showRepo1.save(shows);
        return "Succefully Releases Seat  for  Show with ID-- " + shows.getShowId();
    }

    public List<String> getAllShow(String movieName, LocalDate date) throws Exception {
        Optional<Movie> optionalMovie = movieRepo1.findByMovieName(movieName);
        if (optionalMovie.isEmpty()) {
            throw new Exception("Movie Not Yet Release");
        }
        Movie movie = optionalMovie.get();
        List<Show> showList = showRepo1.findByMovieAndShowDate(movie, date);
        List<String> showAndTheaterList = new ArrayList<>();
        for (Show s : showList) {
            showAndTheaterList.add("showId: " + s.getShowId() + " theater name: " + s.getTheater().getTheaterName() +
                    " Address: " + s.getTheater().getTheaterAddress());
        }
        if (showAndTheaterList.isEmpty()) {
            throw new Exception("No shows for this movie on given Date");
        }
        return showAndTheaterList;
    }
}
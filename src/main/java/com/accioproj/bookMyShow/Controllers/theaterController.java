package com.accioproj.bookMyShow.Controllers;

import com.accioproj.bookMyShow.Requests.GetRevenueRqst;
import com.accioproj.bookMyShow.Requests.addTheaterRqst;
import com.accioproj.bookMyShow.Requests.addTheaterSeatRqst;
import com.accioproj.bookMyShow.Services.theaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Theater")
public class theaterController {
    @Autowired
    private theaterService theaterService;

    @PostMapping("/addTheater")
    public ResponseEntity<String> addTheater(@RequestBody addTheaterRqst theaterDto) {
        String response = theaterService.addTheater(theaterDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/addTheaterSeat")
    public ResponseEntity<String> addTheaterSeat(@RequestBody addTheaterSeatRqst theaterSeatDto) {
        String response = theaterService.addTheaterSeats(theaterSeatDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/CalculateRevenue")
    public ResponseEntity<Integer> GetRevenueForMovie(@RequestBody GetRevenueRqst revenueRqst) {
        try {
            Integer response = theaterService.GetRevenue(revenueRqst);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}

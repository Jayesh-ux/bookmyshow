package com.accioproj.bookMyShow.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theater")
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theaterId;

    @Column(unique = true)
    private String theaterName;

    private String theaterAddress;
    private Integer noOfScreen;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList = new ArrayList<>();

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<Show> showList = new ArrayList<>();

    public Theater() {}

    public Theater(Integer theaterId, String theaterName, String theaterAddress, Integer noOfScreen,
                   List<TheaterSeat> theaterSeatList, List<Show> showList) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.theaterAddress = theaterAddress;
        this.noOfScreen = noOfScreen;
        this.theaterSeatList = theaterSeatList;
        this.showList = showList;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterAddress() {
        return theaterAddress;
    }

    public void setTheaterAddress(String theaterAddress) {
        this.theaterAddress = theaterAddress;
    }

    public Integer getNoOfScreen() {
        return noOfScreen;
    }

    public void setNoOfScreen(Integer noOfScreen) {
        this.noOfScreen = noOfScreen;
    }

    public List<TheaterSeat> getTheaterSeatList() {
        return theaterSeatList;
    }

    public void setTheaterSeatList(List<TheaterSeat> theaterSeatList) {
        this.theaterSeatList = theaterSeatList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public static TheaterBuilder builder() {
        return new TheaterBuilder();
    }

    public static class TheaterBuilder {
        private Integer theaterId;
        private String theaterName;
        private String theaterAddress;
        private Integer noOfScreen;
        private List<TheaterSeat> theaterSeatList = new ArrayList<>();
        private List<Show> showList = new ArrayList<>();

        public TheaterBuilder theaterId(Integer theaterId) {
            this.theaterId = theaterId;
            return this;
        }

        public TheaterBuilder theaterName(String theaterName) {
            this.theaterName = theaterName;
            return this;
        }

        public TheaterBuilder theaterAddress(String theaterAddress) {
            this.theaterAddress = theaterAddress;
            return this;
        }

        public TheaterBuilder noOfScreen(Integer noOfScreen) {
            this.noOfScreen = noOfScreen;
            return this;
        }

        public TheaterBuilder theaterSeatList(List<TheaterSeat> theaterSeatList) {
            this.theaterSeatList = theaterSeatList;
            return this;
        }

        public TheaterBuilder showList(List<Show> showList) {
            this.showList = showList;
            return this;
        }

        public Theater build() {
            return new Theater(theaterId, theaterName, theaterAddress, noOfScreen, theaterSeatList, showList);
        }
    }
}

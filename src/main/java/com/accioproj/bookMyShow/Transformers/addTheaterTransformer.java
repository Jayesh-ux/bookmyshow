package com.accioproj.bookMyShow.Transformers;

import com.accioproj.bookMyShow.Entity.Theater;
import com.accioproj.bookMyShow.Requests.addTheaterRqst;

public class addTheaterTransformer {
    public static Theater convertAddTheaterRqstToTheater(addTheaterRqst theaterDto) {
        return Theater.builder()
                .theaterName(theaterDto.getTheaterName())
                .theaterAddress(theaterDto.getTheaterAddress())
                .noOfScreen(theaterDto.getNoOfScreen())
                .build();
    }
}

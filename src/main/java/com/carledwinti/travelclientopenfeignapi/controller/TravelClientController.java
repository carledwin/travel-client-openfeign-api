package com.carledwinti.travelclientopenfeignapi.controller;

import com.carledwinti.travelclientopenfeignapi.openfeign.TravelFeign;
import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelClientController implements TravelFeign {

    @Autowired
    private TravelFeign travelFeign;

    @GetMapping("/all-bookings")
    public List<BookingDto> bookings() {
        return travelFeign.bookings();
    }
}

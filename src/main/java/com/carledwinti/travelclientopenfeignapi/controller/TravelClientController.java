package com.carledwinti.travelclientopenfeignapi.controller;

import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import com.carledwinti.travelclientopenfeignapi.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelClientController{

    @Autowired
    private TravelService travelService;

    @GetMapping("/all-bookings")
    public List<BookingDto> bookings() {
        return travelService.allBookings();
    }
}

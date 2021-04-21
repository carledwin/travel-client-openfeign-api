package com.carledwinti.travelclientopenfeignapi.openfeign;

import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "travelFeign", url = "${travel.url}")
public interface TravelFeign {

    @GetMapping("/bookings")
    List<BookingDto> bookings();
}

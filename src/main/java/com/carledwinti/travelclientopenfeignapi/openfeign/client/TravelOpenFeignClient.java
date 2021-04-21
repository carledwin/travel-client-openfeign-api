package com.carledwinti.travelclientopenfeignapi.openfeign.client;

import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "travelOpenFeignClient", url = "${travel.url}")
public interface TravelOpenFeignClient {

    @GetMapping("/bookings")
    List<BookingDto> bookings();
}

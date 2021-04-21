package com.carledwinti.travelclientopenfeignapi.openfeign.proxy;

import com.carledwinti.travelclientopenfeignapi.openfeign.client.TravelOpenFeignClient;
import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TravelProxy implements TravelOpenFeignClient {

    @Autowired
    private TravelOpenFeignClient travelOpenFeignClient;

    @Override
    public List<BookingDto> bookings() {
        return travelOpenFeignClient.bookings();
    }
}

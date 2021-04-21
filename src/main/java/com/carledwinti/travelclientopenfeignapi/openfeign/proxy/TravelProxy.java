package com.carledwinti.travelclientopenfeignapi.openfeign.proxy;

import com.carledwinti.travelclientopenfeignapi.openfeign.TravelFeign;
import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class TravelProxy implements TravelFeign {

    @Autowired
    private TravelFeign travelFeign;

    @Override
    public List<BookingDto> bookings() {
        return travelFeign.bookings();
    }
}

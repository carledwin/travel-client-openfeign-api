package com.carledwinti.travelclientopenfeignapi.service;

import com.carledwinti.travelclientopenfeignapi.exception.ApiInternalServerException;
import com.carledwinti.travelclientopenfeignapi.exception.ApiNotFoundException;
import com.carledwinti.travelclientopenfeignapi.openfeign.dto.BookingDto;
import com.carledwinti.travelclientopenfeignapi.openfeign.proxy.TravelProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService{

    @Autowired
    private TravelProxy travelProxy;

    public List<BookingDto> allBookings(){
        List<BookingDto> bookingDtoList = null;
        try{
            bookingDtoList = travelProxy.bookings();
            if(bookingDtoList == null || bookingDtoList.isEmpty()){
                throw new ApiNotFoundException("Bookings not found");
            }
            return bookingDtoList;
        }catch (Exception e){
            throw new ApiInternalServerException("Internal Error: " + e.getMessage(), e);
        }
    }
}

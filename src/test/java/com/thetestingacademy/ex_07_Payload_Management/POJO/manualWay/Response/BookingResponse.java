package com.thetestingacademy.ex_07_Payload_Management.POJO.manualWay.Response;

import com.thetestingacademy.ex_07_Payload_Management.POJO.manualWay.Request.Booking;

public class BookingResponse {
    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

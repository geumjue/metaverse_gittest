package com.example.movie.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MovieTicketController {

    // 모든 영화 목록을 가져오는 메서드
    @GetMapping("/api/movies")
    public String getMovies(){
        return "List of movies";
    }

    // 영화 티켓을 예약하는 메서드
    @PostMapping("/api/book")
    public String bookTicket(@RequestBody BookingRequest bookingRequest){
        // 예약 로직을 처리하는 부분
        return "Booking confirmed for user " + bookingRequest.getUserId() + " for movie " + bookingRequest.getMovieId();
    }

    // 예약 정보를 업데이트하는 메서드
    @PutMapping("/api/update")
    public String updateBooking(@RequestBody BookingUpdateRequest bookingUpdateRequest){
        // 예약 업데이트 로직을 처리하는 부분
        return "Booking updated: " + bookingUpdateRequest.getBookingId();
    }

    // 예약을 취소하는 메서드
    @DeleteMapping("/api/cancel/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId){
        // 예약 취소 로직을 처리하는 부분
        return "Booking cancelled: " + bookingId;
    }
}

// 예약 요청을 위한 DTO 클래스
class BookingRequest {
    private Long userId;
    private Long movieId;
    private String bookingShowtime;
    private String bookingSeat;
    private double bookingPrice;
    private String bookingStatus;

    // Getter와 Setter 메서드

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getBookingShowtime() {
        return bookingShowtime;
    }

    public void setBookingShowtime(String bookingShowtime) {
        this.bookingShowtime = bookingShowtime;
    }

    public String getBookingSeat() {
        return bookingSeat;
    }

    public void setBookingSeat(String bookingSeat) {
        this.bookingSeat = bookingSeat;
    }

    public double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}

// 예약 업데이트 요청을 위한 DTO 클래스
class BookingUpdateRequest {
    private Long bookingId;
    private String bookingShowtime;
    private String bookingSeat;
    private double bookingPrice;
    private String bookingStatus;

    // Getter와 Setter 메서드

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingShowtime() {
        return bookingShowtime;
    }

    public void setBookingShowtime(String bookingShowtime) {
        this.bookingShowtime = bookingShowtime;
    }

    public String getBookingSeat() {
        return bookingSeat;
    }

    public void setBookingSeat(String bookingSeat) {
        this.bookingSeat = bookingSeat;
    }

    public double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}

package com.polito.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polito.bookingsystem.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{
   
  
}
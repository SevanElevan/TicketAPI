package com.CSCProject.TicketAPI.controller;


import com.CSCProject.TicketAPI.apiService.FlightService;
import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/all")
    public List<Flight> getFlights() {
     return flightService.getFlights();
    };

    @PostMapping("/addFlight")
    public void insert(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }


}

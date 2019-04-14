package com.cn.providerticket.controller;

import com.cn.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiecketController {

    @Autowired
    public TicketService ticketService;
    @GetMapping("/ticket/getTicket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}

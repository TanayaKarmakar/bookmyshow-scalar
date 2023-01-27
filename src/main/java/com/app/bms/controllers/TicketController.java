package com.app.bms.controllers;

import com.app.bms.dtos.TicketDTO;
import com.app.bms.models.Ticket;
import com.app.bms.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
@RestController
public class TicketController {
  @Autowired
  private TicketService ticketService;

  @PostMapping("/tickets")
  public Ticket createTicket(TicketDTO ticketDTO) {
    return ticketService.createTicket(ticketDTO);
  }
}

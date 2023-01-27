package com.app.bms.services;

import com.app.bms.dtos.TicketDTO;
import com.app.bms.models.Ticket;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
public interface TicketService {
  Ticket createTicket(TicketDTO ticketDTO);
}

package com.app.bms.services.impl;

import com.app.bms.dtos.TicketDTO;
import com.app.bms.exceptions.SeatUnavailableException;
import com.app.bms.models.SeatStatus;
import com.app.bms.models.ShowSeat;
import com.app.bms.models.Ticket;
import com.app.bms.models.TicketStatus;
import com.app.bms.repositories.ShowSeatRepository;
import com.app.bms.repositories.TicketRepository;
import com.app.bms.services.ShowSeatService;
import com.app.bms.services.TicketService;
import com.app.bms.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
@Service
public class TicketServiceImpl implements TicketService {
  @Autowired
  private TicketRepository ticketRepository;

  @Autowired
  private ShowSeatService showSeatService;

  @Autowired
  private UserService userService;

  @Override
  @Transactional(isolation = Isolation.SERIALIZABLE)
  public Ticket createTicket(TicketDTO ticketDTO) {
    // check for seat availability
    List<ShowSeat> showSeats = showSeatService.getSeats(ticketDTO.getShowSeatIds());
    checkAvailibity(showSeats);

    // mark the seats as blocked
    showSeatService.lockSeats(showSeats);

    // create and persist ticket
    Ticket ticket = new Ticket();
    ticket.setStatus(TicketStatus.PENDING);
    ticket.setUser(userService.getUser(ticketDTO.getUserId()));
    ticket.setSeats(showSeats);
    return ticketRepository.save(ticket);
  }

  private void checkAvailibity(List<ShowSeat> showSeats) {
    // iterate over seats check if all are available
    for(ShowSeat showSeat: showSeats) {
      if(showSeat.getSeatStatus() != SeatStatus.AVAILABLE)
        throw new SeatUnavailableException(showSeat.getId() + " not available");
    }
  }
}

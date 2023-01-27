package com.app.bms.repositories;

import com.app.bms.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

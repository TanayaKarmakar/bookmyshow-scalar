package com.app.bms.dtos;

import java.util.List;
import lombok.Data;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
@Data
public class TicketDTO {
  private Long userId;
  private Long showId;
  private List<Long> showSeatIds;
}

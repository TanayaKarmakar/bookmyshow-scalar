package com.app.bms.services;

import com.app.bms.models.ShowSeat;
import java.util.List;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
public interface ShowSeatService {
  List<ShowSeat> getSeats(List<Long> showSeatIds);

  void lockSeats(List<ShowSeat> showSeats);
}

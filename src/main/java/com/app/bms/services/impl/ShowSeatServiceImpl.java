package com.app.bms.services.impl;

import com.app.bms.models.SeatStatus;
import com.app.bms.models.ShowSeat;
import com.app.bms.repositories.ShowSeatRepository;
import com.app.bms.services.ShowSeatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
@Service
public class ShowSeatServiceImpl implements ShowSeatService {
  @Autowired
  private ShowSeatRepository showSeatRepository;


  @Override
  public List<ShowSeat> getSeats(List<Long> showSeatIds) {
    return showSeatRepository.findAllById(showSeatIds);
  }

  @Override
  public void lockSeats(List<ShowSeat> showSeats) {
    for(ShowSeat showSeat: showSeats) {
      showSeat.setSeatStatus(SeatStatus.LOCKED);
    }
    showSeatRepository.saveAll(showSeats);
  }
}

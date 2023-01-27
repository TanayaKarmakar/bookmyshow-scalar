package com.app.bms.repositories;

import com.app.bms.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
public interface UserRepository extends JpaRepository<Users, Long> {
}

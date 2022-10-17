package com.g15.jpa.repository;

import com.g15.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author desaextremo
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    
}

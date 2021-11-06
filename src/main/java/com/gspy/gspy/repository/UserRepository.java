package com.gspy.gspy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gspy.gspy.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findById(long id);
}

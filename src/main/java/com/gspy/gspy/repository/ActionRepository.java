package com.gspy.gspy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gspy.gspy.models.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {

	Action findById(long id);
}

package com.gspy.gspy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gspy.gspy.models.Location;


public interface LocationRepository extends JpaRepository<Location, Long> {

	Location findById(long id);
}

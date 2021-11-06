package com.gspy.gspy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gspy.gspy.models.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{

	Device findById(long id);
}

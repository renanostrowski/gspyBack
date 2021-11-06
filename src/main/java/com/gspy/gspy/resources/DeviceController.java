package com.gspy.gspy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gspy.gspy.models.Device;
import com.gspy.gspy.repository.DeviceRepository;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@Autowired
	DeviceRepository deviceRepository;
	
	@GetMapping("/devices")
	public List<Device> listDevices() {
		return deviceRepository.findAll();
	}
	
	@GetMapping("/device/{id}")
	public Device getDevice(@PathVariable(name = "id") long id) {
		return deviceRepository.findById(id);
	}
	
	@PostMapping("/device")
	public Device saveDevice(@RequestBody Device device) {
		return deviceRepository.save(device);
	}
}

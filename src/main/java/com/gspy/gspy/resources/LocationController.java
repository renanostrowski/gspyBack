package com.gspy.gspy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gspy.gspy.repository.LocationRepository;
import com.gspy.gspy.models.Location;

@RestController
@RequestMapping(value = "/api")
public class LocationController {

	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping("/locations")
	public List<Location> listLocation() {
		return locationRepository.findAll();
	}
	
	@GetMapping("/location/{id}")
	public Location getLocation(@PathVariable(value = "id") long id) {
		return locationRepository.findById(id);
	}
	
	@PostMapping("/location")
	public Location saveLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
}

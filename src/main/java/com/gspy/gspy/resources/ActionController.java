package com.gspy.gspy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gspy.gspy.models.Action;
import com.gspy.gspy.repository.ActionRepository;

@RestController
@RequestMapping("/api")
public class ActionController {

	@Autowired
	ActionRepository actionRepository;
	
	@GetMapping("/actions")
	public List<Action> listActions() {
		return actionRepository.findAll();
	}
	
	@GetMapping("/action/{id}")
	public Action getAction(@PathVariable(name = "id") long id) {
		return actionRepository.getById(id);
	}
	
	@PostMapping("/action")
	public Action sabeAction(@RequestBody Action action) {
		return actionRepository.save(action);
	}
}

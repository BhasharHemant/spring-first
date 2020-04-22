package com.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fs.dto.BusProviderDto;
import com.fs.dto.JourneysWithBusProviderDto;
import com.fs.form.JourneyForm;
import com.fs.service.BusProviderService;
import com.fs.service.JourneyService;

@Controller
@RequestMapping("/planTravel.htm")
public class JourneyPlannerController {
	@Autowired
	private BusProviderService busProviderService;

	@Autowired
	private JourneyService journeysService;

	@RequestMapping(method = RequestMethod.GET)
	// alternate for above annotation is
	// @GetMapping
	public String getAllBusProvider(Model model) {
		List<BusProviderDto> busProviders = busProviderService.getBusProvider();
		model.addAttribute("busProviders", busProviders);
		return "plan-travel";

	}

	@RequestMapping(method = RequestMethod.POST)
	// alternate for above annotation is
	// @PostMapping
	public String searchJourneyController(@ModelAttribute JourneyForm form, Model model) {
		List<JourneysWithBusProviderDto> journeys = journeysService.searchJourneys(form);
		model.addAttribute("journeys", journeys);
		return "journeys";
	}

	

}

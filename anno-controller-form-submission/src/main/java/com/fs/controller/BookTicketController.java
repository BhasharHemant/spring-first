package com.fs.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fs.dto.JourneysWithBusProviderDto;
import com.fs.form.TicketForm;
import com.fs.service.JourneyService;
import com.fs.validator.BookTicketValidator;

@Controller
@RequestMapping("/book-ticket.htm")
public class BookTicketController {
	@Autowired
	private JourneyService journeysService;

	@Autowired
	private BookTicketValidator validator;

	@GetMapping
	public String bookTicket(@RequestParam int journeyId, Model model) {
		JourneysWithBusProviderDto bookJourney = journeysService.getJourneyForBooking(journeyId);
		TicketForm ticketForm = new TicketForm(bookJourney.getJourneyId(), bookJourney.getSource(),
				bookJourney.getDestination(), bookJourney.getTravelDate(), bookJourney.getCost(),
				bookJourney.getBusProviderName(), bookJourney.getBusProviderId());
		model.addAttribute("ticketForm", ticketForm);
		return "book-ticket";
	}

	@PostMapping
	public String insertTicket(@ModelAttribute("ticketForm") TicketForm ticketForm, Errors errors, Model model) {
		if (validator.supports(ticketForm.getClass())) {
			validator.validate(ticketForm, errors);
			if (errors.hasErrors()) {
				return "book-ticket";
			}
		}
		model.addAttribute("ticketId", new Random().nextInt());

		return "ticket-generation";
	}
}

package com.fs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fs.bo.JourneysWithBusProviderBo;
import com.fs.dao.GetJourneysDao;
import com.fs.dto.JourneysWithBusProviderDto;
import com.fs.form.JourneyForm;

@Service
public class JourneyService {
	@Autowired
	private GetJourneysDao dao;

	@Transactional(readOnly = true)
	public List<JourneysWithBusProviderDto> searchJourneys(JourneyForm form) {
		List<JourneysWithBusProviderDto> journeysDtos = new ArrayList<JourneysWithBusProviderDto>();

		List<JourneysWithBusProviderBo> journeys = dao.searchJourneys(form);

		journeys.forEach(journey -> {
			JourneysWithBusProviderDto dto = new JourneysWithBusProviderDto(journey.getJourneyId(), journey.getSource(),
					journey.getDestination(), journey.getTravelDate(), journey.getCost(),
					journey.getBusProviderBo().getBusProviderName(), journey.getBusProviderBo().getBusProviderId());
			journeysDtos.add(dto);
		});

		return journeysDtos;

	}

	public JourneysWithBusProviderDto getJourneyForBooking(int journeyId) {
		JourneysWithBusProviderBo journeyBo = dao.getJourney(journeyId);

		JourneysWithBusProviderDto dto = new JourneysWithBusProviderDto(journeyBo.getJourneyId(), journeyBo.getSource(),
				journeyBo.getDestination(), journeyBo.getTravelDate(), journeyBo.getCost(),
				journeyBo.getBusProviderBo().getBusProviderName(), journeyBo.getBusProviderBo().getBusProviderId());
		return dto;
	}

}

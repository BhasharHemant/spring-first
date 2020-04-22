package com.fs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fs.bo.BusProviderBo;
import com.fs.dao.GetBusProviderDao;
import com.fs.dto.BusProviderDto;

@Service
public class BusProviderService {
	@Autowired
	private GetBusProviderDao dao;

	@Transactional(readOnly = true)
	public List<BusProviderDto> getBusProvider() {

		List<BusProviderDto> dtos = new ArrayList<BusProviderDto>();

		List<BusProviderBo> busProviderBos = dao.fetchAllBusProviders();

		busProviderBos.forEach(bo -> {
			BusProviderDto dto = new BusProviderDto(bo.getBusProviderId(), bo.getBusProviderName());
			dtos.add(dto);
		});

		return dtos;

	}

}

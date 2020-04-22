package com.fs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fs.bo.BusProviderBo;

@Repository
public class GetBusProviderDao {
	private final String SQL_FETCH_BUS_PROVIDER = "select bus_provider_id,provider_nm,contact_nbr,email_addr,status from bus_provider";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<BusProviderBo> fetchAllBusProviders() {
		List<BusProviderBo> busProviderBos = new ArrayList<BusProviderBo>();

		return jdbcTemplate.query(SQL_FETCH_BUS_PROVIDER, (resultSet, rowNo) -> {
			BusProviderBo bo = new BusProviderBo(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5));
			return bo;
		});

	}

}

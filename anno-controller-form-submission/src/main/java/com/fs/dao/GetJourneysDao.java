package com.fs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fs.bo.BusProviderBo;
import com.fs.bo.JourneysWithBusProviderBo;
import com.fs.form.JourneyForm;

@Repository
public class GetJourneysDao {
	private final String SQL_SEARCH_JOURNEYS = "select j.journey_id,j.source,j.destination,j.travel_dt,j.cost,bp.bus_provider_id,bp.provider_nm,bp.contact_nbr,bp.email_addr,bp.status from journey j inner join bus_provider bp on j.bus_provider_id=bp.bus_provider_id where bp.bus_provider_id=? or (j.source=? and j.destination=?);";
	//private final String SQL_GET_JOURNEY_BY_ID="select j.journey_id,j.source,j.destination,j.travel_dt,j.cost,bp.bus_provider_id,bp.provider_nm from journey j inner join bus_provider bp on j.bus_provider_id=bp.bus_provider_id where journey_id=?";
	private final String SQL_GET_JOURNEY_BY_ID="select j.journey_id,j.source,j.destination,j.travel_dt,j.cost,bp.bus_provider_id,bp.provider_nm,bp.contact_nbr,bp.email_addr,bp.status from journey j inner join bus_provider bp on j.bus_provider_id=bp.bus_provider_id where journey_id=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<JourneysWithBusProviderBo> searchJourneys(JourneyForm form) {

		List<JourneysWithBusProviderBo> bos = new ArrayList<JourneysWithBusProviderBo>();
		return jdbcTemplate.query(SQL_SEARCH_JOURNEYS, new JourneyRowMapper(), new Object[] { form.getBusProviderId(), form.getSource(), form.getDestination() });

	}
	
	public JourneysWithBusProviderBo getJourney(int journeyId) {
		return (JourneysWithBusProviderBo) jdbcTemplate.queryForObject(SQL_GET_JOURNEY_BY_ID, new JourneyRowMapper(), new Object[] {journeyId});
		
		
	}
	
	private class JourneyRowMapper implements RowMapper<JourneysWithBusProviderBo>{

		@Override
		public JourneysWithBusProviderBo mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
				JourneysWithBusProviderBo bo = new JourneysWithBusProviderBo(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getDate(4), resultSet.getDouble(5),
						new BusProviderBo(resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8),
								resultSet.getString(9), resultSet.getString(10)));

				return bo;
				
			//}, new Object[] { form.getBusProviderId(), form.getSource(), form.getDestination() });
			
			
			// TODO Auto-generated method stub
			//return null;
				
			/*
			 * (resultSet, rowNo) -> { JourneysWithBusProviderBo bo = new
			 * JourneysWithBusProviderBo(resultSet.getInt(1), resultSet.getString(2),
			 * resultSet.getString(3), resultSet.getDate(4), resultSet.getDouble(5), new
			 * BusProviderBo(resultSet.getInt(6), resultSet.getString(7),
			 * resultSet.getString(8), resultSet.getString(9), resultSet.getString(10)));
			 * 
			 * return bo;
			 * 
			 * },
			 */
				
		}

		
		
		
	}

}

package com.urlshortener.model.mapper;
import com.urlshortener.model.dto.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ShortUrlMapper implements RowMapper<UrlMappingList>{
	public UrlMappingList mapRow(ResultSet rs, int rowNum) throws SQLException {
		  UrlMappingList urlList = new UrlMappingList();
		  try{
			  urlList.setShortUrl(rs.getString("shortUrl"));
		  }
		  catch(Exception e){
			  
		  }
		  
	      return urlList;
	   }

}

package com.count.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.count.domain.Record;
import com.count.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired HomeRepository homeRepository;
	
	public List<Record> getRecords() {
		
		return homeRepository.findAll();
	}

}

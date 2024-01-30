package com.raghu.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonService implements ISeasonService {

	@Override
	public String findSeason() {
		// get system date
		LocalDate id=LocalDate.now();
		//get current month
		int month=id.getMonthValue();
		if(month>=7 && month<=9)
			return"Rainy Season";
		else if(month>=3 && month<=6)
			return"Summer Season";
		else
			return"Winter Season";
		
	}

}

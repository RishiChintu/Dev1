package com.example.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.example.dto.LaptopsDto;
import com.example.dto.TvDto;
import com.example.dto.WatchesDto;
import com.example.entity.Laptops;
import com.example.entity.Tv;
import com.example.entity.Watches;

public interface ProductsService {
	
	List<Watches> getAllWatches(); 

	 

	JSONObject saveWatches(Watches watches); 

	 

	JSONObject updateWatch(WatchesDto watchDto, int productId); 

	 

	JSONObject delateWatch(int id); 

	 

	List<Laptops> getAllLaptops(); 

	 

	JSONObject saveLaptops(Laptops laptop); 

	 

	JSONObject updateLaptops(LaptopsDto laptopDto, int productId); 

	 

	JSONObject delateLaptops(int id); 

	 

	List<Tv> getAllTvs(); 

	 

	JSONObject saveTvs(Tv tv); 

	 

	JSONObject updateTvs(TvDto tvDto, int productId); 

	 

	JSONObject delateTvs(int id); 

	 

	} 



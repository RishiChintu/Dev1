package com.example.controller;
import java.util.List; 

import org.json.simple.JSONObject; 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.web.bind.annotation.DeleteMapping; 

import org.springframework.web.bind.annotation.GetMapping; 

import org.springframework.web.bind.annotation.PathVariable; 

import org.springframework.web.bind.annotation.PostMapping; 

import org.springframework.web.bind.annotation.PutMapping; 

import org.springframework.web.bind.annotation.RequestBody; 

import org.springframework.web.bind.annotation.RequestMapping; 

import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LaptopDto;
import com.example.dto.LaptopsDto;
import com.example.dto.TvDto;
import com.example.dto.TvsDto;
import com.example.dto.WatchDto;
import com.example.dto.WatchesDto;
import com.example.entity.Laptops;
import com.example.entity.Tv;
import com.example.entity.Watches;
import com.example.service.ProductsService; 


@RestController 

@RequestMapping("/ecom") 

public class Products { 

@Autowired(required = true) 

private ProductsService productsServ; 

 

@GetMapping(value="/getAllWatches") 

public List<Watches> getAllWatches() 

{ 

 return productsServ.getAllWatches(); 

 

} 

@PostMapping(value="/saveWatches") 

public JSONObject saveWatches(@RequestBody WatchDto watchDto)  

{ 

Watches watches=new Watches(watchDto.getId(),watchDto.getBrand(),watchDto.getType(),watchDto.getWaterResistance(),watchDto.getPrice()); 

return productsServ.saveWatches(watches); 

 

 

} 

@PutMapping(value="/updateWatches/{productId}") 

public JSONObject updateWatch(@RequestBody WatchesDto watchDto,@PathVariable int productId) 

{ 

return productsServ.updateWatch(watchDto, productId); 

     

} 

@DeleteMapping(value="/deleteWatches/{id}") 

public JSONObject delateWatch(@PathVariable int id) 

{ 

return productsServ.delateWatch(id); 

 

 

} 

@GetMapping(value="/getAllLaptops") 

public List<Laptops> getAllLaptops() 

{ 

 return productsServ.getAllLaptops(); 

  

} 

@PostMapping(value="/saveLaptops") 

public JSONObject saveLaptops(@RequestBody LaptopDto laptopDto) { 

Laptops laptop=new Laptops(laptopDto.getId(),laptopDto.getBrand(),laptopDto.getOs(),laptopDto.getProcessor(),laptopDto.getPrice()); 

return productsServ.saveLaptops(laptop); 

 

} 

@PutMapping(value="/updateLaptops/{productId}") 

public JSONObject updateLaptops(@RequestBody LaptopsDto laptopDto,@PathVariable int productId) 

{ 

return productsServ.updateLaptops(laptopDto, productId); 

 

} 

@DeleteMapping(value="/deleteLaptops/{id}") 

public JSONObject delateLaptops(@PathVariable int id) 

{ 

return productsServ.delateLaptops(id); 

 

} 

@GetMapping(value="/getTvs") 

public List<Tv> getAllTvs() 

{ 

 return productsServ.getAllTvs(); 

  

} 

@PostMapping(value="/saveTvs") 

public JSONObject saveTvs(@RequestBody TvsDto tvDto) { 

Tv tv=new Tv(tvDto.getId(),tvDto.getBrand(),tvDto.getDisplayType(),tvDto.getDisplaySize(),tvDto.getPrice()); 

return productsServ.saveTvs(tv); 

 

 

} 

@PutMapping(value="/updateTvs/{productId}") 

public JSONObject updateTvs(@RequestBody TvDto tvDto,@PathVariable int productId) 

{ 

return productsServ.updateTvs(tvDto, productId); 

 

 

} 

@DeleteMapping(value="/deleteTvs/{id}") 

public JSONObject delateTvs(@PathVariable int id) 

{ 

return productsServ.delateTvs(id); 

 

} 

 

} 
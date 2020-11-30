package com.dukaandari.dukaan;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class DukaanController {
	@Autowired
	DukaanService dukaanservice;
	
	@RequestMapping("/dukaan")
	@CrossOrigin(origins = "http://localhost:3000")
	public ArrayList<Dukaan> getAllDukaans(){
		return dukaanservice.getAllDukaans();
	}
	
	@RequestMapping("/dukaan/{shopkeeper}")
	@CrossOrigin(origins = "http://localhost:3000")
	public Dukaan getDukaan(@PathVariable long shopkeeper) {                              //get  or   read
		return dukaanservice.getDukaan(shopkeeper);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/dukaan")
	@CrossOrigin(origins = "http://localhost:3000")
	public void addDukaan(@RequestBody Dukaan dukaan) {                            //  post   or   create 
		dukaanservice.addDukaan(dukaan);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/dukaan")
	@CrossOrigin(origins = "http://localhost:3000")
	public void updateDukaan(@RequestBody Dukaan dukaan) {                            //  put   or   update 
		dukaanservice.updateDukaan(dukaan);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE , value="/dukaan/{shopkeeper}")
	@CrossOrigin(origins = "http://localhost:3000")
	public void deleteDukaan(@PathVariable long shopkeeper) {
		dukaanservice.deleteDukaan(shopkeeper);
	}
}

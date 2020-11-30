package com.dukaandari.dukaan;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DukaanService {
	@Autowired
	DukaanRepo dukaanrepo;
	
	public ArrayList<Dukaan> getAllDukaans(){
		ArrayList<Dukaan> dukaan= new ArrayList<Dukaan>();
	//	dukaan =(ArrayList<Dukaan>) dukaanrepo.findAll();
		dukaanrepo.findAll().forEach(dukaan :: add);
		return dukaan;
	}
	
	public Dukaan getDukaan(long shopkeeper) {                              //get  or   read
		return dukaanrepo.findById(shopkeeper).orElse(null);
	}
	
	public void addDukaan(Dukaan dukaan) {                            //  post   or   create 
		dukaanrepo.save(dukaan);
	}
	
	public void updateDukaan(Dukaan dukaan) {                            //  put   or   update 
		dukaanrepo.save(dukaan);
	}
	
	public void deleteDukaan(long shopkeeper) {
		dukaanrepo.deleteById(shopkeeper);
	}
	

}

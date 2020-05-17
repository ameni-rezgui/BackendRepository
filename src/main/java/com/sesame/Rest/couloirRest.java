package com.sesame.Rest;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Centre_Visite;
import com.sesame.DAO.Chef_couloir;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.couloir;
import com.sesame.MetierService.Centre_visiteMetierInterface;
import com.sesame.MetierService.Chef_CouloirMetierInterface;
import com.sesame.MetierService.coulirMetierInterface;
import com.sesame.service.type_vehiculeMetierInterfaceImpl;
@RestController
@RequestMapping("/couloir")
@CrossOrigin("*")
public class couloirRest {

	@Autowired
	private coulirMetierInterface COF;
	@Autowired 
	private Centre_visiteMetierInterface CF;
	@Autowired 
	private Chef_CouloirMetierInterface chefF;
	@Autowired 
	private type_vehiculeMetierInterfaceImpl typef;
	

	@PostMapping("/add/{idcentre}/{idtypev}/{idchef}")
	public couloir save(@RequestBody couloir couloir, @PathVariable Long  idcentre
			,@PathVariable Long  idtypev,@PathVariable Long  idchef) {
		
			Centre_Visite cv = new Centre_Visite();
			Chef_couloir chefcouloir=new Chef_couloir();
			Type_vehicule typev=new Type_vehicule();
			chefcouloir=chefF.getId(idchef);
			cv=CF.getId(idcentre);
			typev=typef.getId(idtypev);
			couloir.setCentre_Visite(cv);
			couloir.setChef_couloir(chefcouloir);
			couloir.setType_vehicule(typev);
			return COF.add(couloir);
	
	}

	@GetMapping("/get")
	public Collection<couloir> findALL() {
		return COF.getAll();
	}

	@GetMapping("/get/{id}")
	public couloir findById(@PathVariable Long id) {
		return COF.getId(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCouloir(@PathVariable(value = "id") Long Id) {

		couloir couloir = COF.getId(Id);

		COF.delete(couloir.getNumero_Couloir());

		return ResponseEntity.ok().build();
	}

	@PutMapping("/update/{id}")
	public couloir updateCompte(@PathVariable(value = "id") Long Id, @Valid @RequestBody couloir couloirDetails) {

		couloir couloir = COF.getId(Id);

		couloir.setChef_couloir(couloirDetails.getChef_couloir());
		couloir.setCentre_Visite(couloirDetails.getCentre_Visite());

		couloir updatedcouloir = COF.add(couloir);
		return updatedcouloir;
	}
}

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

import com.sesame.DAO.Chef_couloir;
import com.sesame.MetierService.Chef_CouloirMetierInterface;

@RestController
@RequestMapping("/chef_coulir")
@CrossOrigin("*")
public class chef_coulir {
	@Autowired(required = false)
	private Chef_CouloirMetierInterface CF;

	@PostMapping("/add")
	public Chef_couloir save(@RequestBody Chef_couloir chef) {
		if (chef != null) {
			return CF.add(chef);
		}
		return null;
	}

	@GetMapping("/get")
	public Collection<Chef_couloir> findALL() {
		return CF.getAll();
	}

	@GetMapping("/get/{id}")
	public Chef_couloir findById(@PathVariable Long id) {
		return CF.getId(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteChef(@PathVariable(value = "id") Long chefId) {
		Chef_couloir chef = CF.getId(chefId);

		CF.delete(chef.getID_CL());

		return ResponseEntity.ok().build();
	}

	@PutMapping("/update/{id}")
	public Chef_couloir updateAdresse(@PathVariable(value = "id") Long Id, @Valid @RequestBody Chef_couloir chefDetails) {

		Chef_couloir chef = CF.getId(Id);

		chef.setNom_Ch(chefDetails.getNom_Ch());
		chef.setPrenom_Ch(chefDetails.getPrenom_Ch());

		Chef_couloir updatedchef = CF.add(chef);
		return updatedchef;
	}

}

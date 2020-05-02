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
import com.sesame.DAO.Rendez_vous;
import com.sesame.DAO.vehicule;
import com.sesame.MetierService.Centre_visiteMetierInterface;
import com.sesame.MetierService.Rendez_VousMetierInterface;
import com.sesame.MetierService.VehiculeMetierInterface;
@RestController
@RequestMapping("/rendez_vous")
@CrossOrigin("*")
public class rendez_vous {

	@Autowired(required = false)
	private Rendez_VousMetierInterface CF;
	@Autowired
	private VehiculeMetierInterface VF;
	@Autowired
	private Centre_visiteMetierInterface CVF;
	

	@PostMapping("/add/{idvehicule}/{idcentre}")
	public Rendez_vous save(@RequestBody Rendez_vous rdv, @PathVariable long idv, @PathVariable long idc)
	{
		if (rdv != null) {
			vehicule vh= new vehicule();
			Centre_Visite CV=new Centre_Visite();
			vh=VF.getId(idv);
			CV=CVF.getId(idc);
			rdv.setCentre_ID(idc);
			rdv.setVehicule(vh);
			return CF.add(rdv);
		}
		return null;
	}

	@GetMapping("/get")
	public Collection<Rendez_vous> findALL() {
		return CF.getAll();
	}

	@GetMapping("/get/{id}")
	public Rendez_vous findById(@PathVariable Long id) {
		return CF.getId(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRendezVous(@PathVariable(value = "id") Long Id) {

		Rendez_vous rdv = CF.getId(Id);

		CF.delete(rdv.getCentre_ID());

		return ResponseEntity.ok().build();
	}

	@PutMapping("/update/{id}")
	public Rendez_vous update(@PathVariable(value = "id") Long Id, @Valid @RequestBody Rendez_vous rdvDetails) {

		Rendez_vous rdv = CF.getId(Id);

		rdv.setStart(rdvDetails.getStart());
		rdv.setHeure(rdvDetails.getHeure());

		Rendez_vous updatedrdv = CF.add(rdv);
		return updatedrdv;
	}
}

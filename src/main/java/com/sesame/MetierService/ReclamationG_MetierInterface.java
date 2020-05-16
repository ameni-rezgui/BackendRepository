package com.sesame.MetierService;

import java.util.List;


import com.sesame.DAO.ReclamationGenerique;

public interface ReclamationG_MetierInterface {
	public ReclamationGenerique getId(long id);
	public void delete(long id);
	public  ReclamationGenerique add(ReclamationGenerique Reclamation);
	public List<ReclamationGenerique> getAll();

}

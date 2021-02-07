package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.*;

public class TypeDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Quiz");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();
	

	public Typeq Recherche_TypeById (String id)
	{
 	
		
 	return em.find(Typeq.class, id);
 		
	} 
 
	
	public void addType(Typeq t1) {
		tx.begin();
		em.persist(t1);
		tx.commit();
	
	}
	
	public void deleteType(String idTypeq ) {
		Typeq type = em.find(Typeq.class, idTypeq);
		
		tx.begin();
	//	em.createQuery("remove forme typeq where idTypeq=" +idTypeq);
		em.remove(type);
		tx.commit();
		
	}
	
	public List<Typeq> getAll(){
	Query query = em.createQuery("SELECT t FROM Typeq t");
	List<Typeq> types = query.getResultList();
	
	return types;
		
	}
}

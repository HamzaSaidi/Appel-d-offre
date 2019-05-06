package Service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Enitities.AppelDoffre;
import ServiceInterface.AppelDoffreRemote;

@Stateless
public class AppelDoffreEJB implements AppelDoffreRemote{
@PersistenceContext
EntityManager em;
	@Override
	public void AddAppelDoffre(AppelDoffre A) {
		em.persist(A);
		
	}
	@Override
	public void RemoveAppelDoffre(AppelDoffre A) {
em.remove(A);		
	}
	@Override
	public List<AppelDoffre> getALLAppelDoffre() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT * from appeldoffre").getResultList();
	}
	@Override
	public AppelDoffre findAppelDoffreById(int id) {
		// TODO Auto-generated method stub
		return em.find(AppelDoffre.class,id);
	}
	


}

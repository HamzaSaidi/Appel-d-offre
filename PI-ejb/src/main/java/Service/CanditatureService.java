package Service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Enitities.Canditature;
import ServiceInterface.CanditatureRemote;

@Stateless
public class CanditatureService implements CanditatureRemote{
@PersistenceContext
EntityManager em;
	@Override
	public void ApllyForJob(Canditature canditature) {
		em.persist(canditature);
			}

}

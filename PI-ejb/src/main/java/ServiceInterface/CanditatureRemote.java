package ServiceInterface;

import javax.ejb.Remote;

import Enitities.Canditature;

@Remote
public interface CanditatureRemote {
	
	public void ApllyForJob(Canditature canditature);
	

}

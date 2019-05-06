package ServiceInterface;

import java.util.List;

import javax.ejb.Remote;

import Enitities.AppelDoffre;

@Remote
public interface AppelDoffreRemote {
	
	public void AddAppelDoffre(AppelDoffre A);
	public void RemoveAppelDoffre(AppelDoffre A);
	public List<AppelDoffre> getALLAppelDoffre();
	public AppelDoffre findAppelDoffreById(int id);

}

package managedBeans;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import Enitities.AppelDoffre;
import Service.AppelDoffreEJB;




@ManagedBean(name = "Jobs")
@ApplicationScoped
public class Jobs {
	@EJB
	AppelDoffreEJB aplEJB;
	private Date date;
	private String description;
	private int id;
	private AppelDoffre SelectedAplDoffre;
	private List<AppelDoffre> appelDoffres;

	public List<AppelDoffre> getAppelDoffres() {
		
		return aplEJB.getALLAppelDoffre();
	}

	public void setAppelDoffres(List<AppelDoffre> appelDoffres) {
		this.appelDoffres = appelDoffres;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AppelDoffre getSelectedAplDoffre() {
		return SelectedAplDoffre;
	}

	public void setSelectedAplDoffre(AppelDoffre selectedAplDoffre) {
		SelectedAplDoffre = selectedAplDoffre;
	}

	public void addApplDoffre() {
		AppelDoffre A = new AppelDoffre();
		A.setDate(date);
		A.setDescription(description);

		aplEJB.AddAppelDoffre(A);

	}

}

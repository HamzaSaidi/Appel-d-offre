package Enitities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AppelDoffre
 *
 */
@Entity
@Table(name="appeldoffre")

public class AppelDoffre implements Serializable {

	   
	@Id
	private int Id;
	private String Description;
	private Date Date;
	@OneToMany(cascade=CascadeType.REMOVE,mappedBy="appeldoffre")
	List<Canditature> canditatures;
	private static final long serialVersionUID = 1L;

	public AppelDoffre() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public Date getDate() {
		return this.Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}
   
}

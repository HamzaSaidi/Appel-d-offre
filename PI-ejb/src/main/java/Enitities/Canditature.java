package Enitities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.xml.registry.infomodel.EmailAddress;

/**
 * Entity implementation class for Entity: Canditature
 *
 */
@Entity

public class Canditature implements Serializable {

	   
	@Id
	private int Id;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] Cv;
	
	private String Email;
	@ManyToOne
	private AppelDoffre appeldoffre;
	private static final long serialVersionUID = 1L;

	public Canditature() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	
	public byte[] getCv() {
		return Cv;
	}
	public void setCv(byte[] cv) {
		Cv = cv;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
   
}

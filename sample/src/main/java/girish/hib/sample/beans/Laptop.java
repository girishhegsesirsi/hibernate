package girish.hib.sample.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
@Id
	private String lname;
	private int lid;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
}

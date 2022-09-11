package mx.com.axity.userservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5883983818218341547L;

	private int idUser, dsAge;
	private String dsName, dsEmail, dsPassword, dsRFC;
	private List<AddressTO> address;
	/**
	 * @return the idUser
	 */
	public int getUserId() {
		return idUser;
	}

	/**
	 * @param userId the idUser to set
	 */
	public void setUserId(int userId) {
		this.idUser = userId;
	}

	/**
	 * @return the dsName
	 */
	public String getdsName() {
		return dsName;
	}

	/**
	 * @param name the dsName to set
	 */
	public void setdsName(String name) {
		this.dsName = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return dsAge;
	}

	/**
	 * @param Age the dsAge to set
	 */
	public void setdsAge(int Age) {
		this.dsAge = Age;
	}

	/**
	 * @return the dsEmail
	 */
	public String getdsEmail() {
		return dsEmail;
	}

	/**
	 * @param dsEmail the dsEmail to set
	 */
	public void setdsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	/**
	 * @return the dsPassword
	 */
	public String getdsPassword() {
		return dsPassword;
	}

	/**
	 * @param dsPassword the dsPassword to set
	 */
	public void setdsPassword(String dsPassword) {
		this.dsPassword = dsPassword;
	}

	/**
	 * @return the dsRFC
	 */
	public String getdsRFC() {
		return dsRFC;
	}

	/**
	 * @param rfc the dsRFC to set
	 */
	public void setdsRFC(String rfc) {
		this.dsRFC = rfc;
	}

	public List<AddressTO> getAddress(){
		return address;
	}

	public void setAddress(List<AddressTO> address){
		this.address = address;
	}

	/*
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("userId", this.idUser)
				.append("dsName", this.dsName)
				.append("dsAge", this.dsAge)
				.append("dsEmail", this.dsEmail)
				.append("dsPassword", this.dsPassword)
				.append("userInformationId", this.dsRFC)
				.append("Address", this.address)
				.toString();
	}

}

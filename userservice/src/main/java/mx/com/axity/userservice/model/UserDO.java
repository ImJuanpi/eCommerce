package mx.com.axity.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "user")
public class UserDO implements Comparable<UserDO> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private int idUser;
	
	@Column(name = "name")
	private String dsName;
	
	@Column(name = "age")
	private int dsAge;
	
	@Column(name = "email")
	private String dsEmail;

	@Column(name = "password")
	private String dsPassword;

	@Column(name = "rfc")
	private String dsRFC;
	
	protected UserDO () {
		
	}
	
	public UserDO (int idUser, String dsName, int dsAge, String dsEmail, String dsPassword, String dsRFC) {
		
		this.idUser = idUser;
		this.dsName = dsName;
		this.dsAge = dsAge;
		this.dsEmail = dsEmail;
		this.dsPassword = dsPassword;
		this.dsRFC = dsRFC;
	}
	

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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.idUser).toHashCode();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object object) {

		boolean isEquals = false;

		if (this == object) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			UserDO that = (UserDO) object;
			isEquals = new EqualsBuilder().append(this.idUser, that.idUser).isEquals();
		}
		return isEquals;
	}
	
	/**
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
				.append("dsRFC", this.dsRFC)
				.toString();
	}

	
	@Override
	public int compareTo(UserDO o) {
		return new CompareToBuilder().append(this.idUser, o.idUser).toComparison();
	}

}

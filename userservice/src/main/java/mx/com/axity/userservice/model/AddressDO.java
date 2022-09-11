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
@Table(name = "address")
public class AddressDO implements Comparable<AddressDO>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAddress")
    private int idAddress;

    @Column(name = "state")
    private String dsState;

    @Column(name = "street")
    private String dsStreet;

    @Column(name = "number")
    private String dsNumber;

    @Column(name = "cp")
    private int dsCP;

    @Column(name = "user_idUser")
    private int user;

    protected AddressDO(){

    }

    public AddressDO(int idAddress, String dsState, String dsStreet, String dsNumber, int dsCP, int user){
        this.idAddress = idAddress;
        this.dsState = dsState;
        this.dsStreet = dsStreet;
        this.dsNumber = dsNumber;
        this.dsCP = dsCP;
        this.user = user;
    }

    //We define methods
    public int getIdAddress(){
        return idAddress;
    }

    public void setIdAddress(int idAddress){
        this.idAddress = idAddress;
    }

    public String getDsState(){
        return dsState;
    }

    public void setDsState(String dsState){
        this.dsState = dsState;
    }

    public String getDsStreet(){
        return dsStreet;
    }

    public void setDsStreet(String dsStreet){
        this.dsStreet = dsStreet;
    }

    public String getDsNumber(){
        return dsNumber;
    }

    public void setDsNumber(String dsNumber){
        this.dsNumber = dsNumber;
    }

    public int getDsCP(){
        return dsCP;
    }

    public void setDsCP(int dsCP){
        this.dsCP = dsCP;
    }

    public int getDsUser_idUser(){
        return user;
    }

    public void setDsUser_idUser(int dsUser_idUser){
        this.user = dsUser_idUser;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.idAddress).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            AddressDO that = (AddressDO) object;
            isEquals = new EqualsBuilder().append(this.idAddress, that.idAddress).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(AddressDO o) {
        return new CompareToBuilder().append(this.idAddress, o.idAddress).toComparison();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("IdAddress", this.idAddress)
                .append("dsState", this.dsState)
                .append("dsStreet", this.dsStreet)
                .append("dsNumber", this.dsNumber)
                .append("dsCP", this.dsCP)
                .append("dsUser_idUser", this.user)
                .toString();
    }

}

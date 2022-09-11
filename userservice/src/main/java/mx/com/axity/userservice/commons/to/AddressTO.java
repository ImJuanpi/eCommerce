package mx.com.axity.userservice.commons.to;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class AddressTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3689346877580023771L;

    //We set variables
    private int idAddress, dsCP, user;
    private String dsState, dsStreet, dsNumber;

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

package mx.com.axity.productservice.model;

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
@Table(name = "media")
public class MediaDO implements Comparable<MediaDO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMedia")
    private int idMedia;

    @Column(name = "type")
    private String dsType;

    protected MediaDO(){

    }

    public MediaDO(int idMedia, String dsType){
        this.idMedia = idMedia;
        this.dsType = dsType;
    }

    //Methods
    public int getIdMedia(){
        return idMedia;
    }

    public void setIdMedia(int idMedia){
        this.idMedia = idMedia;
    }

    public String getDsType(){
        return dsType;
    }

    public void setDsType(String dsType){
        this.dsType = dsType;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.idMedia).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            MediaDO that = (MediaDO) object;
            isEquals = new EqualsBuilder().append(this.idMedia, that.idMedia).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(MediaDO o) {
        return new CompareToBuilder().append(this.idMedia, o.idMedia).toComparison();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("idMedia", this.idMedia)
                .append("dsType", this.dsType)
                .toString();
    }
}

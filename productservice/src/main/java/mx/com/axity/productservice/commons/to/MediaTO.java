package mx.com.axity.productservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MediaTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 5883983818218341547L;

    private int idMedia;
    private String dsType;
    /**
     * @return the idMedia
     */
    public int getIdMedia() {
        return idMedia;
    }

    /**
     * @param idMedia the idMedia to set
     */
    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    /**
     * @return the dsType
     */
    public String getDsType() {
        return dsType;
    }

    /**
     * @param dsType the dsType to set
     */
    public void setDsType(String dsType) {
        this.dsType = dsType;
    }


    /*
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("idMedia", this.idMedia)
                .append("dsType", this.dsType)
                .toString();
    }
}

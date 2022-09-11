package mx.com.axity.productservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CategoryTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5883983818218341547L;

    private int idCategory;
    private String dsCateg;
    /**
     * @return the idCategory
     */
    public int getIdCategory() {
        return idCategory;
    }

    /**
     * @param idCategory the idCategory to set
     */
    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    /**
     * @return the dsCateg
     */
    public String getDsCateg() {
        return dsCateg;
    }

    /**
     * @param dsCateg the dsCateg to set
     */
    public void setDsCateg(String dsCateg) {
        this.dsCateg = dsCateg;
    }


    /*
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("idCategory", this.idCategory)
                .append("dsCateg", this.dsCateg)
                .toString();
    }

}

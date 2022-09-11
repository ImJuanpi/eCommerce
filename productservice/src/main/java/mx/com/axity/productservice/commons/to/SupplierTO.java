package mx.com.axity.productservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SupplierTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5883983818218341547L;

    private int idSupplier;
    private String dsSupplier_name, dsAddress_supplier;

    /**
     * @return the idUser
     */
    public int getIdSupplier() {
        return idSupplier;
    }

    /**
     * @param idSupplier the idSupplier to set
     */
    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    /**
     * @return the dsSupplier_name
     */
    public String getDsSupplier_name() {
        return dsSupplier_name;
    }

    /**
     * @param dsSupplier_name the dsSupplier_name to set
     */
    public void setDsAddress_supplier(String dsSupplier_name) {
        this.dsSupplier_name = dsSupplier_name;
    }

    /**
     * @return the dsAddress_supplier
     */
    public String getDsAddress_supplier() {
        return dsAddress_supplier;
    }

    /**
     * @param dsAddress_supplier the dsAddress_supplier to set
     */
    public void setDsSupplier_name(String dsAddress_supplier) {
        this.dsAddress_supplier = dsAddress_supplier;
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("idSupplier", this.idSupplier)
                .append("dsSupplier_name", this.dsSupplier_name)
                .append("dsAddress_supplier", this.dsAddress_supplier)
                .toString();
    }
}

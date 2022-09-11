package mx.com.axity.productservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
public class ProductTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 5883983818218341557L;

    private int idProduct, dsInventory, dsSupplier_idSupplier, dsMedia_idMedia;
    private String dsName, dsDesc;
    private float dsPrice;
    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the dsInventory
     */
    public int getDsInventory() {
        return dsInventory;
    }

    /**
     * @param dsInventory the dsInventory to set
     */
    public void setDsInventory(int dsInventory) {
        this.dsInventory = dsInventory;
    }

    /**
     * @return the dsSupplier_idSupplier
     */
    public int getDsSupplier_idSupplier() {
        return dsSupplier_idSupplier;
    }

    /**
     * @param dsSupplier_idSupplier the dsSupplier_idSupplier to set
     */
    public void setDsSupplier_idSupplier(int dsSupplier_idSupplier) {
        this.dsSupplier_idSupplier = dsSupplier_idSupplier;
    }

    /**
     * @return the dsMedia_idMedia
     */
    public int getDsMedia_idMedia() {
        return dsMedia_idMedia;
    }

    /**
     * @param dsMedia_idMedia the dsMedia_idMedia to set
     */
    public void setDsMedia_idMedia(int dsMedia_idMedia) {
        this.dsMedia_idMedia = dsMedia_idMedia;
    }

    /**
     * @return the dsName
     */
    public String getDsName() {
        return dsName;
    }

    /**
     * @param dsName the dsName to set
     */
    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    /**
     * @return the dsDesc
     */
    public String getDsDesc() {
        return dsDesc;
    }

    /**
     * @param dsDesc the dsDesc to set
     */
    public void setDsDesc(String dsDesc) {
        this.dsDesc = dsDesc;
    }

    /**
     * @return the dsPrice
     */
    public float getDsPrice() {
        return dsPrice;
    }

    /**
     * @param dsPrice the dsPrice to set
     */
    public void setDsPrice(float dsPrice) {
        this.dsPrice = dsPrice;
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("idProduct", this.idProduct)
                .append("dsName", this.dsName)
                .append("dsDesc", this.dsDesc)
                .append("dsPrice", this.dsPrice)
                .append("dsInventory", this.dsInventory)
                .append("dsSupplier_idSupplier", this.dsSupplier_idSupplier)
                .append("dsMedia_idMedia", this.dsMedia_idMedia)
                .toString();
    }

}

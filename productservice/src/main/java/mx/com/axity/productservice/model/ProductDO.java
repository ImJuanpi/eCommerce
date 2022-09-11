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
@Table(name = "product")
public class ProductDO implements Comparable<ProductDO>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProduct")
    private int idProduct;

    @Column(name = "name")
    private String dsName;

    @Column(name = "desc")
    private String dsDesc;

    @Column(name = "price")
    private float dsPrice;

    @Column(name = "inventory")
    private int dsInventory;

    @Column(name = "supplier_idSupplier")
    private int dsSupplier_idSupplier;

    @Column(name = "media_idMedia")
    private int dsMedia_idMedia;

    protected ProductDO(){

    }

    public ProductDO(int idProduct, String dsName, String dsDesc, float dsPrice, int dsInventory, int dsSupplier_idSupplier, int dsMedia_idMedia){
        this.idProduct = idProduct;
        this.dsName = dsName;
        this.dsDesc = dsDesc;
        this.dsPrice = dsPrice;
        this.dsInventory = dsInventory;
        this.dsSupplier_idSupplier = dsSupplier_idSupplier;
        this.dsMedia_idMedia = dsMedia_idMedia;
    }

    //Methods
    public int getIdProduct(){
        return idProduct;
    }

    public void setIdProduct(int idProduct){
        this.idProduct = idProduct;
    }

    public String getDsName(){
        return dsName;
    }

    public void setDsName(String dsName){
        this.dsName = dsName;
    }

    public String getDsDesc(){
        return dsDesc;
    }

    public void setDsDesc(String dsDesc){
        this.dsDesc = dsDesc;
    }

    public float getDsPrice(){
        return dsPrice;
    }

    public void setDsPrice(float dsPrice){
        this.dsPrice = dsPrice;
    }

    public int getDsInventory(){
        return dsInventory;
    }

    public void setDsInventory(int dsInventory){
        this.dsInventory = dsInventory;
    }

    public int getDsSupplier_idSupplier(){
        return dsSupplier_idSupplier;
    }

    public void setDsSupplier_idSupplier(int dsSupplier_idSupplier){
        this.dsSupplier_idSupplier = dsSupplier_idSupplier;
    }

    public int getDsMedia_idMedia(){
        return dsMedia_idMedia;
    }

    public void setDsMedia_idMedia(int dsMedia_idMedia){
        this.dsMedia_idMedia = dsMedia_idMedia;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.idProduct).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            ProductDO that = (ProductDO) object;
            isEquals = new EqualsBuilder().append(this.idProduct, that.idProduct).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(ProductDO o) {
        return new CompareToBuilder().append(this.idProduct, o.idProduct).toComparison();
    }

    @Override
    public String toString(){
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

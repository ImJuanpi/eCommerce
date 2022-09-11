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
@Table(name = "supplier")
public class SupplierDO implements Comparable<SupplierDO> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSupplier")
    private int idSupplier;

    @Column(name = "supplier_name")
    private String dsSupplier_name;

    @Column(name = "address_supplier")
    private String dsAddress_supplier;

    protected SupplierDO(){

    }

    public SupplierDO(int idSupplier, String dsSupplier_name, String dsAddress_supplier){
        this.idSupplier = idSupplier;
        this.dsSupplier_name = dsSupplier_name;
        this.dsAddress_supplier = dsAddress_supplier;
    }

    //We define methods
    public int getIdSupplier(){
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier){
        this.idSupplier = idSupplier;
    }

    public String getDsSupplier_name(){
        return dsSupplier_name;
    }

    public void setDsSupplier_name(String dsSupplier_name){
        this.dsSupplier_name = dsSupplier_name;
    }

    public String getDsAddress_supplier(){
        return dsAddress_supplier;
    }

    public void setDsAddress_supplier(String dsAddress_supplier){
        this.dsAddress_supplier = dsAddress_supplier;
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.idSupplier).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            SupplierDO that = (SupplierDO) object;
            isEquals = new EqualsBuilder().append(this.idSupplier, that.idSupplier).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(SupplierDO o) {
        return new CompareToBuilder().append(this.idSupplier, o.idSupplier).toComparison();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("idSupplier", this.idSupplier)
                .append("dsSupplier_name", this.dsSupplier_name)
                .append("dsAddress_supplier", this.dsAddress_supplier)
                .toString();
    }
}

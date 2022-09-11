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
@Table(name = "category")
public class CategoryDO implements Comparable<CategoryDO>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCategory")
    private int idCategory;

    @Column(name = "categ")
    private String dsCateg;

    protected CategoryDO(){

    }

    public CategoryDO(int idCategory, String dsCateg){
        this.idCategory = idCategory;
        this.dsCateg = dsCateg;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.idCategory)
                .toHashCode();
    }

    //Methods
    public int getIdCategory(){
        return idCategory;
    }

    public void setIdCategory(int idCategory){
        this.idCategory = idCategory;
    }

    public String getDsCateg(){
        return dsCateg;
    }

    public void setDsCateg(String dsCateg){
        this.dsCateg = dsCateg;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            CategoryDO that = (CategoryDO) object;
            isEquals = new EqualsBuilder().append(this.idCategory, that.idCategory).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(CategoryDO o) {
        return new CompareToBuilder()
                .append(this.idCategory, o.idCategory)
                .toComparison();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("idCategory", this.idCategory)
                .append("dsCateg", this.dsCateg)
                .toString();
    }
}

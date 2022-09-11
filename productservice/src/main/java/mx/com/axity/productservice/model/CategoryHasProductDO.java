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
@Table(name = "category_has_product")
public class CategoryHasProductDO implements Comparable<CategoryHasProductDO>{

    @Id
    @Column(name = "category_idCategory")
    private int categoryidCategory;

    @Column(name = "product_idProduct")
    private int product_idProduct;

    protected CategoryHasProductDO(){

    }

    public CategoryHasProductDO(int categoryidCategory, int product_idProduct){
        this.categoryidCategory = categoryidCategory;
        this.product_idProduct = product_idProduct;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.categoryidCategory)
                .toHashCode();
    }

    //Methods
    public int getCategory_idCategory(){
        return categoryidCategory;
    }

    public void setCategory_idCategory(int category_idCategory){
        this.categoryidCategory = category_idCategory;
    }

    public int getProduct_idProduct(){
        return product_idProduct;
    }

    public void setProduct_idProduct(int product_idProduct){
        this.product_idProduct = product_idProduct;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        } else if (object != null && object.getClass().equals(this.getClass())) {
            CategoryHasProductDO that = (CategoryHasProductDO) object;
            isEquals = new EqualsBuilder().append(this.categoryidCategory, that.categoryidCategory).isEquals();
        }
        return isEquals;
    }

    @Override
    public int compareTo(CategoryHasProductDO o) {
        return new CompareToBuilder()
                .append(this.categoryidCategory, o.categoryidCategory)
                .toComparison();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("category_idCategory", this.categoryidCategory)
                .append("product_idProduct", this.product_idProduct)
                .toString();
    }
}

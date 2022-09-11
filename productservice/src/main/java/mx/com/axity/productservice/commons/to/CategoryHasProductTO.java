package mx.com.axity.productservice.commons.to;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CategoryHasProductTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 5883983818218341547L;

    private int categoryidCategory, product_idProduct;
    /**
     * @return the category_idCategory
     */
    public int getCategory_idCategory() {
        return categoryidCategory;
    }

    /**
     * @param category_idCategory the category_idCategory to set
     */
    public void setCategory_idCategory(int category_idCategory) {
        this.categoryidCategory = category_idCategory;
    }

    /**
     * @return the product_idProduct
     */
    public int getProduct_idProduct() {
        return product_idProduct;
    }

    /**
     * @param product_idProduct the product_idProduct to set
     */
    public void setProduct_idProduct(int product_idProduct) {
        this.product_idProduct = product_idProduct;
    }


    /*
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("category_idCategory", this.categoryidCategory)
                .append("product_idProduct", this.product_idProduct)
                .toString();
    }

}

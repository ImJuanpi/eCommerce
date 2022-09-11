package mx.com.axity.productservice.web.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import mx.com.axity.productservice.commons.to.CategoryHasProductTO;
import mx.com.axity.productservice.commons.to.CategoryTO;
import mx.com.axity.productservice.commons.to.MediaTO;
import mx.com.axity.productservice.commons.to.ProductTO;
import mx.com.axity.productservice.commons.to.SupplierTO;
import mx.com.axity.productservice.services.ICategoryHasProductService;
import mx.com.axity.productservice.services.ICategoryService;
import mx.com.axity.productservice.services.IMediaService;
import mx.com.axity.productservice.services.IProductService;
import mx.com.axity.productservice.services.ISupplierService;



@RestController
@RequestMapping("products/v1")
@Api(value = "serviceproduct")
public class ProductsController {

    static final Logger LOG = LogManager.getLogger(ProductsController.class);

    @Autowired
    ICategoryHasProductService categoryHasProductService;
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IMediaService mediaService;
    @Autowired
    IProductService productService;
    @Autowired
    ISupplierService supplierService;

    @GetMapping(value="/categoryhasproduct", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<CategoryHasProductTO>> getCategory_idCategory () {
        LOG.info("Se invoca GET /categoryhasproduct");
        List<CategoryHasProductTO> returnResponse = categoryHasProductService.getAll();
        return new ResponseEntity<List<CategoryHasProductTO>>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/category", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<CategoryTO>> getAllIdCategory () {
        LOG.info("Se invoca GET /category");
        List<CategoryTO> returnResponse = categoryService.getAll();
        return new ResponseEntity<List<CategoryTO>>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/category/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<CategoryTO> getIdCategory (@PathVariable("id") int id) {
        LOG.info("Se invoca GET /category");
        CategoryTO returnResponse = new CategoryTO();
        returnResponse = categoryService.getbyid(id);
        return new ResponseEntity<CategoryTO>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/media", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<MediaTO>> getIdMedia () {
        LOG.info("Se invoca GET /media");
        List<MediaTO> returnResponse = mediaService.getAll();
        return new ResponseEntity<List<MediaTO>>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/media/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<MediaTO> getIdMedia (@PathVariable("id") int id) {
        LOG.info("Se invoca GET /category");
        MediaTO returnResponse = new MediaTO();
        returnResponse = mediaService.getbyid(id);
        return new ResponseEntity<MediaTO>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/product", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ProductTO>> getIdProduct () {
        LOG.info("Se invoca GET /product");
        List<ProductTO> returnResponse = productService.getAll();
        return new ResponseEntity<List<ProductTO>>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/product/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ProductTO> getIdProduct (@PathVariable("id") int id) {
        LOG.info("Se invoca GET /category");
        ProductTO returnResponse = new ProductTO();
        returnResponse = productService.getbyid(id);
        return new ResponseEntity<ProductTO>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/supplier", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SupplierTO>> getIdSupplier () {
        LOG.info("Se invoca GET /supplier");
        List<SupplierTO> returnResponse = supplierService.getAll();
        return new ResponseEntity<List<SupplierTO>>(returnResponse, HttpStatus.OK);
    }

    @GetMapping(value="/supplier/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<SupplierTO> getIdSupplier (@PathVariable("id") int id) {
        LOG.info("Se invoca GET /category");
        SupplierTO returnResponse = new SupplierTO();
        returnResponse = supplierService.getbyid(id);
        return new ResponseEntity<SupplierTO>(returnResponse, HttpStatus.OK);
    }
}

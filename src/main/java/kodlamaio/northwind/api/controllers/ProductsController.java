package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired //kim product serviceyi implemente etmiş bakıyo(yani kim buradan kalıtım almış diye o sınıfı newliyo onun içeriisndende product daoyu buluyo ve newliyo  eşitliyo)
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")//http["getall"] asp.nette
	 public List<Product> getAll(){
		 return this.productService.getAll();
	 }
}

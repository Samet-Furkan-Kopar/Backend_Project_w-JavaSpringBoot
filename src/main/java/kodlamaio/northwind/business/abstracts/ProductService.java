package kodlamaio.northwind.business.abstracts;

import java.util.List;



import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);//productname ve category ıd getir
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);//productname veya category id getir

	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);//urun ismine gore arama
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);//bununla baslayanları getir
	
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}

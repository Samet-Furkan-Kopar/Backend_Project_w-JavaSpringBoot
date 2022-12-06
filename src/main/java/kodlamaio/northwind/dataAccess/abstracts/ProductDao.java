package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	                                   //product yerine category yazıp category tablosunada calisilabilir
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategoryId(String productName,int categoryId);//productname ve category ıd getir
	
	List<Product> getByProductNameOrCategoryId(String productName, int categoryId);//productname veya category id getir

	List<Product> getByCategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);//urun ismine gore arama
	
	List<Product> getByProductNameStartsWith(String productName);//bununla baslayanları getir
	
	@Query("From Product where productName=:productName and categoryId=:categoryId")//kapatti bunu
	List<Product> getByNameAndCategory(String productName, int categoryId);
}

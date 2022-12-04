package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
//birden fazla veri dönderebleceginden(product categories vs.) generic calismaliyiz
	private T data;
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data,boolean success) {
		super(success);//super base sınıfın constructorunu çalıştırmaya yarar
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	
	public T getData() {
		return this.data;
	}
	

	
}

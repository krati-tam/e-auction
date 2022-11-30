package model;

import jakarta.annotation.Generated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.aot.generate.GenerationContext;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.demo.entitity.Entity;
import com.example.demo.entitity.Id;
@EntityScan
@Table(name="")
public class product {


    
	@Id
    @GeneratedValue(strategy = GenerationContext.IDENTITY)
	
	private int ProductID;
	@Column(name="Product_Name", nullable=false, length=30)
	private String Product_Name;
	private String Short_Description;
	private String Detailed_Description;
	private String Category;
	private float Starting_Price;
	private int  Bid_end_date;
	
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	
	
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getShort_Description() {
		return Short_Description;
	}
	public void setShort_Description(String short_Description) {
		Short_Description = short_Description;
	}
	public String getDetailed_Description() {
		return Detailed_Description;
	}
	public void setDetailed_Description(String detailed_Description) {
		Detailed_Description = detailed_Description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public float getStarting_Price() {
		return Starting_Price;
	}
	public void setStarting_Price(float starting_Price) {
		Starting_Price = starting_Price;
	}
	public int getBid_end_date() {
		return Bid_end_date;
	}
	public void setBid_end_date(int bid_end_date) {
		Bid_end_date = bid_end_date;
	}
	
	
}

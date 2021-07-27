package cls;
 


import java.lang.*;
public class MainDish extends FoodItem {
	
private String category;

public void setCategory(String category){this.category=category;}
public String getCategory()  
{return category;} 



public  void showInfo( )
{
	    System.out.println("food id: "+fid);
		System.out.println("food name: "+name);
		System.out.println("quantity: "+availableQuantity);
		System.out.println("price of food: "+price);
		System.out.println("food category: "+category);
		System.out.println();
	
}
	 
}

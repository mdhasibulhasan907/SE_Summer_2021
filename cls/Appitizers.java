package cls;
 
import java.lang.*;
public class Appitizers extends FoodItem{
	
private String size;

public void setSize(String size){this.size=size;}
public String getSize(){return size;}

public   void showInfo( )
{
	    System.out.println("food id: "+fid);
		System.out.println("food name: "+name);
		System.out.println("quantity: "+availableQuantity);
		System.out.println("price of food: "+price);
		System.out.println("food size: "+size);
		System.out.println();
	
} 
}

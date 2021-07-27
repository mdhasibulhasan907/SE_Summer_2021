package cls;
import  Interface.*;


import java.lang.*;
public abstract class  FoodItem implements IQuantity

{
protected String fid;	
protected String name;
protected int availableQuantity;	
protected double price;	

public void setFid(String fid){this.fid=fid;}
public void setName(String name){this.name=name;}
public void setAvailableQuantity(int availableQuantity){this.availableQuantity=availableQuantity;}
public void setPrice(double price){this.price=price;}

public String getFid( ){return fid;}
public String getName( ){return name;}
public int getAvailableQuantity( ){return availableQuantity;}
public double getPrice( ){return price;}



 
public abstract void showInfo( );

public void addQuantity(int amount){ 
		if(amount>0)
		{
			System.out.println("Previous  money: "+ availableQuantity);
			System.out.println("present money:   "+ amount);
			availableQuantity += amount;
			System.out.println("Current money:   "+ availableQuantity);
		}
		else
		{
			System.out.println("not adding");
		}
	}
	
	
public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("before selling:	"+ availableQuantity);
			System.out.println("selling amount:	"+ amount);
			availableQuantity -= amount;
			System.out.println("total sell:	"+ availableQuantity);
		}
		else
		{
			System.out.println("do not sell");
		}
	}	
	
	
}
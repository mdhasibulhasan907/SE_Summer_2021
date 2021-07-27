package cls;
import  Interface.*;


import java.lang.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
    private String name;
	private FoodItem fooditems[ ]= new FoodItem[100];
  
        
    public void setRid(String rid){this.rid=rid;}
	public void setName(String name){this.name=name;}
	
	public String getRid() {return rid;}   
    public String getName(){ return name;}
     
	
	public void insertFoodItem(FoodItem f)
	{
		int flag = 0;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Inserted");
		}
		else
		{
			System.out.println("FoodItem Can Not be Inserted");
		}
	}
	
	
	public void removeFoodItem(FoodItem f)
	{
		int flag = 0;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Removed");
		}
		else
		{
			System.out.println("FoodItem Can Not be Removed");
		}
	}
	
	 
	
	
	public FoodItem getFoodItem(String fid)
	{
		FoodItem f = null;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFid() == fid)
				{
					f = fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	
	
	
	
	public void showAllFoodItems( ) 
	{
		for(FoodItem f : fooditems)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}
	
	 
	
	 
	 
}
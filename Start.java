import java.lang.*;
import java.util.*;
import java.io.*;
import cls.*;
import Interface.*;
import fileio.*;
 
public class Start
{
	
	 public static void main(String   args[])
	{
		 
		Scanner s = new Scanner(System.in);
		InputStreamReader i  = new InputStreamReader(System.in);
		BufferedReader b  = new BufferedReader(i );
		
		FileReadWrite  frw  = new FileReadWrite();
		
		FoodCourt f = new FoodCourt();
		
		boolean choice = true;
		while(choice)
		{
			System.out.println("Click one that you want:-?");
			System.out.println("\n 1.Employee Management \n 2.Restaurant Management \n 3.Restaurant FoodItem Management \n 4.FoodItem Quantity Add-Sell \n 5.Exit");
			 
			System.out.print("Clik no: ");
			int clik = s.nextInt();
			
			
			switch(clik)
			{
				 case 1:
				    System.out.println("-----------------------------------------");
 					System.out.println(" Employee Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("\n 1.Insert New Employee \n 2.Remove Existing Employee \n 3.Show All Employee \n 4.Get an Employee \n 5.Go Back");
				    System.out.print("Clik no: ");
					int no1 =  s.nextInt();
					switch(no1)	
					{
						 
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Employee");
							
							Employee e = new Employee();
							
							  			
							System.out.print("Enter Employee ID: ");
							int empId1 = s.nextInt();
							e.setEmpId(empId1);
							
							System.out.print("Enter Employee Name: ");
							String name1 = s.next();
							e.setName(name1);
							
							System.out.print("Enter Employee Salary: ");
							double salary1 = s.nextDouble();
							e.setSalary(salary1);
							
							
							f.insertEmployee(e);
							
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							int empId2 = s.nextInt();
							
							f.removeEmployee(f.getEmployee(empId2));

							System.out.println("-----------------------------------------");
							break;
						
						  
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Employees");
							
							f.showAllEmployees();
							
							System.out.println("-----------------------------------------");
							break;
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Get an Employee");
							
							System.out.print("Enter Employee ID: ");
						 
							int empId3 = s.nextInt();
						    
							Employee e3 = f.getEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee ID is: "+e3.getEmpId());
								System.out.println("Employee Name is: "+e3.getName());
								System.out.println("Employee Salary is: "+e3.getSalary());
							}
							else
							{
								 System.out.println("Employee Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
						  
					}
                  
				 
                   break;

                case 2:
				    
					System.out.println("-----------------------------------------");
					System.out.println("Restaurant Management:-");
					System.out.println("-----------------------------------------");
					
					System.out.println("Take any one:- ");
					System.out.println("\n 1.Insert New Restaurant \n 2.Remove Existing Restaurant \n 3.Show All Restaurants \n 4.Search a Restaurant \n 5.Go Back");
				    System.out.print("Clik no: ");
					int no2 = s.nextInt();
                    switch(no2)	
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Restaurant");
							
							Restaurant rest1 = new Restaurant();
									
							System.out.print("Enter Restaurant NID: ");
							String rid1 = s.next();
							rest1.setRid(rid1);
							String name1;
							System.out.print("Enter Restaurant Name: ");
							try
							{
								name1 = b.readLine(); 
							}
							catch(IOException ioe)
							{
								name1 = "defaultName";
							}
							rest1.setName(name1);
							
							f.insertRestaurant(rest1);
							
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant NID: ");
							String rid2 = s.next();
							
						 
							
							Restaurant rest2 = f.getRestaurant(rid2);
							f.removeRestaurant(rest2);

							System.out.println("-----------------------------------------");
							break;
						
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Restaurant");
							
							f.showAllRestaurants( );
							
							System.out.println("-----------------------------------------");
							break;
						
						
						
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Get a Restaurant");
							
							System.out.print("Enter Restaurant NID: ");
							String rid3 = s.next();
							
							Restaurant rest3 = f.getRestaurant(rid3);
							
							if(rest3 != null)
							{
								System.out.println("Restaurant RID: "+rest3.getRid());
								System.out.println("Restaurant Name: "+rest3.getName());
								rest3.showAllFoodItems( );
							}
							else
							{
								System.out.println("Restaurant Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						 
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
						
					}
                 break;
				 
				 
				 case 3:
				  
				     System.out.println("-----------------------------------------");
					System.out.println("Restaurant FoodItem Management:-");
					System.out.println("-----------------------------------------");
					
					System.out.println("Take any one:- ");
					System.out.println("\n 1.Insert New FoodItem \n 2.Remove Existing FooItem  \n 3.Show All FoodItems  \n 4.Search a FoodItem \n 5.Go Back");
				    System.out.print("YClik no:  ");
					int no3 = s.nextInt();
				      
					 switch(no3)	
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New FoodItem \n");
							System.out.println("Which Item of Food do you want?");
							System.out.println("1. MainDish");
							System.out.println("2. Appitizers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Item: ");
							int item = s.nextInt();
							
							FoodItem fi = null;
							
							if(item == 1)
							{
								System.out.print("Enter Food Id: ");
								String fo1=s.next();
								System.out.print("Enter Food Name: ");
								String fn1 = s.next();
								System.out.print("Enter Food  Quality : ");
								int fq1 = s.nextInt();
								System.out.print("Enter Food  Price : ");
								double fp1 = s.nextDouble();
								System.out.print("Enter Food  category : ");
								String  fc1 = s.next();
								
								
								
								MainDish ma = new MainDish();
								ma.setFid(fo1);
								ma.setName(fn1);
								ma.setAvailableQuantity(fq1);
								ma.setPrice(fp1);
								ma.setCategory(fc1);
								
								fi = ma;
								
							}
							else if(item == 2)
							{
								System.out.print("Enter Food Id: ");
								String fo1=s.next();
								System.out.print("Enter Food Name: ");
								String fn1 = s.next();
								System.out.print("Enter Food  Quality : ");
								int fq1 = s.nextInt();
								System.out.print("Enter Food  Price : ");
								double fp1 = s.nextDouble();
								System.out.print("Enter Food  Size : ");
								String  fs1 = s.next();
								
								
								
								Appitizers app = new Appitizers();
								app.setFid(fo1);
								app.setName(fn1);
								app.setAvailableQuantity(fq1);
								app.setPrice(fp1);
								app.setSize(fs1);
								
								fi = app;
							}
							else if(item == 3)
							{
								System.out.println("Going Back ...");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(fi!=null)
							{
								System.out.print("Enter Restaurant RID: ");
								String rid1 = s.next();
								
								f.getRestaurant(rid1).insertFoodItem(fi);
							}
						
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Food RID: ");
							String rid2 = s.next();
							System.out.print("Enter Food Number: ");
							String fn2 = s.next();/*
							System.out.print("Enter Food  Quality : ");
						    int fq2 = s.nextInt();
						    System.out.print("Enter Food  Price : ");
						    double fp2 = s.nextDouble();
							*/
							
							f.getRestaurant(rid2).removeFoodItem(f.getRestaurant(rid2).getFoodItem(fn2));
							
							 
							 

							System.out.println("-----------------------------------------");
							break;
						
						
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All FoodItem");
							
							System.out.print("Enter Food RID: ");
							String rid4 = s.next();
						
							f.getRestaurant(rid4).showAllFoodItems();
							
							System.out.println("-----------------------------------------");
							break;
						
  
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Get a Restaurant FoodItem");
							
							System.out.print("Enter Restaurant RID: ");
							String rid3 = s.next();
							System.out.print("Enter Food Number: ");
							String  fn3 = s.next();
							
							FoodItem fi3 = f.getRestaurant(rid3).getFoodItem(fn3);
							
							if(fi3 != null)
							{
								fi3.showInfo();
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						 
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
                 break;  
				 
				 
				 case 4:
				 
				     System.out.println("-----------------------------------------");
					System.out.println("FoodItem Quantity Add-Sell:-");
					System.out.println("-----------------------------------------");
					
					System.out.println("Take any one:- \n");
					System.out.println("\n 1.Add FoodItem \n 2.Sell FoodItem \n 3.Show Add Sell History \n 4.Go Back ");
				    System.out.print("Clik no:  ");
					int no4 = s.nextInt();
					  
					 switch(no4)	
					{
						case 1:
						
							System.out.println("-----------------------------------------");
							System.out.println("Add FoodItem ");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid1 = s.next();
							System.out.print("Enter Food Number: ");
							String fn1 = s.next();
							System.out.print("Enter Amount: ");
							int amount1 = s.nextInt();
							
							if(amount1>0)
							{
								 
								
								Restaurant rs = f.getRestaurant(rid1);
								FoodItem foi = rs.getFoodItem(fn1);
								foi.addQuantity(amount1);
								
								   
								frw.writeInFile("Add : $"+ amount1 +" in Food Number "+foi);
								
							}
							System.out.println("-----------------------------------------");
							break;
							
							
							
						case 2:
						
							System.out.println("-----------------------------------------");
							System.out.println("Sell FoodItem");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid2 = s.next();
							System.out.print("Enter Food  Number: ");
							String fn2 = s.next();
							System.out.print("Enter Amount: ");
							int amount2 = s.nextInt();
							
							
							if(amount2>0 && amount2 <= f.getRestaurant(rid2).getFoodItem(fn2).getPrice())
							{
								  
								Restaurant rs = f.getRestaurant(rid2);
								FoodItem foi = rs.getFoodItem(fn2);
								foi.sellQuantity(amount2);
								
								  
								frw.writeInFile("Sell : $"+ amount2 +" from Food Number "+fn2);
								
							}
							
							System.out.println("-----------------------------------------");
							break;

                        case 3:
						
							System.out.println("-----------------------------------------");
							System.out.println("Show Add Sell History");
							frw.readFromFile();
							System.out.println("-----------------------------------------");
							break;
							
						case 4:
						
							System.out.println("-----------------------------------------");
							System.out.println("Going back....");
							System.out.println("-----------------------------------------");
							break;
							
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;							
							
						
					}
                 break; 
				 
				 case 5:
					
					System.out.println("You have choosen to exit");
					choice = false;
					break;
					
				default:
				
					System.out.println(" Your choosen is Invalid  ");
					break;

				 
					  
	  
			}
			 
		}
		 
	}	 	 
}	 
package MAINTENANCE;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class UnderDevelopment {
	
	static ArrayList<String> Product = new ArrayList<String>();
	static ArrayList<String> Color = new ArrayList<String>();
	static ArrayList<String> Size = new ArrayList<String>();
	static ArrayList<Double> Payment = new ArrayList<Double>();
	static ArrayList<Integer> Quantity = new ArrayList<Integer>();
	static JFrame frame = new JFrame("Input Dialog");
	static DecimalFormat df = new DecimalFormat("#.00");
	static Scanner console = new Scanner(System.in);
	

	public void addItems(String item) {
		Product.add(item);
	}
	public void addColor(String color) {
		Color.add(color);	
	}
	public void addSize(String size) {
		Size.add(size);		
	}
	public void Payment(double TotalPayment) {
		Payment.add(TotalPayment);
	}
	public void Quantity(int quantity2) {
		Quantity.add(quantity2);
	}
	public void RemovedItem() {
		//Remove an item
		if(Product.size()==0) {
				JOptionPane.showMessageDialog(frame, "We can't process your request because your cart is Empty. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else {
			System.out.print("Enter item number: ");
			int ItemNo = console.nextInt();
			
			if(ItemNo >Product.size()) {
				JOptionPane.showMessageDialog(frame, "Sorry, We only accept numbers from 1"+Product.size() +". Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
				System.out.println("--------------------------------------------------------------------");	
				System.out.println("\n\tThe item " +Product.get(ItemNo-1) +" was successfully removed.");
				Product.remove(ItemNo-1);
				Color.remove(ItemNo-1);
				Size.remove(ItemNo-1);
				Payment.remove(ItemNo-1);
				Quantity.remove(ItemNo-1);
				}
			}		
		}
	public static void clearItem() {

		Product.clear();
		Color.clear();
		Size.clear();
		Quantity.clear();
		Payment.clear();
	}
}
class OutputDetails extends UnderDevelopment{
	
	public static void printproducts() {
		System.out.println("You have " + Product.size()+ " items in your cart");	//Print all the product you selected
		
		for (int i = 0; i<Product.size(); i++){
				System.out.println((i+1)+". "+Product.get(i));
				System.out.println("\tColor: "+Color.get(i)+"\n\tSize: "+Size.get(i)+"\n\tQuantity: " + Quantity.get(i));
				System.out.println("\tPrice:  $" + df.format(Payment.get(i)));
											 }
								}
}
class Development{
	
	void Menu() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t\t     Main Menu\n");
		System.out.println("[1] Purchase item");
		System.out.println("[2] Remove item");
		System.out.println("[3] view Cart");
		System.out.println("[4] Pay ");
		System.out.println("[5] Log out");
		System.out.print("Type here: ");
	}
	void TypeOfClothes() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t\tPlease select");
		System.out.print("\t[1] Men Apparel");
		System.out.println("\t\t\t[2] Women Apparel\n");
		System.out.print("Type here: ");
	}
	void MensApparel() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t    List of Mens Apparel available\n");
		System.out.print(" [1] Oversized T-shirt");
		System.out.print("\t  [2] Hoodie Jacket");
		System.out.println("\t[3] Mesh Shorts\n");
		System.out.print("Type here: ");
	}
	void womenApparel() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t  List of Womens Apparel available\n");
		System.out.print("[1] Ribbed Crop T-shirt");
		System.out.print("\t [2] Drifit Sport Bra");
		System.out.println("\t [3] Sweat Shorts\n");
		System.out.print("Type here: ");
	}
	void Colors() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t      List of color available\t\t\n");
		System.out.print("\t[1] White");
		System.out.print("\t\t[2] Black");
		System.out.println("\t\t[3] Gray\n");
		System.out.print("Type here: ");
	}
	void Size() {

		System.out.println("--------------------------------------------------------------------");
		System.out.println("\tList of Size available and its price ");
		System.out.println("[1] Small ----- $2.2");
		System.out.println("[2] Medium ---- $2.5");
		System.out.println("[3] large ----- $2.9");
		System.out.println("[4] XL ----- $3.2");
		System.out.print("Type here: ");
	}
	
}
class ADIOSException extends Exception{
	
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame("Input Dialog");
	public ADIOSException() {
		JOptionPane.showMessageDialog(frame, "We can't accept negative. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	}
	public ADIOSException(String message) {
		super(message);
	}
}
class UnderMaintenance{
	static JFrame frame = new JFrame("Input Dialog");
	static UnderDevelopment Data = new UnderDevelopment();
	static OutputDetails output = new OutputDetails();
	static Development Menu = new Development();
	static double sum =0;
	static double change;
	static DecimalFormat df = new DecimalFormat("#.00");
	static Scanner console = new Scanner(System.in);
	static int Quantity;
	static double Total;
	static double unpaid;

	public static void main(String[] args){
		
		int Mainchoice = 0;
		String name;
		String contact;
		String Address;
		int result;
		
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JOptionPane.showMessageDialog(null, "Welcome to ADIOS clothing", "\uD83D\uDE0A", JOptionPane.INFORMATION_MESSAGE);
	    
		while (true) {
		      // Show an input dialog that asks the user for their name
				name = JOptionPane.showInputDialog(frame, "Please enter your name: ", "Customer's information", JOptionPane.PLAIN_MESSAGE);
		      	if (name != null && !name.trim().isEmpty() && name.trim().matches(".*\\d+.*")) {
		      		JOptionPane.showMessageDialog(frame, "Your name cannot be a number or contain a number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		      	else if (name != null && !name.trim().isEmpty()) {
		      		break;
		      }
		      	else if (name != null && name.trim().isEmpty()) {
		        JOptionPane.showMessageDialog(frame, "You did not input a name. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		      }
		      	else {
		      		result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to cancel/exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
		       
		    	  		if (result == JOptionPane.YES_OPTION) {
		    	  			System.exit(0);
		    	  								}
		    	  		else {
		    	  			continue;
		    	  			}
		      }
		    }
		while (true) {
			  // Show an input dialog that asks the user for their contact
			  contact = JOptionPane.showInputDialog(frame, "Enter your Contact #: ", "Customer's information", JOptionPane.PLAIN_MESSAGE);

			  if (contact != null && !contact.isEmpty() && contact.matches("\\d+")) {
			    break;
			  }
			  else if (contact != null && !contact.isEmpty() && !contact.matches("\\d+")) {
			    JOptionPane.showMessageDialog(frame, "Your Contact # should not contain a character or negative. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
			  }
			  else if (contact != null && contact.isEmpty()) {
			    JOptionPane.showMessageDialog(frame, "You did not input a contact. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
			  }
			  else {
			    result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to cancel/exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
			    
			    if (result == JOptionPane.YES_OPTION) {
			      System.exit(0);
			    }
			    else {
			      continue;
			    }
			  }
			}
		while (true) {
		      // Show an input dialog that asks the user for their name
		     Address = JOptionPane.showInputDialog(frame, "Please enter your Address: ", "Customer's information", JOptionPane.PLAIN_MESSAGE);
		      	
		      	if (Address != null && !Address.trim().isEmpty()) {
		      		break;
		      }
		      	else if (Address != null && Address.trim().isEmpty()) {
		        JOptionPane.showMessageDialog(frame, "You did not input your Address. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		      }
		      	else {
		      		result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
		    	  		
		      			if (result == JOptionPane.YES_OPTION) {
		    	  			System.exit(0);
		        }
		    	  		else {
		    	  			continue;
		        }
		      }
		}
while(true) {

	try {
		System.out.print("\n--------------------------------------------------------------------");
		System.out.println("\nNOTICE: PLEASE ENTER THE NUMBER CORRESPOND TO YOUR CHOICE THANK YOU!");
		Menu.Menu();
		Mainchoice = console.nextInt();
	}
	catch(InputMismatchException k) {
		 JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		 console.nextLine();
		 continue;
	}
		switch(Mainchoice) {
	
			case 1:{
				AddItems();
				break;
					}
			case 2:{
				//remove item
				Data.RemovedItem();
				break;
					}
			case 3:{
				//view cart what's inside
				System.out.println("\n\tCustomer's info");
				System.out.println("Name: " + name);
				System.out.println("Contact: " + contact);
				System.out.println("Address: " + Address+"\n");
				OutputDetails.printproducts();
				System.out.println("--------------------------------------------------------------------");
				Computation();
				sum=0;
				break;
			}
			case 4:{
				Computation();
				Pay();
				break;
			}
			case 5:{
				
				if(Total != 0) {
			
					System.out.println("--------------------------------------------------------------------");
					System.out.println("\n\t\tPlease pay first before Log out");
				}
				else if(unpaid != 0) {
					System.out.println("--------------------------------------------------------------------");
					System.out.println("\n\tPlease pay the remaining balance first before Log out");
				}
				else {
					System.out.println("--------------------------------------------------------------------");
					System.out.println("\n\t\t\tLog out Successful");
					System.exit(0);
				}
				break;
				}
			default:
				 JOptionPane.showMessageDialog(frame, "We can't accept negative or numbers that is more than 5. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}
}
}
public static void AddItems() {
double price;

while(true) {

try {
	System.out.println("--------------------------------------------------------------------");
		Menu.TypeOfClothes();
		int Type = console.nextInt();

		if(Type == 1) {
			
			while(true) {
				try {
					
					System.out.println("--------------------------------------------------------------------");
					Menu.MensApparel();
					int Menchoice = console.nextInt();
			
					if(Menchoice == 1) {
						Data.addItems("Oversized T-shirt");
						break;
									}
					else if(Menchoice == 2) {
						Data.addItems("Hoodie Jacket");
						break;
										}
					else if(Menchoice == 3) {
						Data.addItems("Mesh Short");
						break;
										}
					else if (Menchoice <1){
						throw new ADIOSException();
								 }
					else if (Menchoice >3){
						JOptionPane.showMessageDialog(frame, "We can't accept negative or numbers that is more than 3. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
										}
					}catch(ADIOSException UDE) {
						System.out.println(UDE.toString());
					
					}catch(Exception e) {
						JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
						console.nextLine();
										}
					}
		break;
}
		else if(Type == 2) {
			
			while(true) {
				try {
				
					System.out.println("--------------------------------------------------------------------");
					Menu.womenApparel();
					int Womenchoice = console.nextInt();
			
					if(Womenchoice == 1) {
						Data.addItems("Ribbed Crop T-shirt");
						break;
										}
					else if(Womenchoice == 2) {
						Data.addItems("Drifit Sport Bra");
						break;
									  }
					else if(Womenchoice == 3) {
						Data.addItems("Sweat Short");
						break;
										}
					else if (Womenchoice <1){
						throw new ADIOSException();
								 }
					else if (Womenchoice >3){
						JOptionPane.showMessageDialog(frame, "We can't accept negative or numbers that is more than 3. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
										}
					}catch(ADIOSException UDE) {
						System.out.println(UDE.toString());
					
					}catch(Exception e) {
						JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
						console.nextLine();
										}
					}			
		break;
}
		else if (Type <1){
			throw new ADIOSException(); }
		else if (Type >2){
			JOptionPane.showMessageDialog(frame, "We can't accept numbers that is more than 2. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
						}
		}catch(ADIOSException UDE) {
			System.out.println(UDE.toString());

		}catch(Exception e) {
			JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
			console.nextLine();
			}
}
while(true) {
	try {

		System.out.println("--------------------------------------------------------------------");
		Menu.Colors();
		int Colorchoice = console.nextInt();

		if(Colorchoice == 1) {
			Data.addColor("White");
			break;
					}
		else if(Colorchoice == 2) {
			Data.addColor("Black");
			break;
						 }
		else if(Colorchoice == 3) {
			Data.addColor("Gray");
			break;
						}
		else if (Colorchoice <1){
			throw new ADIOSException();
				 }
		else if (Colorchoice >3){
			JOptionPane.showMessageDialog(frame, "We can't accept numbers that is more than 3. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
						}
		}catch(ADIOSException UDE) {
			System.out.println(UDE.toString());
	
		}catch(Exception e) {
			JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
			console.nextLine();
						}
}
while(true) {

	try {
		System.out.println("--------------------------------------------------------------------");

		Menu.Size();
		int Sizechoice = console.nextInt();
	
		if (Sizechoice < 1){
			throw new ADIOSException();
				 }
		else if (Sizechoice > 4){
			JOptionPane.showMessageDialog(frame, "We can't accept numbers that is more than 4. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
							}
		else {
			while(true) {
				try {
					System.out.print("Enter Quantity: ");
					Quantity = console.nextInt();
		
					if(Quantity >=1) {
						Data.Quantity(Quantity);
						break;
						}
					else if(Quantity <1)
						throw new ADIOSException();
		
				}catch(ADIOSException UDE) {
					System.out.println(UDE.toString());

				}catch(Exception e) {
					JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
					console.nextLine();
						}
			}
	}
		if(Sizechoice == 1) {
			Data.addSize("Small");
			price = 2.2;
			Total =  Quantity * price;
			Data.Payment(Total);
			break;
						}
		else if(Sizechoice == 2) {
			Data.addSize("Medium");
			price = 2.5;
			Total =  Quantity * price;
			Data.Payment(Total);
			break;
							}
		else if(Sizechoice == 3) {
			Data.addSize("Large");
			price = 2.9;
			Total =  Quantity * price;
			Data.Payment(Total);
			break;
							}
		else if(Sizechoice == 4) {
			Data.addSize("Extra Large");
			price = 3.1;
			Total =  Quantity * price;
			Data.Payment(Total);
			break;
							}
	}catch(ADIOSException UDE) {
		System.out.println(UDE.toString());
	}catch(Exception e) {
		JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
		console.nextLine();
				}
		}
}
public static void Computation() {

for (int i = 0; i < UnderDevelopment.Payment.size(); i++)
    sum += UnderDevelopment.Payment.get(i);

		if(unpaid != 0) {
			System.out.println("Balance: $" + df.format(unpaid));	
			}
		sum = sum + unpaid;
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total payment: $" + df.format(sum));
}
public static void Pay() {

while(true) {
	try {
		if(sum==0) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("\n \t\t  You have no pending payment\n");
			break;
				}
		else{
			System.out.println();
			System.out.print("Please enter you money here: $");
			double money = console.nextDouble();
			
			if(money < 0) 
				throw new ADIOSException();
			
			else {
				change =(money - sum);
	
				if(Math.round(change) < 0) {
		
					unpaid = (change * -1);
					System.out.println("--------------------------------------------------------------------");
					System.out.println("Balance $" + df.format(unpaid));
										}	
				else {
					if(change < 0) 
						change = (change * -1); 					
				
						System.out.println("--------------------------------------------------------------------");
						System.out.println("Your change: $" + df.format(change));
						System.out.println("\n\tThank you For using our service");
						unpaid =0;
					}
				UnderDevelopment.clearItem();
			sum = 0;
			Total=0;
		break;
				}
			}
	}catch(ADIOSException UDE) {
	System.out.println(UDE.toString());
}catch(Exception e) {
	JOptionPane.showMessageDialog(frame, "We can't accept characters. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	console.nextLine();
				}
}
}
}
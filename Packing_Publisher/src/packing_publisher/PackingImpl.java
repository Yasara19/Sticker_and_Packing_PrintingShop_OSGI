
package packing_publisher;

import java.util.Scanner;

public class PackingImpl implements IPacking{
	Scanner sc = new Scanner(System.in);
	int packingItem;
	int packingType;
	float cost;
	float price =0;
    String str= "y";
    
      
	@Override
	public void calculatePackingCharges() {	
		
	    while(str == "y") {
	    	System.out.println("************************************************");
	    	System.out.println("----Calculate Packing Cost-----");
	    	System.out.println("1.Mug");
	    	System.out.println("2.Tshirt");
	    	System.out.println("0.Exit");
	    	
	    	System.out.println("");
	    	System.out.println(" Please Enter Item Type Number:");
	    	int packingItem = sc.nextInt();
	    	
	    	if(packingItem == 1) {
	    		System.out.println("************************************************");
	    		System.out.println("Please Enter packing Quantity of Mugs:");
	    		int mugqty = sc.nextInt();
	    		System.out.println("");
	    		System.out.println("************************************************");
		    	System.out.println("1.Only Gift Box  (Rs.80/=)");
		    	System.out.println("2.Gift box with wrapping paper (Rs.100)");
		    	System.out.println("Choose Packing Type :");
		    	int packingType = sc.nextInt();
		    	
		    	switch(packingType) {
		    	  case 1:
		    	    cost = 80;
		    	    break;
		    	  case 2:
		    	    cost =100;
		    	    break;
		    	  default:
		    	    System.out.println("Invalid Packing Type");
		    	}
		    	
		    	
		    	price = price +(cost * mugqty);
		    
				System.out.println("Packing cost is Rs. "+ price );
				
	    		
	    }else if(packingItem ==2) {
	    		System.out.println("************************************************");
	    		System.out.println("Please Enter packing quantity of Tshirt:");
	    		int tshirtqty = sc.nextInt();
	    		System.out.println("");
	    		
	    		System.out.println("************************************************");
		    	System.out.println("1.Birthday Wrapping Paper (Rs.25/=) ");
		    	System.out.println("2.Aniversary Wrapping Paper(Rs.30/=) ");
		    	System.out.println("3.Normal Wrapping Paper (Rs.20/=)");
		    	System.out.println();
		    	System.out.println("Choose Wrapping Paper Type :");
		    	int wrappingType = sc.nextInt();
	    		
	    		
	    		switch(wrappingType) {
		    	  case 1:
		    	    cost = 25;
		    	    break;
		    	  case 2:
		    	    cost =30;
		    	    break;
		    	  case 3: 
			    	 cost =20;
			    	  break;
		    	  default:
		    	    System.out.println("Invalid Wrapping Paper Type");
		    	}
	    		
	    		
	    		price = price + (cost * tshirtqty); 
				System.out.println("Packing cost price is Rs. "+ price );
	    	}else
	    		break;
	    	
	    	
	 	   System.out.println("Do you want to continue(y/n)?");
	 	   String str = sc.next();
	 	  System.out.println("Total Packing Charges: "+price);
	      System.out.println("Thank you"); 
	    }
	    
	    
	    
		   
		
	}
     
}

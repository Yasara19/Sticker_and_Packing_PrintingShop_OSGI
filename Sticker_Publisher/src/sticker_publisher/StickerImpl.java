package sticker_publisher;

import java.util.Scanner;

public class StickerImpl implements ISticker {
	//card type variable decleration
			Scanner sc = new Scanner(System.in);
			int amount,totalprice,amtdiscount;
	@Override
	public void StickerTypeSelection() {
		// TODO Auto-generated method stub
		//card type depends on user input value
		        
		        System.out.println("-----------------------------------------------");
				System.out.println("-----Calculate Sticker printing Cost-----");
				System.out.println("1. Calculate stickersprinting Price");
				System.out.println("0. Exit");
				 System.out.println("-----------------------------------------------");
				System.out.print("Enter No : ");
				int n = sc.nextInt();
				
				 System.out.println();
				if(n==1) {
					while(true) {
						System.out.println("-----------------------------------------------");
						System.out.println("****Choose Sticker Type****");
						System.out.println("1). -Books' cover Stickers-");
						System.out.println("2). -Printing Vehicle Stickers-");
						System.out.println("3). -Printing Wall Stickers-");
						System.out.println("0). -Exit-");
						System.out.println("-----------------------------------------------");
						System.out.print("Enter Menu No : ");
						int stickerType = sc.nextInt();
						
						 
						 if(stickerType == 1){
							int bookStickerprice = 750;
							System.out.println();
							System.out.println("Book's cover Sticker Design price is Rs. "+  bookStickerprice);
							System.out.println();
							
							
							System.out.println("Please Choose the size you need to print.*** ");
							System.out.println("(1) A4 (Rs.8) ");
							System.out.println("(2) A3 (Rs.10)  ");
							System.out.println();
							System.out.print("Enter size Menu No : ");
							Scanner sc = new Scanner(System.in);
							int size= sc.nextInt();
							
							
							int sizePrice;
							int A4 = 8;
							int A3 = 10;
							int sizeAddedprice;
						
							if(size==1){
							
								sizeAddedprice =A4 ;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print: ");
								System.out.println();
								int amount= sc1.nextInt();
								int totalprice = sizeAddedprice*amount + bookStickerprice;
								
								System.out.println("---------------------------------------------");
								System.out.println("Please choose Customer Type !!!");
								System.out.println("(1)Customer");
								System.out.println("(2) Loyality card customer");
								System.out.println("----------------------------------------------");
								System.out.println();
								System.out.print("Enter Customer Type Menu No : ");
								
								int payType= sc.nextInt();
								
									if(payType==1){
									
											if(amount<100){
												
												amtdiscount = 0;
												
												System.out.println("Your discount is ::"+ amtdiscount);
												System.out.println("Your total new price"+ totalprice);
							
									
													
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType==2) {
															System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = totalprice/100*2;
																	int newPrice = totalprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);      
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int newPrice = totalprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
																
																
												
																
																
																
																
															}
															
								}else if(size == 2) {

									
									
									sizeAddedprice = A3;
									Scanner sc1 = new Scanner(System.in);
									
									System.out.println("Please Choose the quantity you need to print: ");
									int amount= sc1.nextInt();
									
									int totalprice = sizeAddedprice*amount +bookStickerprice;
									System.out.println("----------------------------------------------");
									System.out.println("Please choose Customer Type !!!");
									System.out.println("(1)Customer");
									System.out.println("(2) Loyality card customer");
									System.out.println("-----------------------------------------------");
									System.out.println();
									System.out.print("Enter Customer Type Menu No : ");
									
									int payType= sc.nextInt();
								
										if(payType==1){
										
												if(amount<100){
													
													amtdiscount = 0;
													
													System.out.println("Your discount is ::"+ amtdiscount);
													System.out.println("Your total new price"+ totalprice);
								
										
														
														}else if(amount>=100){
															int totalpriceDis,newtotalDis,amtdiscount;
															
															amtdiscount = totalprice/100*2;
															newtotalDis = totalprice-amtdiscount;
															
															System.out.println("Your discount is ::"+ amtdiscount);
															System.out.println("Your total new price"+ newtotalDis);
															
															
															
									
											}
												
															}else if (payType==2) {
																System.out.println("--------------------------------------");
																System.out.println("(1)Add Points to Loyalty Card");
																System.out.println("(2)Get Discount");
																System.out.println("---------------------------------------");
																System.out.print("Enter Choice : ");
																int choice= sc.nextInt();
																
																	if(choice == 1){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		
																		amtdiscount = totalprice/100*2;
																		int newPrice = totalprice-amtdiscount;
																		int points = newPrice/100;
																	
																	
																	System.out.println("Dear Customer You have earned "+ points+ "points");
																	System.out.println("Total bill "+ newPrice);       
																	
																	} else {
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int newPrice = totalprice-amtdiscount;
																		
																	
																		
																		System.out.println("Your discount is : "+ amtdiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
																			
																	}

																	}
																	
																	
																									
																	
																
																
									
								
							}
							}
						
							
							
						else if(stickerType == 2) {
							int vehicleStickerDesignprice = 25000;
							System.out.println("Vehicle Sticker Design price is Rs. "+ vehicleStickerDesignprice);
							System.out.println();
							System.out.println("----------------------------------------------");
							System.out.println("Please Choose the vehicle type.*** ");
							System.out.println(" Car or Van (Rs.10000/=)***  (1)  ");
							System.out.println(" Bus or other(Rs.15000/=) ***  (2)  ");
							System.out.println(" Bike or Bicycle (Rs.5000/=) ***  (3)  ");
							System.out.println("-----------------------------------------------");
							System.out.print("Enter Vehicle Type Menu No : ");
							Scanner sc = new Scanner(System.in);
							int vtype = sc.nextInt();
							
							int vtypePrice;
							int car= 10000;
							int bus = 15000;
							int bike = 5000;
							int vtypeAddedprice;
						
							if(vtype==1){
							
							
								vtypeAddedprice = car + vehicleStickerDesignprice;
								System.out.println("Total Vehicle Sticker price is Rs. "+vtypeAddedprice );
								System.out.println();
								
								System.out.println("----------------------------------------------");
								System.out.println("Please choose Customer Type !!!");
								System.out.println("(1)Customer");
								System.out.println("(2) Loyality card customer");
								System.out.println("-----------------------------------------------");
								System.out.println();
								System.out.print("Enter Customer Type Menu No : ");
								
								int payType= sc.nextInt();
							
									if(payType==1){
							
														int  newtotalDis,discount;
														
														discount = 0;
														newtotalDis = vtypeAddedprice-discount;
														
														System.out.println("Your discount is ::"+ discount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
											else if (payType==2) {
																
												System.out.println("--------------------------------------");
												System.out.println("(1)Add Points to Loyalty Card");
												System.out.println("(2)Get Discount");
												System.out.println("---------------------------------------");
												System.out.print("Enter Choice : ");
												int choice= sc.nextInt();
												
													if(choice == 1){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = vtypeAddedprice/100*2;
														int newPrice = vtypeAddedprice-amtdiscount;
														int points = newPrice/100;
													
													
													System.out.println("Dear Customer You have earned "+ points+ "points");
													System.out.println("Total bill "+ newPrice);       
													
													} else {
														int totalpriceDis,newtotalDis,amtdiscount;
														amtdiscount = vtypeAddedprice/100*5;
														int newPrice = vtypeAddedprice-amtdiscount;
														
													
														
														System.out.println("Your discount is : "+ amtdiscount);
														System.out.println("Your total new price"+ newPrice);
														
															
													}
												                  
												
												                 
	
																} else
																	
																	System.out.println("Invalid Customer Type");
																	
																		
																
																
																
																
																
																
															}
															
					else if(vtype == 2) {

									
									
									vtypeAddedprice = bus+ vehicleStickerDesignprice;
									System.out.println("Total Vehicle Sticker price is Rs. "+vtypeAddedprice );
									System.out.println("---------------------------------------------");
									System.out.println("Please choose Customer Type !!!");
									System.out.println("(1)Customer");
									System.out.println("(2) Loyality card customer");
									System.out.println("---------------------------------------------");
									System.out.println();
									System.out.print("Enter Customer Type Menu No : ");
									
									int payType= sc.nextInt();
									
								
										if(payType==1){
						
															int totalpriceDis,newtotalDis,discount;
															
															discount =0;
															newtotalDis = vtypeAddedprice-discount;
															
															System.out.println("Your discount is ::"+ discount);
															System.out.println("Your total new price"+ newtotalDis);
															
														
												
														}else if (payType == 2) {

															
															System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = vtypeAddedprice/100*2;
																	int newPrice = vtypeAddedprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);      
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = vtypeAddedprice/100*5;
																	int newPrice = vtypeAddedprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
															                  
															
															                 
				
																			
																}
																
									
								
								}else if(vtype == 3) {
								

							
								vtypeAddedprice = bike + vehicleStickerDesignprice;
								System.out.println("Total Vehicle Sticker price is Rs. "+vtypeAddedprice );
								System.out.println("----------------------------------------------");
								System.out.println("Please choose Customer Type !!!");
								System.out.println("(1)Customer");
								System.out.println("(2) Loyality card customer");
								System.out.println("----------------------------------------------");
								System.out.println();
								System.out.print("Enter Customer Type Menu No : ");
								
								int payType= sc.nextInt();
								
									if(payType==1){
										
														int totalpriceDis,newtotalDis,discount;
														
														discount =0;
														newtotalDis = vtypeAddedprice -discount;
														
														System.out.println("Your discount is ::"+ discount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
											
														}else if (payType == 2) {
															
															System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = vtypeAddedprice/100*2;
																	int newPrice = vtypeAddedprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);     
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = vtypeAddedprice/100*5;
																	int newPrice = vtypeAddedprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
													
																	
															}
															
								
							}
							
						}else if(stickerType == 3) {
							int wallStickerPrice = 2500;
							System.out.println("Wall Sticker price is Rs. "+ wallStickerPrice);
							System.out.println();
							System.out.println("-----------------------------------------------");
							System.out.println("Please Choose the scale you need to print.*** ");
							System.out.println(" Small *** (Rs.8/=)  (1)  ");
							System.out.println(" Medium *** (Rs.10/=)  (2)  ");
							System.out.println(" Large *** (Rs.15/=) (3)  ");
							System.out.println("-----------------------------------------------");
							System.out.print("Enter size Menu No : ");
							System.out.println();
							Scanner sc = new Scanner(System.in);
							int scale= sc.nextInt();
							
							int scalePrice;
							int small = 8;
							int medium = 10;
							int large = 15;
							int scaleAddedprice;
						
							if(scale==1){
							
							
								scaleAddedprice =small;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print: ");
								int amount= sc1.nextInt();
								
								int totalprice = scaleAddedprice*amount+ wallStickerPrice;
								System.out.println();
								System.out.println("----------------------------------------------");
								System.out.println("Please choose Customer Type !!!");
								System.out.println("(1)Customer");
								System.out.println("(2) Loyality card customer");
								System.out.println("----------------------------------------------");
								System.out.println();
								System.out.print("Enter Customer Type Menu No : ");
								
								int payType= sc.nextInt();
							
									if(payType==1){
									
									
											//default customer(<100)
											if(amount<100){
												
												amtdiscount = 0;
												
												System.out.println("Your discount is ::"+ amtdiscount);
												System.out.println("Your total new price"+ totalprice);
							
									
													//default customer<100)
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															
															System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = totalprice/100*2;
																	int newPrice = totalprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);     
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*5;
																	int newPrice = totalprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
															
									
																	}
															}
															
								}else if(scale == 2) {

									
									
									scaleAddedprice =medium;
									Scanner sc1 = new Scanner(System.in);
									
									System.out.println("Please Choose the quantity you need to print. ");
									int amount= sc1.nextInt();
									
									int totalprice = scaleAddedprice*amount+ wallStickerPrice;
									System.out.println();
									System.out.println("----------------------------------------------");
									System.out.println("Please choose Customer Type !!!");
									System.out.println("(1)Customer");
									System.out.println("(2) Loyality card customer");
									System.out.println("----------------------------------------------");
									System.out.println();
									System.out.print("Enter Customer Type Menu No : ");
									
									int payType= sc.nextInt();
									
								
										if(payType==1){
										
										
												//default customer(<100)
												if(amount<100){
													
													amtdiscount = 0;
													
													System.out.println("Your discount is ::"+ amtdiscount);
													System.out.println("Your total new price"+ totalprice);
								
										
														//default customer<100)
														}else if(amount>=100){
															int totalpriceDis,newtotalDis,amtdiscount;
															
															amtdiscount = totalprice/100*2;
															newtotalDis = totalprice-amtdiscount;
															
															System.out.println("Your discount is ::"+ amtdiscount);
															System.out.println("Your total new price"+ newtotalDis);
															
															
															
									
											}
												
															}else if (payType == 2) {System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = totalprice/100*2;
																	int newPrice = totalprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);      
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*5;
																	int newPrice = totalprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}}
																
									
								
							}else if(scale == 3) {
								
								scaleAddedprice =large;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = scaleAddedprice*amount + wallStickerPrice;
								System.out.println("----------------------------------------------");
								System.out.println("Please choose Customer Type !!!");
								System.out.println("(1)Customer");
								System.out.println("(2) Loyality card customer");
								System.out.println("----------------------------------------------");
								System.out.println();
								System.out.print("Enter Customer Type Menu No : ");
								
								int payType= sc.nextInt();
								
							
									if(payType==1){
									
									
											//default customer(<100)
											if(amount<100){
												
												amtdiscount = 0;
												
												System.out.println("Your discount is ::"+ amtdiscount);
												System.out.println("Your total new price"+ totalprice);
							
									
													//default customer<100)
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															
															System.out.println("--------------------------------------");
															System.out.println("(1)Add Points to Loyalty Card");
															System.out.println("(2)Get Discount");
															System.out.println("---------------------------------------");
															System.out.print("Enter Choice : ");
															int choice= sc.nextInt();
															
																if(choice == 1){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	
																	amtdiscount = totalprice/100*2;
																	int newPrice = totalprice-amtdiscount;
																	int points = newPrice/100;
																
																
																System.out.println("Dear Customer You have earned "+ points+ "points");
																System.out.println("Total bill "+ newPrice);      
																
																} else {
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*5;
																	int newPrice = totalprice-amtdiscount;
																	
																
																	
																	System.out.println("Your discount is : "+ amtdiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
															
									
																	}
															
															
														}
															
							}	
							
						}else if(stickerType == 0) {
							System.out.println("Exit to menu");
							break;
							
							
						}else if(n == 0){
						break;
					}
						System.out.print("Do you want to Continue ? (press N for no.. any key to continue)  ");
						String s = sc.next();

						if (s.equalsIgnoreCase("N")) {
							System.out.println("Thank you Dear Valuable Customer");
							break;
						} else {
							continue;
						}
								
					}
				}
	}

}

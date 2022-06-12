package print_sticker_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import sticker_publisher.ISticker;

public class Activator implements BundleActivator {
    
	ServiceReference serviceRef4;
	Scanner sc = new Scanner(System.in);
	int val = 0;
	

	public void start(BundleContext context) throws Exception {
		System.out.println("Sticker Concumer started");
		System.out.println();
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef4 = context.getServiceReference(ISticker.class.getName());
		ISticker stickerObj = (ISticker) context.getService(serviceRef4);
		
		while(true) {
			System.out.println();
			System.out.println("### Welcome To Printing Shop ###");
			System.out.println("------------Main Menu------------");
			System.out.println("1). -Printing Cards-");
			System.out.println("2). -Printing Mug-");
			System.out.println("3). -Printing Sticker-");
			System.out.println("4). -Printing Tshirt-");
			System.out.println("0). -Exit-");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Enter Menu No : ");
					
			val = sc.nextInt();
			
			if(val == 3) {
				while(true) {
					System.out.println("*****Printing Sticker*****");
					stickerObj.StickerTypeSelection();
					System.out.println();
					System.out.println("1. Calculate 	Sticker Price");
					System.out.println("2. Exit");
					System.out.print("Enter No : ");
					int n = sc.nextInt();
					
					if(n==1) {
						System.out.println("-----Calculate Sticker-----");
					}else if(n == 2){
						break;
					}
					System.out.print("Do you want to Calculate again ? Y/N   ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						System.out.println("Thank you");
						break;
					} else {
						continue;
					}
				}
				}
			
			else if (val == 0) {
				System.out.println("----Thank you----");
				break;
			} else {
				continue;
			}
		}
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Printing Sticker Stop..");
		context.ungetService(serviceRef4);
	}

}

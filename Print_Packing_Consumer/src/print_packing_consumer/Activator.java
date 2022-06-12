package print_packing_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import packing_publisher.IPacking;


public class Activator implements BundleActivator {

	ServiceReference serviceRef6;
	Scanner sc = new Scanner(System.in);
	int val = 0;
	

	public void start(BundleContext context) throws Exception {
		System.out.println("Packing Concumer started");
		System.out.println();
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		//registering and referencing to get services from the CARD_Type_Publisher bundle.
		serviceRef6 = context.getServiceReference(IPacking.class.getName());
		IPacking  packingObj = (IPacking) context.getService(serviceRef6);
		
		
		
		while (true) {
			System.out.println("---Calculate Packing Charges---");
			System.out.println();
			System.out.println("1.Calculate Packing Chargers");
			System.out.println("0.Exit");
			
			System.out.println();
			System.out.println("Enter Menu No:");
			
			int menu = sc.nextInt();
			
			if(menu==1) {
				 packingObj.calculatePackingCharges();
			}else if(menu==0) {
				break;
			}
			
			  
		}
		
		
		
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Printing Packing Consumer Stop..");
		context.ungetService(serviceRef6);
	}

}

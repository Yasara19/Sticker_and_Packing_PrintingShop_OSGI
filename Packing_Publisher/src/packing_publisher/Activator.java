package packing_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	ServiceRegistration serviceReg;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("### Packing Publisher starts..");
		IPacking packingObj = new PackingImpl();
		serviceReg = context.registerService(IPacking.class.getName(), packingObj, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("### Packing Publisher stops..");
		serviceReg.unregister();
	}

}

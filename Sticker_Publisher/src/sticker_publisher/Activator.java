package sticker_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {
	ServiceRegistration serviceReg;

	public void start(BundleContext context) throws Exception {
				System.out.println("### Sticker Publisher starts..");
				ISticker stickerObj = new StickerImpl();
				serviceReg = context.registerService(ISticker.class.getName(), stickerObj, null);
			}
		
	

	public void stop(BundleContext bundleContext) throws Exception {
		
				System.out.println("### Sticker Publisher stops..");
				serviceReg.unregister();
	}

}

package imagindata;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static Activator instance;
	public Activator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @generated NOT
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
	}

	/**
	 * @generated NOT
	 */
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}

	/**
	 * @generated NOT
	 */
	public static Activator getInstance(){
		return instance;
	}
}

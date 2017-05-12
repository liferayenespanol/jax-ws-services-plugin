package jax.ws.services;

import javax.xml.ws.Endpoint;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class Activator implements BundleActivator {
	private static Log _log = LogFactoryUtil.getLog(Activator.class);
	private Endpoint _endpoint;
	
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		_log.info("start app");

		_endpoint = Endpoint.publish("/soap", new  JaxWsServices());
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		_endpoint.stop();
		_log.info("stop app");
	}
}
/*
 * generated by Xtext
 */
package com.wellnr;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BashDSLUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.wellnr.ui.internal.BashDSLActivator.getInstance().getInjector("com.wellnr.BashDSL");
	}
	
}
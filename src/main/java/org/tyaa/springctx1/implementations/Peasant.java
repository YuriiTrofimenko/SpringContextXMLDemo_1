package org.tyaa.springctx1.implementations;

import org.tyaa.springctx1.interfaces.IPerson;

public class Peasant implements IPerson {

	public void goTo(int _x, int _y) {
		
		System.out.printf("Walk to %d; %d\n", _x, _y);
	}
}

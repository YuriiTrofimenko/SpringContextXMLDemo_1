package org.tyaa.springctx1.implementations;

import org.tyaa.springctx1.interfaces.IPerson;

public class Protector implements IPerson {

	public void goTo(int _x, int _y) {
		
		System.out.printf("Run to %d; %d\n", _x, _y);
	}
}

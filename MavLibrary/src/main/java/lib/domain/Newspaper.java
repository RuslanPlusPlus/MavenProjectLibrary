package lib.domain;

import lib.controller.Type;

public class Newspaper extends LibraryItem{

	public Newspaper(String name) {
		super(name);
	}

	@Override
	public Type getType() {
		return Type.NEWSPAPER;
	}
	
}

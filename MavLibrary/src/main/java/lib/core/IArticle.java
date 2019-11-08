package lib.core;

import lib.controller.Type;

public interface IArticle extends ILibraryObject{

	String getNameOfLibraryItem();
	Type getTypeOfLibraryItem();
	boolean isFree();
	void busy(IReader reader);
	
}

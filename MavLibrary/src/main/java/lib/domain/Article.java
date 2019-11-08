package lib.domain;

import java.io.Serializable;

import lib.controller.Type;
import lib.core.IArticle;
import lib.core.ILibraryItem;
import lib.core.IReader;

public class Article implements IArticle{

private static long ID_COUNTER;
	
	private String name;
	private long own_id;
	private ILibraryItem libraryItem;
	
	Article(String name, ILibraryItem libraryItem){
		this.name = name;
		this.own_id = ID_COUNTER++;
		this.libraryItem = libraryItem;
	}
	
	@Override
	public Serializable getId() {
		return this.own_id;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getNameOfLibraryItem() {
		return this.libraryItem.getName();
	}

	@Override
	public Type getTypeOfLibraryItem() {
		return this.libraryItem.getType();
	}

	@Override
	public boolean isFree() {
		return this.libraryItem.isFree();
	}

	@Override
	public void busy(IReader reader) {
		this.libraryItem.busy(reader);
	}

}

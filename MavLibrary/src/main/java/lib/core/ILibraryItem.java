package lib.core;

import java.util.List;

import lib.controller.Type;


public interface ILibraryItem extends ILibraryObject{

	Type getType();
	void busy(IReader reader);
	void free();
	boolean isFree();
	List<String>getArticles();
	void addArticle(String article);
	int getArticleListSize();
	
}

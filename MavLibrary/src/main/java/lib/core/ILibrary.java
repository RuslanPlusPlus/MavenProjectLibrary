package lib.core;

import java.util.List;

import lib.controller.Type;


public interface ILibrary {

	List<IReader>getReaders();
	List<ILibraryItem>getLibraryItemsList(Type type);
	List<IArticle>getArticlesList();
	List<ILibraryItem>getFreeItems();
	List<ILibraryItem>getBusyItems();
	List<IArticle>getFreeArticles();
	List<IArticle>getBusyArticles();
	void add(ILibraryObject ob);
	List<ILibraryItem>getFreeBooks();
	List<ILibraryItem>getFreeMagazines();
	List<ILibraryItem>getFreeNewspapers();
	List<IReader>getRadersReadMoreThanTwoBook();
	
}

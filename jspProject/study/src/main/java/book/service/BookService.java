package book.service;

import java.util.List;

import book.BookDAO;
import book.util.BookDTO;

public class BookService {
	
	
	public List<BookDTO> selectService() {
		
		BookDAO book = new BookDAO();
		List<BookDTO> list = book.selectByAll();
		
		return list;
	}

	
	
}

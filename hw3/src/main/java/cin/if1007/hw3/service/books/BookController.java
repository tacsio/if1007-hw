package cin.if1007.hw3.service.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "books")
public class BookController {

	private BooksRepository booksRepository;

	@Autowired
	public BookController(BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}

	@GetMapping
	public ResponseEntity<List<Book>> getBooks() {

		List<Book> books = booksRepository.findAll();
		ResponseEntity<List<Book>> response = new ResponseEntity<>(books, HttpStatus.OK);

		return response;
	}
}

package cin.if1007.hw3.services.authors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	private AuthorRepository authorRepository;

	@Autowired
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@GetMapping
	public ResponseEntity<List<Author>> getAuthors() {

		List<Author> authors = authorRepository.findAll();
		ResponseEntity<List<Author>> response = new ResponseEntity(authors, HttpStatus.OK);

		return response;
	}
}

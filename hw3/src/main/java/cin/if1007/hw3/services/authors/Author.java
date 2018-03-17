package cin.if1007.hw3.services.authors;

import cin.if1007.hw3.services.books.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("author")
	private List<Book> books;

	public void addBook(Book book) {
		if (books == null) {
			books = new ArrayList<>();
		}

		books.add(book);
	}

}

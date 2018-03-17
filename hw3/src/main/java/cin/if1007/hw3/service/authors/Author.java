package cin.if1007.hw3.service.authors;

import cin.if1007.hw3.service.books.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany
	private List<Book> books;

}

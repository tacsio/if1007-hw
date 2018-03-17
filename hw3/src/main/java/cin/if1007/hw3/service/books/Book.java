package cin.if1007.hw3.service.books;

import cin.if1007.hw3.service.authors.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@ManyToOne
	private Author author;
}

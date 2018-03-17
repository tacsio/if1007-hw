package cin.if1007.hw3.services.books;

import cin.if1007.hw3.services.authors.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("books")
	private Author author;
}

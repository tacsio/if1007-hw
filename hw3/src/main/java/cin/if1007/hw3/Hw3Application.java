package cin.if1007.hw3;

import cin.if1007.hw3.services.authors.Author;
import cin.if1007.hw3.services.books.Book;
import cin.if1007.hw3.services.books.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Hw3Application {

	@Bean
	public CommandLineRunner loadData(BooksRepository booksRepository){
		return args -> {
			Arrays.asList("O príncipe:Maquiavel", "Dr. Fausto:Thomas Mann").forEach(name -> {
				Author author = new Author();
				author.setName(name.split(":")[1]);

				Book book = new Book();
				book.setName(name.split(":")[0]);
				book.setAuthor(author);

				author.addBook(book);

				booksRepository.save(book);
			});
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
	}
}

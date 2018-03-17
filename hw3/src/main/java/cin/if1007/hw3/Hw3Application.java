package cin.if1007.hw3;

import cin.if1007.hw3.service.books.Book;
import cin.if1007.hw3.service.books.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Hw3Application {

	@Bean
	public CommandLineRunner loadData(BooksRepository booksRepository){
		return args -> {
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
	}
}

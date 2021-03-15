package hr.xmjosic.mongo.demo.controller;

import hr.xmjosic.mongo.demo.model.Book;
import hr.xmjosic.mongo.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Book with id: " + book.getId() + " added!";
    }

    @GetMapping("/getAllBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getBookById/{id}")
    public Optional<Book> getBook(@PathVariable("id") int id) {
        return bookRepository.findById(id);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookRepository.deleteById(id);
        return "Book with id: " + id + " deleted!";
    }
}

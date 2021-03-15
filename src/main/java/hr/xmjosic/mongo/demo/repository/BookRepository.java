package hr.xmjosic.mongo.demo.repository;

import hr.xmjosic.mongo.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}

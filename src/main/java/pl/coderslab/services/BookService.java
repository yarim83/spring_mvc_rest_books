package pl.coderslab.services;

import pl.coderslab.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getList();

    void create(Book book);

    Book getBookById(long id);

    void update(Book book);

    void deleteBookById(long id);
}

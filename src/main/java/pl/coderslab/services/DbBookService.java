package pl.coderslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.BookDao;
import pl.coderslab.model.Book;

import java.util.List;

@Service
public class DbBookService implements BookService {

    private final BookDao bookDao;

    @Autowired
    public DbBookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getList() {
        return null;
    }

    @Override
    public void create(Book book) {
        bookDao.create(book);
    }

    @Override
    public Book getBookById(long id) {
        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void deleteBookById(long id) {

    }
}

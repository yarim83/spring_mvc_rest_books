package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.services.MemoryBookService;

@Controller
@RequestMapping("/books")
public class BookController {

    private final MemoryBookService memoryBookService;

    @Autowired
    public BookController(MemoryBookService memoryBookService){
        this.memoryBookService = memoryBookService;
    }

    @GetMapping("/")
    public String allBooks(Model model, MemoryBookService memoryBookService){
        model.addAttribute("books", memoryBookService.getList());
        return "books";
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return memoryBookService.getBookById(id);
    }


    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
        memoryBookService.create(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody Book book) {
        memoryBookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id) {
        memoryBookService.deleteBookById(id);
    }

}

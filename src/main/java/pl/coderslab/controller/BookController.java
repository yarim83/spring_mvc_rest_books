package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping("/hello")
    public String hello() {
        return "{hello: World}";
    }

    @RequestMapping("/helloBook")
    @ResponseBody
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    private MemoryBookService memoryBookService;

    public BookController(MemoryBookService memoryBookService){
        this.memoryBookService = memoryBookService;
    }
//
//    @RequestMapping("/")
//    public List<Book> allBooks(MemoryBookService memoryBookService){
//        return memoryBookService.getList();
//    }


    @RequestMapping("/")
    public String allBooks(Model model, MemoryBookService memoryBookService){
        model.addAttribute("books", memoryBookService.getList());
        return "books";
    }



    @RequestMapping("/{id}")
    public Book book(@PathVariable long id){
        return memoryBookService.getBook(id);
    }


}

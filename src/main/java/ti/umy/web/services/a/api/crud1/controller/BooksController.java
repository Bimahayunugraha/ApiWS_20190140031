/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.web.services.a.api.crud1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ti.umy.web.services.a.api.crud1.entity.Dbbooks;
import ti.umy.web.services.a.api.crud1.services.BooksService;

/**
 *
 * @author ASUS
 */

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BooksController {
    @Autowired
    BooksService booksService;
    
    @GetMapping
    public List<Dbbooks> getAllBooks(){
        return booksService.getAllBook();
    }
    
    @PostMapping
    @ResponseStatus
    public Dbbooks addBook(@RequestBody Dbbooks book){
        return booksService.addBook(book);
    }
    
    @GetMapping("/{id}")
    public Dbbooks getBookById(@PathVariable("id") int bookId){
        return booksService.getBookById(bookId);
    }
    
    @PutMapping("/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Dbbooks book){
        try{
            booksService.updateBook(book);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        try{
            booksService.deleteBookById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

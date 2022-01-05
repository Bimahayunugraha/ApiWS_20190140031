/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.web.services.a.api.crud1.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ti.umy.web.services.a.api.crud1.entity.Dbbooks;
import ti.umy.web.services.a.api.crud1.repository.BooksRepository;

/**
 *
 * @author ASUS
 */

@Service
public class BookServiceLmpl implements BooksService{
    @Autowired
    private BooksRepository repository;
    
    @Override
    public Dbbooks addBook(Dbbooks book) {
        return repository.save(book);
    }

    @Override
    public Dbbooks getBookById(int bookId) {
        return repository.findById(bookId).get();
    }

    @Override
    public void updateBook(Dbbooks book) {
        Dbbooks bookDB = repository.findById(book.getId()).orElseThrow();
        repository.save(book);
    }

    @Override
    public void deleteBookById(int bookId) {
        try{
            repository.deleteById(bookId);
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Dbbooks> getAllBook() {
        return repository.findAll();
    }
}

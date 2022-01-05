/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.web.services.a.api.crud1.services;

import java.util.List;
import ti.umy.web.services.a.api.crud1.entity.Dbbooks;

/**
 *
 * @author ASUS
 */
public interface BooksService {
    Dbbooks addBook(Dbbooks book);
    Dbbooks getBookById(int bookId);
    void updateBook(Dbbooks book);
    void deleteBookById(int bookId);
    List<Dbbooks> getAllBook();
}

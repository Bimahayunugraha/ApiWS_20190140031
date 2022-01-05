/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.web.services.a.api.crud1.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ti.umy.web.services.a.api.crud1.entity.Dbbooks;

/**
 *
 * @author ASUS
 */
public interface BooksRepository extends JpaRepository<Dbbooks, Integer>{

}

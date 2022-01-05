/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.web.services.a.api.crud1.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "dbbooks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dbbooks.findAll", query = "SELECT d FROM Dbbooks d"),
    @NamedQuery(name = "Dbbooks.findById", query = "SELECT d FROM Dbbooks d WHERE d.id = :id"),
    @NamedQuery(name = "Dbbooks.findByKategoriBuku", query = "SELECT d FROM Dbbooks d WHERE d.kategoriBuku = :kategoriBuku"),
    @NamedQuery(name = "Dbbooks.findByJudul", query = "SELECT d FROM Dbbooks d WHERE d.judul = :judul"),
    @NamedQuery(name = "Dbbooks.findByPengarang", query = "SELECT d FROM Dbbooks d WHERE d.pengarang = :pengarang"),
    @NamedQuery(name = "Dbbooks.findByPenerbit", query = "SELECT d FROM Dbbooks d WHERE d.penerbit = :penerbit"),
    @NamedQuery(name = "Dbbooks.findByQty", query = "SELECT d FROM Dbbooks d WHERE d.qty = :qty"),
    @NamedQuery(name = "Dbbooks.findByHarga", query = "SELECT d FROM Dbbooks d WHERE d.harga = :harga"),
    @NamedQuery(name = "Dbbooks.findByDeskripsiBuku", query = "SELECT d FROM Dbbooks d WHERE d.deskripsiBuku = :deskripsiBuku")})
public class Dbbooks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "kategoriBuku")
    private String kategoriBuku;
    @Column(name = "judul")
    private String judul;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "harga")
    private String harga;
    @Column(name = "deskripsiBuku")
    private String deskripsiBuku;

    public Dbbooks() {
    }

    public Dbbooks(Integer id) {
        this.id = id;
    }
    
    public Dbbooks(Integer id, String kategoriBuku, String judul, String pengarang, String penerbit, Integer qty, String harga , String deskripsiBuku) {
        this.id = id;
        this.kategoriBuku = kategoriBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.qty = qty;
        this.harga = harga;
        this.deskripsiBuku = deskripsiBuku;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKategoriBuku() {
        return kategoriBuku;
    }

    public void setKategoriBuku(String kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsiBuku() {
        return deskripsiBuku;
    }

    public void setDeskripsiBuku(String deskripsiBuku) {
        this.deskripsiBuku = deskripsiBuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dbbooks)) {
            return false;
        }
        Dbbooks other = (Dbbooks) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        // return "ti.umy.web.services.a.api.crud1.entity.Dbbooks[ id=" + id + " ]";
        
        return "BookId = " + getId() + "Kategori Buku = " + getKategoriBuku() + "Judul Buku = " + getJudul() + "Pengarang = "+ getPengarang() + "Penerbit = " + getPenerbit() + "Quantity = " + getQty() + "Harga = " + getHarga() + "Deskripsi Buku = " + getDeskripsiBuku();
    }
    
}

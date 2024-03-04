/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "seguimientos", catalog = "bai", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguimientos.findAll", query = "SELECT s FROM Seguimientos s")
    , @NamedQuery(name = "Seguimientos.findById", query = "SELECT s FROM Seguimientos s WHERE s.id = :id")
    , @NamedQuery(name = "Seguimientos.findByDescripci\u00f3n", query = "SELECT s FROM Seguimientos s WHERE s.descripci\u00f3n = :descripci\u00f3n")
    , @NamedQuery(name = "Seguimientos.findByResponsable", query = "SELECT s FROM Seguimientos s WHERE s.responsable = :responsable")
    , @NamedQuery(name = "Seguimientos.findByProductos", query = "SELECT s FROM Seguimientos s WHERE s.productos = :productos")
    , @NamedQuery(name = "Seguimientos.findByCreatedAt", query = "SELECT s FROM Seguimientos s WHERE s.createdAt = :createdAt")
    , @NamedQuery(name = "Seguimientos.findByUpdatedAt", query = "SELECT s FROM Seguimientos s WHERE s.updatedAt = :updatedAt")})
public class Seguimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Descripci\u00f3n")
    private String descripción;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Responsable")
    private String responsable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Productos")
    private String productos;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Seguimientos() {
    }

    public Seguimientos(Long id) {
        this.id = id;
    }

    public Seguimientos(Long id, String descripción, String responsable, String productos) {
        this.id = id;
        this.descripción = descripción;
        this.responsable = responsable;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (!(object instanceof Seguimientos)) {
            return false;
        }
        Seguimientos other = (Seguimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Seguimientos[ id=" + id + " ]";
    }
    
}

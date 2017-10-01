/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Григорий
 */
@Entity
@Table(name = "medrabotnik")
@NamedQueries({
    @NamedQuery(name = "getListForIf", query = "SELECT m FROM Medrab m WHERE m.fio = :fio or m.id > :id")})
public class Medrab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FIO")
    private String fio;

    @Column(name = "DataRojdenia")
    @Temporal(TemporalType.DATE)
    private Date dr;

    @JoinColumn(name = "Otdelenie", referencedColumnName = "Id")
    @ManyToOne
    private Otdelenie otdelenie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medrab)) {
            return false;
        }
        Medrab other = (Medrab) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Medrab[ id=" + getId() + " ]";
    }

    /**
     * @return the fio
     */
    public String getFio() {
        return fio;
    }

    /**
     * @param fio the fio to set
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * @return the dr
     */
    public Date getDr() {
        return dr;
    }

    /**
     * @param dr the dr to set
     */
    public void setDr(Date dr) {
        this.dr = dr;
    }

    /**
     * @return the otdelenie
     */
    public Otdelenie getOtdelenie() {
        return otdelenie;
    }

    /**
     * @param otdelenie the otdelenie to set
     */
    public void setOtdelenie(Otdelenie otdelenie) {
        this.otdelenie = otdelenie;
    }

}

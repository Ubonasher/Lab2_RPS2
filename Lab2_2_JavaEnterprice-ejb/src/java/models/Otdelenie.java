/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Григорий
 */
@Entity
@Table(name = "Otdelenie")
public class Otdelenie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Nazvanie")
    private String name;

    @OneToMany(mappedBy = "Otdelenie")
    private Collection<Medrab> medrabotnikCollection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Otdelenie)) {
            return false;
        }
        Otdelenie other = (Otdelenie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Otdelenie[ id=" + id + " ]";
    }

    /**
     * @return the medrabotnikCollection
     */
    public Collection<Medrab> getMedrabotnikCollection() {
        return medrabotnikCollection;
    }

    /**
     * @param medrabotnikCollection the medrabotnikCollection to set
     */
    public void setMedrabotnikCollection(Collection<Medrab> medrabotnikCollection) {
        this.medrabotnikCollection = medrabotnikCollection;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}

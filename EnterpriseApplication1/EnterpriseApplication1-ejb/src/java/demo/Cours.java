/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sara Mousselmal
 */
@Entity
@Table(name = "cours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cours.findAll", query = "SELECT c FROM Cours c"),
    @NamedQuery(name = "Cours.findByIdCours", query = "SELECT c FROM Cours c WHERE c.idCours = :idCours"),
    @NamedQuery(name = "Cours.findByNomCours", query = "SELECT c FROM Cours c WHERE c.nomCours = :nomCours"),
    @NamedQuery(name = "Cours.findByCofficientCours", query = "SELECT c FROM Cours c WHERE c.cofficientCours = :cofficientCours"),
    @NamedQuery(name = "Cours.findByCreditCours", query = "SELECT c FROM Cours c WHERE c.creditCours = :creditCours"),
    @NamedQuery(name = "Cours.findByNomProfesseur", query = "SELECT c FROM Cours c WHERE c.nomProfesseur = :nomProfesseur")})
public class Cours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCours")
    private Integer idCours;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NomCours")
    private String nomCours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CofficientCours")
    private int cofficientCours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreditCours")
    private int creditCours;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NomProfesseur")
    private String nomProfesseur;

    public Cours() {
    }

    public Cours(Integer idCours) {
        this.idCours = idCours;
    }

    public Cours(Integer idCours, String nomCours, int cofficientCours, int creditCours, String nomProfesseur) {
        this.idCours = idCours;
        this.nomCours = nomCours;
        this.cofficientCours = cofficientCours;
        this.creditCours = creditCours;
        this.nomProfesseur = nomProfesseur;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(Integer idCours) {
        this.idCours = idCours;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public int getCofficientCours() {
        return cofficientCours;
    }

    public void setCofficientCours(int cofficientCours) {
        this.cofficientCours = cofficientCours;
    }

    public int getCreditCours() {
        return creditCours;
    }

    public void setCreditCours(int creditCours) {
        this.creditCours = creditCours;
    }

    public String getNomProfesseur() {
        return nomProfesseur;
    }

    public void setNomProfesseur(String nomProfesseur) {
        this.nomProfesseur = nomProfesseur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCours != null ? idCours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cours)) {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.idCours == null && other.idCours != null) || (this.idCours != null && !this.idCours.equals(other.idCours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demo.Cours[ idCours=" + idCours + " ]";
    }
    
}

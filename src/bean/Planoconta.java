/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author moises
 */
@Entity
@Table(name = "planoconta", catalog = "siscomjava", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Planoconta.findAll", query = "SELECT p FROM Planoconta p"),
    @NamedQuery(name = "Planoconta.findByCodPlanoconta", query = "SELECT p FROM Planoconta p WHERE p.codPlanoconta = :codPlanoconta"),
    @NamedQuery(name = "Planoconta.findByDescricaoPlanoconta", query = "SELECT p FROM Planoconta p WHERE p.descricaoPlanoconta = :descricaoPlanoconta")})
public class Planoconta implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_planoconta")
    private Integer codPlanoconta;
    @Column(name = "descricao_planoconta")
    private String descricaoPlanoconta;

    public Planoconta() {
    }

    public Planoconta(Integer codPlanoconta) {
        this.codPlanoconta = codPlanoconta;
    }

    public Integer getCodPlanoconta() {
        return codPlanoconta;
    }

    public void setCodPlanoconta(Integer codPlanoconta) {
        Integer oldCodPlanoconta = this.codPlanoconta;
        this.codPlanoconta = codPlanoconta;
        changeSupport.firePropertyChange("codPlanoconta", oldCodPlanoconta, codPlanoconta);
    }

    public String getDescricaoPlanoconta() {
        return descricaoPlanoconta;
    }

    public void setDescricaoPlanoconta(String descricaoPlanoconta) {
        String oldDescricaoPlanoconta = this.descricaoPlanoconta;
        this.descricaoPlanoconta = descricaoPlanoconta;
        changeSupport.firePropertyChange("descricaoPlanoconta", oldDescricaoPlanoconta, descricaoPlanoconta);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPlanoconta != null ? codPlanoconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planoconta)) {
            return false;
        }
        Planoconta other = (Planoconta) object;
        if ((this.codPlanoconta == null && other.codPlanoconta != null) || (this.codPlanoconta != null && !this.codPlanoconta.equals(other.codPlanoconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.view.Planoconta[ codPlanoconta=" + codPlanoconta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

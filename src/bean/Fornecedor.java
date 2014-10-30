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
@Table(name = "fornecedor", catalog = "siscomjava", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByCodFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "Fornecedor.findByNomeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor = :nomeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByOrgaoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.orgaoFornecedor = :orgaoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCnpjFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cnpjFornecedor = :cnpjFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCpfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cpfFornecedor = :cpfFornecedor"),
    @NamedQuery(name = "Fornecedor.findByRgFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.rgFornecedor = :rgFornecedor"),
    @NamedQuery(name = "Fornecedor.findByFoneFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.foneFornecedor = :foneFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCelFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.celFornecedor = :celFornecedor"),
    @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor"),
    @NamedQuery(name = "Fornecedor.findByEnderecoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.enderecoFornecedor = :enderecoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByBairroFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.bairroFornecedor = :bairroFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCidadeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cidadeFornecedor = :cidadeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByUfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.ufFornecedor = :ufFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCepFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cepFornecedor = :cepFornecedor"),
    @NamedQuery(name = "Fornecedor.findBySiteFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.siteFornecedor = :siteFornecedor"),
    @NamedQuery(name = "Fornecedor.findByFaxFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.faxFornecedor = :faxFornecedor"),
    @NamedQuery(name = "Fornecedor.findByContatoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.contatoFornecedor = :contatoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByTipoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.tipoFornecedor = :tipoFornecedor")})
public class Fornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_fornecedor")
    private Integer codFornecedor;
    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;
    @Column(name = "orgao_fornecedor")
    private String orgaoFornecedor;
    @Column(name = "cnpj_fornecedor")
    private String cnpjFornecedor;
    @Column(name = "cpf_fornecedor")
    private Integer cpfFornecedor;
    @Column(name = "rg_fornecedor")
    private Integer rgFornecedor;
    @Column(name = "fone_fornecedor")
    private String foneFornecedor;
    @Column(name = "cel_fornecedor")
    private String celFornecedor;
    @Column(name = "email_fornecedor")
    private String emailFornecedor;
    @Column(name = "endereco_fornecedor")
    private String enderecoFornecedor;
    @Column(name = "bairro_fornecedor")
    private String bairroFornecedor;
    @Column(name = "cidade_fornecedor")
    private String cidadeFornecedor;
    @Column(name = "uf_fornecedor")
    private String ufFornecedor;
    @Column(name = "cep_fornecedor")
    private Integer cepFornecedor;
    @Column(name = "site_fornecedor")
    private String siteFornecedor;
    @Column(name = "fax_fornecedor")
    private String faxFornecedor;
    @Column(name = "contato_fornecedor")
    private String contatoFornecedor;
    @Column(name = "tipo_fornecedor")
    private String tipoFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        String oldNomeFornecedor = this.nomeFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        changeSupport.firePropertyChange("nomeFornecedor", oldNomeFornecedor, nomeFornecedor);
    }

    public String getOrgaoFornecedor() {
        return orgaoFornecedor;
    }

    public void setOrgaoFornecedor(String orgaoFornecedor) {
        String oldOrgaoFornecedor = this.orgaoFornecedor;
        this.orgaoFornecedor = orgaoFornecedor;
        changeSupport.firePropertyChange("orgaoFornecedor", oldOrgaoFornecedor, orgaoFornecedor);
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        String oldCnpjFornecedor = this.cnpjFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        changeSupport.firePropertyChange("cnpjFornecedor", oldCnpjFornecedor, cnpjFornecedor);
    }

    public Integer getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(Integer cpfFornecedor) {
        Integer oldCpfFornecedor = this.cpfFornecedor;
        this.cpfFornecedor = cpfFornecedor;
        changeSupport.firePropertyChange("cpfFornecedor", oldCpfFornecedor, cpfFornecedor);
    }

    public Integer getRgFornecedor() {
        return rgFornecedor;
    }

    public void setRgFornecedor(Integer rgFornecedor) {
        Integer oldRgFornecedor = this.rgFornecedor;
        this.rgFornecedor = rgFornecedor;
        changeSupport.firePropertyChange("rgFornecedor", oldRgFornecedor, rgFornecedor);
    }

    public String getFoneFornecedor() {
        return foneFornecedor;
    }

    public void setFoneFornecedor(String foneFornecedor) {
        String oldFoneFornecedor = this.foneFornecedor;
        this.foneFornecedor = foneFornecedor;
        changeSupport.firePropertyChange("foneFornecedor", oldFoneFornecedor, foneFornecedor);
    }

    public String getCelFornecedor() {
        return celFornecedor;
    }

    public void setCelFornecedor(String celFornecedor) {
        String oldCelFornecedor = this.celFornecedor;
        this.celFornecedor = celFornecedor;
        changeSupport.firePropertyChange("celFornecedor", oldCelFornecedor, celFornecedor);
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        String oldEmailFornecedor = this.emailFornecedor;
        this.emailFornecedor = emailFornecedor;
        changeSupport.firePropertyChange("emailFornecedor", oldEmailFornecedor, emailFornecedor);
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        String oldEnderecoFornecedor = this.enderecoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        changeSupport.firePropertyChange("enderecoFornecedor", oldEnderecoFornecedor, enderecoFornecedor);
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        String oldBairroFornecedor = this.bairroFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        changeSupport.firePropertyChange("bairroFornecedor", oldBairroFornecedor, bairroFornecedor);
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        String oldCidadeFornecedor = this.cidadeFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        changeSupport.firePropertyChange("cidadeFornecedor", oldCidadeFornecedor, cidadeFornecedor);
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        String oldUfFornecedor = this.ufFornecedor;
        this.ufFornecedor = ufFornecedor;
        changeSupport.firePropertyChange("ufFornecedor", oldUfFornecedor, ufFornecedor);
    }

    public Integer getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(Integer cepFornecedor) {
        Integer oldCepFornecedor = this.cepFornecedor;
        this.cepFornecedor = cepFornecedor;
        changeSupport.firePropertyChange("cepFornecedor", oldCepFornecedor, cepFornecedor);
    }

    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    public void setSiteFornecedor(String siteFornecedor) {
        String oldSiteFornecedor = this.siteFornecedor;
        this.siteFornecedor = siteFornecedor;
        changeSupport.firePropertyChange("siteFornecedor", oldSiteFornecedor, siteFornecedor);
    }

    public String getFaxFornecedor() {
        return faxFornecedor;
    }

    public void setFaxFornecedor(String faxFornecedor) {
        String oldFaxFornecedor = this.faxFornecedor;
        this.faxFornecedor = faxFornecedor;
        changeSupport.firePropertyChange("faxFornecedor", oldFaxFornecedor, faxFornecedor);
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        String oldContatoFornecedor = this.contatoFornecedor;
        this.contatoFornecedor = contatoFornecedor;
        changeSupport.firePropertyChange("contatoFornecedor", oldContatoFornecedor, contatoFornecedor);
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        String oldTipoFornecedor = this.tipoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        changeSupport.firePropertyChange("tipoFornecedor", oldTipoFornecedor, tipoFornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFornecedor != null ? codFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codFornecedor == null && other.codFornecedor != null) || (this.codFornecedor != null && !this.codFornecedor.equals(other.codFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.view.Fornecedor[ codFornecedor=" + codFornecedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

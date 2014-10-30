/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import br.com.siscom.view.ClienteEditView;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

     
/** 
 *
 * @author moises
 */
@Entity
@Table(name = "cliente", catalog = "siscomjava", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByOrgaoCliente", query = "SELECT c FROM Cliente c WHERE c.orgaoCliente = :orgaoCliente"),
    @NamedQuery(name = "Cliente.findByNascimentoCliente", query = "SELECT c FROM Cliente c WHERE c.nascimentoCliente = :nascimentoCliente"),
    @NamedQuery(name = "Cliente.findByDesdeCliente", query = "SELECT c FROM Cliente c WHERE c.desdeCliente = :desdeCliente"),
    @NamedQuery(name = "Cliente.findByProfissaoCliente", query = "SELECT c FROM Cliente c WHERE c.profissaoCliente = :profissaoCliente"),
    @NamedQuery(name = "Cliente.findByEmpresaCliente", query = "SELECT c FROM Cliente c WHERE c.empresaCliente = :empresaCliente"),
    @NamedQuery(name = "Cliente.findByRendaCliente", query = "SELECT c FROM Cliente c WHERE c.rendaCliente = :rendaCliente"),
    @NamedQuery(name = "Cliente.findByTipoCliente", query = "SELECT c FROM Cliente c WHERE c.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "Cliente.findByCnpjCliente", query = "SELECT c FROM Cliente c WHERE c.cnpjCliente = :cnpjCliente"),
    @NamedQuery(name = "Cliente.findByReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.referenciaCliente = :referenciaCliente"),
    @NamedQuery(name = "Cliente.findByCpfCliente", query = "SELECT c FROM Cliente c WHERE c.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Cliente.findByRgCliente", query = "SELECT c FROM Cliente c WHERE c.rgCliente = :rgCliente"),
    @NamedQuery(name = "Cliente.findByFoneEmpresa", query = "SELECT c FROM Cliente c WHERE c.foneEmpresa = :foneEmpresa"),
    @NamedQuery(name = "Cliente.findByFoneReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.foneReferenciaCliente = :foneReferenciaCliente"),
    @NamedQuery(name = "Cliente.findByFoto", query = "SELECT c FROM Cliente c WHERE c.foto = :foto")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cliente")
    private Integer codCliente;
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "orgao_cliente")
    private String orgaoCliente;
    @Column(name = "nascimento_cliente")
    @Temporal(TemporalType.DATE)
    private Date nascimentoCliente;
    @Column(name = "desde_cliente")
    @Temporal(TemporalType.DATE)
    private Date desdeCliente;
    @Column(name = "profissao_cliente")
    private String profissaoCliente;
    @Column(name = "empresa_cliente")
    private String empresaCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "renda_cliente")
    private Float rendaCliente;
    @Column(name = "tipo_cliente")
    private String tipoCliente;
    @Column(name = "cnpj_cliente")
    private String cnpjCliente;
    @Column(name = "referencia_cliente")
    private String referenciaCliente;
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Column(name = "rg_cliente")
    private String rgCliente;
    @Column(name = "fone_empresa")
    private String foneEmpresa;
    @Column(name = "fone_referencia_cliente")
    private String foneReferenciaCliente;
    @Column(name = "foto")
    private String foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCliente")
    private List<ClienteEndereco> clienteEnderecoList;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getOrgaoCliente() {
        return orgaoCliente;
    }

    public void setOrgaoCliente(String orgaoCliente) {
        String oldOrgaoCliente = this.orgaoCliente;
        this.orgaoCliente = orgaoCliente;
        changeSupport.firePropertyChange("orgaoCliente", oldOrgaoCliente, orgaoCliente);
    }

    public Date getNascimentoCliente() {
        return nascimentoCliente;
    }

    public void setNascimentoCliente(Date nascimentoCliente) {
        Date oldNascimentoCliente = this.nascimentoCliente;
        this.nascimentoCliente = nascimentoCliente;
        changeSupport.firePropertyChange("nascimentoCliente", oldNascimentoCliente, nascimentoCliente);
    }

    public Date getDesdeCliente() {
        return desdeCliente;
        }

    public void setDesdeCliente(Date desdeCliente) {
        Date oldDesdeCliente = this.desdeCliente;
        this.desdeCliente = desdeCliente;
        changeSupport.firePropertyChange("desdeCliente", oldDesdeCliente, desdeCliente);
    }

    public String getProfissaoCliente() {
        return profissaoCliente;
    }

    public void setProfissaoCliente(String profissaoCliente) {
        String oldProfissaoCliente = this.profissaoCliente;
        this.profissaoCliente = profissaoCliente;
        changeSupport.firePropertyChange("profissaoCliente", oldProfissaoCliente, profissaoCliente);
    }

    public String getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(String empresaCliente) {
        String oldEmpresaCliente = this.empresaCliente;
        this.empresaCliente = empresaCliente;
        changeSupport.firePropertyChange("empresaCliente", oldEmpresaCliente, empresaCliente);
    }

    public Float getRendaCliente() {
        return rendaCliente;
    }

    public void setRendaCliente(Float rendaCliente) {
        Float oldRendaCliente = this.rendaCliente;
        this.rendaCliente = rendaCliente;
        changeSupport.firePropertyChange("rendaCliente", oldRendaCliente, rendaCliente);
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        String oldTipoCliente = this.tipoCliente;
        this.tipoCliente = tipoCliente;
        changeSupport.firePropertyChange("tipoCliente", oldTipoCliente, tipoCliente);
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        String oldCnpjCliente = this.cnpjCliente;
        this.cnpjCliente = cnpjCliente;
        changeSupport.firePropertyChange("cnpjCliente", oldCnpjCliente, cnpjCliente);
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        String oldReferenciaCliente = this.referenciaCliente;
        this.referenciaCliente = referenciaCliente;
        changeSupport.firePropertyChange("referenciaCliente", oldReferenciaCliente, referenciaCliente);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        String oldRgCliente = this.rgCliente;
        this.rgCliente = rgCliente;
        changeSupport.firePropertyChange("rgCliente", oldRgCliente, rgCliente);
    }

    public String getFoneEmpresa() {
        return foneEmpresa;
    }

    public void setFoneEmpresa(String foneEmpresa) {
        String oldFoneEmpresa = this.foneEmpresa;
        this.foneEmpresa = foneEmpresa;
        changeSupport.firePropertyChange("foneEmpresa", oldFoneEmpresa, foneEmpresa);
    }

    public String getFoneReferenciaCliente() {
        return foneReferenciaCliente;
    }

    public void setFoneReferenciaCliente(String foneReferenciaCliente) {
        String oldFoneReferenciaCliente = this.foneReferenciaCliente;
        this.foneReferenciaCliente = foneReferenciaCliente;
        changeSupport.firePropertyChange("foneReferenciaCliente", oldFoneReferenciaCliente, foneReferenciaCliente);
    }
    
    
     public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }
    
    
    /* public String getFoto() {
        return ClienteEditView.caminho;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = ClienteEditView.caminho;
        changeSupport.firePropertyChange("foto", oldFoto, ClienteEditView.caminho);
    }
    */
    
        public List<ClienteEndereco> getClienteEnderecoList() {
        return clienteEnderecoList;
    }

    public void setClienteEnderecoList(List<ClienteEndereco> clienteEnderecoList) {
        this.clienteEnderecoList = clienteEnderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Cliente[ codCliente=" + codCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
    
}

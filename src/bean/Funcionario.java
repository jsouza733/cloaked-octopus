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
@Table(name = "funcionario", catalog = "siscomjava", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByCodFuncionario", query = "SELECT f FROM Funcionario f WHERE f.codFuncionario = :codFuncionario"),
    @NamedQuery(name = "Funcionario.findByNomeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Funcionario.findByOrgaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.orgaoFuncionario = :orgaoFuncionario"),
    @NamedQuery(name = "Funcionario.findByFuncaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.funcaoFuncionario = :funcaoFuncionario"),
    @NamedQuery(name = "Funcionario.findByLoginFuncionario", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario"),
    @NamedQuery(name = "Funcionario.findBySenhaFuncionario", query = "SELECT f FROM Funcionario f WHERE f.senhaFuncionario = :senhaFuncionario"),
    @NamedQuery(name = "Funcionario.findByAdmissaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.admissaoFuncionario = :admissaoFuncionario"),
    @NamedQuery(name = "Funcionario.findByAcessoTotal", query = "SELECT f FROM Funcionario f WHERE f.acessoTotal = :acessoTotal"),
    @NamedQuery(name = "Funcionario.findByCpfFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cpfFuncionario = :cpfFuncionario"),
    @NamedQuery(name = "Funcionario.findByRgFuncionario", query = "SELECT f FROM Funcionario f WHERE f.rgFuncionario = :rgFuncionario"),
    @NamedQuery(name = "Funcionario.findByFoneFuncionario", query = "SELECT f FROM Funcionario f WHERE f.foneFuncionario = :foneFuncionario"),
    @NamedQuery(name = "Funcionario.findByCelFuncionario", query = "SELECT f FROM Funcionario f WHERE f.celFuncionario = :celFuncionario"),
    @NamedQuery(name = "Funcionario.findByEmailFuncionario", query = "SELECT f FROM Funcionario f WHERE f.emailFuncionario = :emailFuncionario"),
    @NamedQuery(name = "Funcionario.findByEnderecoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.enderecoFuncionario = :enderecoFuncionario"),
    @NamedQuery(name = "Funcionario.findByBairroFuncionario", query = "SELECT f FROM Funcionario f WHERE f.bairroFuncionario = :bairroFuncionario"),
    @NamedQuery(name = "Funcionario.findByCidadeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cidadeFuncionario = :cidadeFuncionario"),
    @NamedQuery(name = "Funcionario.findByUfFuncionario", query = "SELECT f FROM Funcionario f WHERE f.ufFuncionario = :ufFuncionario"),
    @NamedQuery(name = "Funcionario.findByCepFuncionario", query = "SELECT f FROM Funcionario f WHERE f.cepFuncionario = :cepFuncionario"),
    @NamedQuery(name = "Funcionario.findByFoto", query = "SELECT f FROM Funcionario f WHERE f.foto = :foto"),
    @NamedQuery(name = "Funcionario.findByDepartamentoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.departamentoFuncionario = :departamentoFuncionario"),
    @NamedQuery(name = "Funcionario.findByCodDepartamento", query = "SELECT f FROM Funcionario f WHERE f.codDepartamento = :codDepartamento")})
public class Funcionario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_funcionario")
    private Integer codFuncionario;
    @Column(name = "nome_funcionario")
    private String nomeFuncionario;
    @Column(name = "orgao_funcionario")
    private String orgaoFuncionario;
    @Column(name = "funcao_funcionario")
    private String funcaoFuncionario;
    @Column(name = "login_funcionario")
    private String loginFuncionario;
    @Column(name = "senha_funcionario")
    private String senhaFuncionario;
    @Column(name = "admissao_funcionario")
    private String admissaoFuncionario;
    @Column(name = "acesso_total")
    private String acessoTotal;
    @Column(name = "cpf_funcionario")
    private String cpfFuncionario;
    @Column(name = "rg_funcionario")
    private String rgFuncionario;
    @Column(name = "fone_funcionario")
    private String foneFuncionario;
    @Column(name = "cel_funcionario")
    private String celFuncionario;
    @Column(name = "email_funcionario")
    private String emailFuncionario;
    @Column(name = "endereco_funcionario")
    private String enderecoFuncionario;
    @Column(name = "bairro_funcionario")
    private String bairroFuncionario;
    @Column(name = "cidade_funcionario")
    private String cidadeFuncionario;
    @Column(name = "uf_funcionario")
    private String ufFuncionario;
    @Column(name = "cep_funcionario")
    private String cepFuncionario;
    @Column(name = "foto")
    private String foto;
    @Column(name = "departamento_funcionario")
    private String departamentoFuncionario;
    @Basic(optional = false)
    @Column(name = "cod_departamento")
    private int codDepartamento;

    public Funcionario() {
    }

    public Funcionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Funcionario(Integer codFuncionario, int codDepartamento) {
        this.codFuncionario = codFuncionario;
        this.codDepartamento = codDepartamento;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        String oldNomeFuncionario = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionario, nomeFuncionario);
    }

    public String getOrgaoFuncionario() {
        return orgaoFuncionario;
    }

    public void setOrgaoFuncionario(String orgaoFuncionario) {
        String oldOrgaoFuncionario = this.orgaoFuncionario;
        this.orgaoFuncionario = orgaoFuncionario;
        changeSupport.firePropertyChange("orgaoFuncionario", oldOrgaoFuncionario, orgaoFuncionario);
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        String oldFuncaoFuncionario = this.funcaoFuncionario;
        this.funcaoFuncionario = funcaoFuncionario;
        changeSupport.firePropertyChange("funcaoFuncionario", oldFuncaoFuncionario, funcaoFuncionario);
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        String oldLoginFuncionario = this.loginFuncionario;
        this.loginFuncionario = loginFuncionario;
        changeSupport.firePropertyChange("loginFuncionario", oldLoginFuncionario, loginFuncionario);
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        String oldSenhaFuncionario = this.senhaFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        changeSupport.firePropertyChange("senhaFuncionario", oldSenhaFuncionario, senhaFuncionario);
    }

    public String getAdmissaoFuncionario() {
        return admissaoFuncionario;
    }

    public void setAdmissaoFuncionario(String admissaoFuncionario) {
        String oldAdmissaoFuncionario = this.admissaoFuncionario;
        this.admissaoFuncionario = admissaoFuncionario;
        changeSupport.firePropertyChange("admissaoFuncionario", oldAdmissaoFuncionario, admissaoFuncionario);
    }

    public String getAcessoTotal() {
        return acessoTotal;
    }

    public void setAcessoTotal(String acessoTotal) {
        String oldAcessoTotal = this.acessoTotal;
        this.acessoTotal = acessoTotal;
        changeSupport.firePropertyChange("acessoTotal", oldAcessoTotal, acessoTotal);
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        String oldCpfFuncionario = this.cpfFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        changeSupport.firePropertyChange("cpfFuncionario", oldCpfFuncionario, cpfFuncionario);
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        String oldRgFuncionario = this.rgFuncionario;
        this.rgFuncionario = rgFuncionario;
        changeSupport.firePropertyChange("rgFuncionario", oldRgFuncionario, rgFuncionario);
    }

    public String getFoneFuncionario() {
        return foneFuncionario;
    }

    public void setFoneFuncionario(String foneFuncionario) {
        String oldFoneFuncionario = this.foneFuncionario;
        this.foneFuncionario = foneFuncionario;
        changeSupport.firePropertyChange("foneFuncionario", oldFoneFuncionario, foneFuncionario);
    }

    public String getCelFuncionario() {
        return celFuncionario;
    }

    public void setCelFuncionario(String celFuncionario) {
        String oldCelFuncionario = this.celFuncionario;
        this.celFuncionario = celFuncionario;
        changeSupport.firePropertyChange("celFuncionario", oldCelFuncionario, celFuncionario);
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        String oldEmailFuncionario = this.emailFuncionario;
        this.emailFuncionario = emailFuncionario;
        changeSupport.firePropertyChange("emailFuncionario", oldEmailFuncionario, emailFuncionario);
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        String oldEnderecoFuncionario = this.enderecoFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        changeSupport.firePropertyChange("enderecoFuncionario", oldEnderecoFuncionario, enderecoFuncionario);
    }

    public String getBairroFuncionario() {
        return bairroFuncionario;
    }

    public void setBairroFuncionario(String bairroFuncionario) {
        String oldBairroFuncionario = this.bairroFuncionario;
        this.bairroFuncionario = bairroFuncionario;
        changeSupport.firePropertyChange("bairroFuncionario", oldBairroFuncionario, bairroFuncionario);
    }

    public String getCidadeFuncionario() {
        return cidadeFuncionario;
    }

    public void setCidadeFuncionario(String cidadeFuncionario) {
        String oldCidadeFuncionario = this.cidadeFuncionario;
        this.cidadeFuncionario = cidadeFuncionario;
        changeSupport.firePropertyChange("cidadeFuncionario", oldCidadeFuncionario, cidadeFuncionario);
    }

    public String getUfFuncionario() {
        return ufFuncionario;
    }

    public void setUfFuncionario(String ufFuncionario) {
        String oldUfFuncionario = this.ufFuncionario;
        this.ufFuncionario = ufFuncionario;
        changeSupport.firePropertyChange("ufFuncionario", oldUfFuncionario, ufFuncionario);
    }

    public String getCepFuncionario() {
        return cepFuncionario;
    }

    public void setCepFuncionario(String cepFuncionario) {
        String oldCepFuncionario = this.cepFuncionario;
        this.cepFuncionario = cepFuncionario;
        changeSupport.firePropertyChange("cepFuncionario", oldCepFuncionario, cepFuncionario);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getDepartamentoFuncionario() {
        return departamentoFuncionario;
    }

    public void setDepartamentoFuncionario(String departamentoFuncionario) {
        String oldDepartamentoFuncionario = this.departamentoFuncionario;
        this.departamentoFuncionario = departamentoFuncionario;
        changeSupport.firePropertyChange("departamentoFuncionario", oldDepartamentoFuncionario, departamentoFuncionario);
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        int oldCodDepartamento = this.codDepartamento;
        this.codDepartamento = codDepartamento;
        changeSupport.firePropertyChange("codDepartamento", oldCodDepartamento, codDepartamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFuncionario != null ? codFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.codFuncionario == null && other.codFuncionario != null) || (this.codFuncionario != null && !this.codFuncionario.equals(other.codFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cadastro.Funcionario[ codFuncionario=" + codFuncionario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

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
@Table(name = "produto", catalog = "siscomjava", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodProduto", query = "SELECT p FROM Produto p WHERE p.codProduto = :codProduto"),
    @NamedQuery(name = "Produto.findByDescricaoProduto", query = "SELECT p FROM Produto p WHERE p.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Produto.findByVlrCompraProduto", query = "SELECT p FROM Produto p WHERE p.vlrCompraProduto = :vlrCompraProduto"),
    @NamedQuery(name = "Produto.findByVlrVendaProduto", query = "SELECT p FROM Produto p WHERE p.vlrVendaProduto = :vlrVendaProduto"),
    @NamedQuery(name = "Produto.findByEstoqueProduto", query = "SELECT p FROM Produto p WHERE p.estoqueProduto = :estoqueProduto"),
    @NamedQuery(name = "Produto.findByCriticoProduto", query = "SELECT p FROM Produto p WHERE p.criticoProduto = :criticoProduto"),
    @NamedQuery(name = "Produto.findByCodUnidade", query = "SELECT p FROM Produto p WHERE p.codUnidade = :codUnidade"),
    @NamedQuery(name = "Produto.findByCodFornecedor", query = "SELECT p FROM Produto p WHERE p.codFornecedor = :codFornecedor")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_produto")
    private Integer codProduto;
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vlr_compra_produto")
    private Double vlrCompraProduto;
    @Column(name = "vlr_venda_produto")
    private Double vlrVendaProduto;
    @Column(name = "estoque_produto")
    private Integer estoqueProduto;
    @Column(name = "critico_produto")
    private Integer criticoProduto;
    @Column(name = "cod_unidade")
    private Integer codUnidade;
    @Column(name = "cod_fornecedor")
    private Integer codFornecedor;

    public Produto() {
    }

    public Produto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        Integer oldCodProduto = this.codProduto;
        this.codProduto = codProduto;
        changeSupport.firePropertyChange("codProduto", oldCodProduto, codProduto);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public Double getVlrCompraProduto() {
        return vlrCompraProduto;
    }

    public void setVlrCompraProduto(Double vlrCompraProduto) {
        Double oldVlrCompraProduto = this.vlrCompraProduto;
        this.vlrCompraProduto = vlrCompraProduto;
        changeSupport.firePropertyChange("vlrCompraProduto", oldVlrCompraProduto, vlrCompraProduto);
    }

    public Double getVlrVendaProduto() {
        return vlrVendaProduto;
    }

    public void setVlrVendaProduto(Double vlrVendaProduto) {
        Double oldVlrVendaProduto = this.vlrVendaProduto;
        this.vlrVendaProduto = vlrVendaProduto;
        changeSupport.firePropertyChange("vlrVendaProduto", oldVlrVendaProduto, vlrVendaProduto);
    }

    public Integer getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Integer estoqueProduto) {
        Integer oldEstoqueProduto = this.estoqueProduto;
        this.estoqueProduto = estoqueProduto;
        changeSupport.firePropertyChange("estoqueProduto", oldEstoqueProduto, estoqueProduto);
    }

    public Integer getCriticoProduto() {
        return criticoProduto;
    }

    public void setCriticoProduto(Integer criticoProduto) {
        Integer oldCriticoProduto = this.criticoProduto;
        this.criticoProduto = criticoProduto;
        changeSupport.firePropertyChange("criticoProduto", oldCriticoProduto, criticoProduto);
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        Integer oldCodUnidade = this.codUnidade;
        this.codUnidade = codUnidade;
        changeSupport.firePropertyChange("codUnidade", oldCodUnidade, codUnidade);
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Produto[ codProduto=" + codProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

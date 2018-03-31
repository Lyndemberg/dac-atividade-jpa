package edu.ifpb.dac.naval.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Carga implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String origem;
    private String destino;
    @OneToMany
    private List<Produto> produtos;
    
    public Carga() {
        produtos = new ArrayList<>();
    }

    public Carga(String origem, String destino) {
        produtos = new ArrayList<>();
        this.origem = origem;
        this.destino = destino;
    }

    public Carga(String origem, String destino, List<Produto> produtos) {
        produtos = new ArrayList<>();
        this.origem = origem;
        this.destino = destino;
        this.produtos = produtos;
    }
    
    public void addProduto(Produto novo){
        produtos.add(novo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    
}

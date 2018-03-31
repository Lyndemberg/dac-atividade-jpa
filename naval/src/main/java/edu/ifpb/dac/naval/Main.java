package edu.ifpb.dac.naval;

import edu.ifpb.dac.naval.model.Carga;
import edu.ifpb.dac.naval.model.Categoria;
import edu.ifpb.dac.naval.model.Comandante;
import edu.ifpb.dac.naval.model.Navio;
import edu.ifpb.dac.naval.model.Produto;
import edu.ifpb.dac.naval.model.Transporte;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lyndemberg
 */
public class Main {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular", Categoria.Eletrônico);
        Produto dvd = new Produto("DVD", Categoria.Eletrônico);
        Produto compressor = new Produto("Compressor", Categoria.Ferramentas);
        Produto geladeira = new Produto("Geladeira Inox", Categoria.Eletrodoméstico);
        Carga carga = new Carga("Cajazeiras", "João Pessoa");
        carga.addProduto(celular);
        carga.addProduto(dvd);
        carga.addProduto(compressor);
        carga.addProduto(geladeira);
        Comandante sparrow = new Comandante("Jack Sparrow", "China");
        Navio navio = new Navio("Slice of life", 3880, "China", sparrow);
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu-naval");
        EntityManager em = emfactory.createEntityManager();
        
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Transporte transporte = new Transporte(new BigDecimal(2500), 
                LocalDate.of(2018, Month.OCTOBER, 23), navio, carga);
        em.merge(transporte);
        System.out.println("TRANSPORTE PERSISTIDO");
        transaction.commit();
        
        
    }
}

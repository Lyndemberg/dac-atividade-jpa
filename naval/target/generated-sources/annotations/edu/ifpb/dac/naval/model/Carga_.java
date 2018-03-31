package edu.ifpb.dac.naval.model;

import edu.ifpb.dac.naval.model.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T00:03:32")
@StaticMetamodel(Carga.class)
public class Carga_ { 

    public static volatile SingularAttribute<Carga, Integer> codigo;
    public static volatile ListAttribute<Carga, Produto> produtos;
    public static volatile SingularAttribute<Carga, String> origem;
    public static volatile SingularAttribute<Carga, String> destino;

}
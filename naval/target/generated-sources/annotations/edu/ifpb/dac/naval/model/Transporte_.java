package edu.ifpb.dac.naval.model;

import edu.ifpb.dac.naval.model.Carga;
import edu.ifpb.dac.naval.model.Navio;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T09:45:22")
@StaticMetamodel(Transporte.class)
public class Transporte_ { 

    public static volatile SingularAttribute<Transporte, Navio> navio;
    public static volatile SingularAttribute<Transporte, LocalDate> data;
    public static volatile SingularAttribute<Transporte, BigDecimal> valor;
    public static volatile SingularAttribute<Transporte, Integer> id;
    public static volatile SingularAttribute<Transporte, Carga> carga;

}
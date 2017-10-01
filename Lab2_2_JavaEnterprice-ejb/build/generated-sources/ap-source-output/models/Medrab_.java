package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Otdelenie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T09:06:04")
@StaticMetamodel(Medrab.class)
public class Medrab_ { 

    public static volatile SingularAttribute<Medrab, Otdelenie> otdelenie;
    public static volatile SingularAttribute<Medrab, Long> id;
    public static volatile SingularAttribute<Medrab, String> fio;
    public static volatile SingularAttribute<Medrab, Date> dr;

}
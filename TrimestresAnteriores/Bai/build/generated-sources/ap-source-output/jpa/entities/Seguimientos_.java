package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-09-04T23:54:58")
@StaticMetamodel(Seguimientos.class)
public class Seguimientos_ { 

    public static volatile SingularAttribute<Seguimientos, Date> createdAt;
    public static volatile SingularAttribute<Seguimientos, String> responsable;
    public static volatile SingularAttribute<Seguimientos, String> descripción;
    public static volatile SingularAttribute<Seguimientos, Long> id;
    public static volatile SingularAttribute<Seguimientos, String> productos;
    public static volatile SingularAttribute<Seguimientos, Date> updatedAt;

}
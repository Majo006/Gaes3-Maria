package entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-09-10T14:20:51")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, String> marca;
    public static volatile SingularAttribute<Productos, Date> createdAt;
    public static volatile SingularAttribute<Productos, BigDecimal> precio;
    public static volatile SingularAttribute<Productos, Integer> estado;
    public static volatile SingularAttribute<Productos, Long> id;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, Date> updatedAt;

}
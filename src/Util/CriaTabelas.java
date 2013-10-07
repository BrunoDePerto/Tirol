package Util;

import Model.Carregamento;
import Model.Veiculo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Bruno
 */
public class CriaTabelas {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        try {
            AnnotationConfiguration ac = new AnnotationConfiguration();
            ac.addAnnotatedClass(Carregamento.class);
            ac.addAnnotatedClass(Veiculo.class);
            sessionFactory = ac.configure().buildSessionFactory();
            SchemaExport se = new SchemaExport(ac);
            se.create(true, true);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }
}

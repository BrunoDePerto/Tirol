package Dao;

import Model.Veiculo;
import Util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Bruno
 */
public class VeiculoDaoImp implements VeiculoDao {

    @Override
    public void salvar(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.save(veiculo);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(veiculo);
        t.commit();
        session.close();
    }

    @Override
    public void apagar(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(veiculo);
        t.commit();
        session.close();
    }

    @Override
    public List<Veiculo> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Criteria criteria = session.createCriteria(Veiculo.class);
        List<Veiculo> veiculos = criteria.list();
        t.commit();
        session.close();
        return veiculos;
    }

    @Override
    public Veiculo getVeiculo(int idVeiculo) {
        return null;
    }
}

package Dao;

import Model.Veiculo;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
        } catch (Exception e) {
            t.rollback();
            System.out.println("Erro ao gravar veiculo: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.update(veiculo);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            System.out.println("Erro ao alterar veiculo: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public void apagar(Veiculo veiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.delete(veiculo);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            System.out.println("Erro ao apagar veiculo: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public List<Veiculo> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Veiculo> veiculos;
        try {
            Criteria criteria = session.createCriteria(Veiculo.class);
            veiculos = criteria.list();
            t.commit();
            return veiculos;
        } catch (Exception e) {
            t.rollback();
            System.out.println("Erro ao listar veiculo: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public Veiculo getVeiculo(int idVeiculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Veiculo veiculo;
        try {
            Criteria criteria = session.createCriteria(Veiculo.class);
            criteria.add(Restrictions.idEq(idVeiculo));
            veiculo = (Veiculo) criteria.uniqueResult();
            t.commit();
            return veiculo;
        } catch (Exception e) {
            t.rollback();
            System.out.println("Erro ao listar veiculo: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }
}

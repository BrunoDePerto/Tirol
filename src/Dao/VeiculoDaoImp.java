package Dao;

import Model.Veiculo;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
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
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao gravar veiculo", e);
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
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao alterar veiculo", e);
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
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao apagar veiculo", e);
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
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar veiculo", e);
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
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar veiculo", e);
        } finally {
            session.close();
        }
    }

    @Override
    public Veiculo getVeiculoNome(String nome) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Veiculo veiculo;
        try {
            Criteria criteria = session.createCriteria(Veiculo.class);
            criteria.add(Restrictions.eq("nome", nome));
            veiculo = (Veiculo) criteria.uniqueResult();
            t.commit();
            return veiculo;
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar veiculo", e);
        } finally {
            session.close();
        }
    }
}

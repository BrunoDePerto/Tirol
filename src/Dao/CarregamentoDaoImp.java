package Dao;

import Model.Carregamento;
import Util.HibernateUtil;
import java.util.Date;
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
public class CarregamentoDaoImp implements CarregamentoDao {

    @Override
    public void salvar(Carregamento carregamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.save(carregamento);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao gravar carregamento: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Carregamento carregamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.update(carregamento);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao alterar carregamento: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public void apagar(Carregamento carregamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            session.delete(carregamento);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao apagar carregamento: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public List<Carregamento> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Carregamento> carregamentos;
        try {
            Criteria criteria = session.createCriteria(Carregamento.class);
            carregamentos = criteria.list();
            t.commit();
            return carregamentos;
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar carregametno: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public Carregamento getCarregamento(int idCarregamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Carregamento carregamento;
        try {
            Criteria criteria = session.createCriteria(Carregamento.class);
            criteria.add(Restrictions.idEq(idCarregamento));
            carregamento = (Carregamento) criteria.uniqueResult();
            t.commit();
            return carregamento;
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar carregamento: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public List<Carregamento> listarCarregarDia(Date dataAtual) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Carregamento> carregamentos;
        try {
            Criteria criteria = session.createCriteria(Carregamento.class);
            criteria.add(Restrictions.eq("data", dataAtual));
            criteria.add(Restrictions.eq("situacao", 'N'));
            carregamentos = criteria.list();
            t.commit();
            return carregamentos;
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar carregamento por data: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public List<Carregamento> listarCarregadoDia(Date dataAtual) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Carregamento> carregamentos;
        try {
            Criteria criteria = session.createCriteria(Carregamento.class);
            criteria.add(Restrictions.eq("data", dataAtual));
            criteria.add(Restrictions.eq("situacao", 'C'));
            carregamentos = criteria.list();
            t.commit();
            return carregamentos;
        } catch (HibernateException e) {
            t.rollback();
            throw new HibernateException("Erro ao listar carregamento por data: " + e.getMessage());
        } finally {
            session.close();
        }
    }
}



package example.hibernate.persistencia;

import example.hibernate.model.Veiculo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VeiculoPersistencia  {
    protected static Session sessao;
    protected Transaction transacao;
   
    public void inserir( Veiculo obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    
    public void alterar( Veiculo obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void deletar( Veiculo obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public List<Veiculo> listar() throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(Veiculo.class);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }
     public Veiculo listar(Class clazz, String pk) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        //Object objt = sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
        Object ob =  sessao.load(clazz, new Integer(Integer.parseInt(pk)));
        transacao.commit();
        sessao.flush();
        sessao.close();
        return (Veiculo)ob;
    } 
    
}

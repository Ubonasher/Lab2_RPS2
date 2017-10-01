/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Medrab;

/**
 *
 * @author Григорий
 */
@Stateless
public class MedrabFacade extends AbstractFacade<Medrab> {
    
    @Resource
    SessionContext context;
    
    @PersistenceContext(unitName = "Lab2_2_JavaEnterprice-ejbPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public MedrabFacade() {
        super(Medrab.class);
    }
    
    @PostConstruct
    public void initmetod() {
        System.out.print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");        
    }
    
    public void abortTrans(Medrab m) {
        if (m.getId() == 0) {
            context.setRollbackOnly();
        }
    }
    
    public void abortTrans3() {
        context.setRollbackOnly();
    }
    
    public List<Medrab> getListForIf() {
        context.setRollbackOnly();
        List<Medrab> zas1 = em.createNamedQuery("getListForIf").setParameter("id", 3).setParameter("fio", "test0bd1").getResultList();
        return zas1;
    }
    
}

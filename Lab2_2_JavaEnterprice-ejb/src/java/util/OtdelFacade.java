/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Otdelenie;

/**
 *
 * @author Григорий
 */
@Stateless
public class OtdelFacade extends AbstractFacade<Otdelenie> {

    @PersistenceContext(unitName = "Lab2_2_JavaEnterprice-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OtdelFacade() {
        super(Otdelenie.class);
    }
    
}

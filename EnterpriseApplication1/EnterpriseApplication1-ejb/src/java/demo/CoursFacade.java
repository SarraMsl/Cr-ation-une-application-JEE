/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sara Mousselmal
 */
@Stateless
public class CoursFacade extends AbstractFacade<Cours> implements CoursFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoursFacade() {
        super(Cours.class);
    }
    
}

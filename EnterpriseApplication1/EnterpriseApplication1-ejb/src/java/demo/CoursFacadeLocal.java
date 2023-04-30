/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sara Mousselmal
 */
@Local
public interface CoursFacadeLocal {

    void create(Cours cours);

    void edit(Cours cours);

    void remove(Cours cours);

    Cours find(Object id);

    List<Cours> findAll();

    List<Cours> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpractice;

/**
 *
 * @author Alex
 */
public abstract class Burger {

    public String name = "none";
    
    public String getName () {
        return name;
    }
    
    public abstract double getCost();
    
}

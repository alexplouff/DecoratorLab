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
public class DoubleBurger extends Burger {
    
    public String getName(){
        return "Double Burger";
    }
    
    public double getCost(){
        return 6.99;
    }
}

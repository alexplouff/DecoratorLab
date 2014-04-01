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
public class SingleBurger extends Burger {
    
    @Override
    public String getName(){
        return "Single Burger";
    }
    
    @Override
    public double getCost(){
        return 4.99;
    }
    
}

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
public class AmericanCheese extends Cheese{
    
    private final Burger burger;
    
    public AmericanCheese(Burger burger){
        this.burger = burger;
    }
    
    @Override
    public String getName(){
        return "American";
    }
    
    @Override
    public double getCost(){
        return .79;
    }
}

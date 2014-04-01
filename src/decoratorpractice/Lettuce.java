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
public class Lettuce extends BurgerCondimentDecorator {

    private final Burger burger;
    
    public Lettuce (Burger burger){
        this.burger = burger;
    }
    
    @Override
    public String getName() {
        return "Lettuce";
    }
    
    @Override
    public double getCost(){
        return .79 + burger.getCost();
    }
    
    
    
}

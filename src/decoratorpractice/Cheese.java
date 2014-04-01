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
public abstract class Cheese extends BurgerCondimentDecorator {
    
    
    @Override
    public abstract String getName();
    
    @Override
    public abstract double getCost();
}

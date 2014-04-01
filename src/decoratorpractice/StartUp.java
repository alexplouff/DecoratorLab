/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpractice;

import java.text.NumberFormat;

/**
 *
 * @author Alex
 */
public class StartUp {
    public static void main(String[] args) {
        
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    Burger burger = new SingleBurger();
    
        System.out.println(burger.getName() + " " + 
                nf.format(burger.getCost()));
    
        Burger dblBurger = new DoubleBurger();
        
        dblBurger = new Lettuce(dblBurger);
        dblBurger = new Onion(dblBurger);
        dblBurger = new PepperJackCheese(dblBurger);
        
        System.out.println(dblBurger.getCost());
    
    }
    
//            Beverage beverage = new Espresso();
//        
//        // Espresso has not been decorated here.
//        System.out.println(beverage.getDescription()
//                + " " + nf.format(beverage.cost()));
//
//        Beverage beverage2 = new HouseBlend();
//        
//        // Now let's decorate HouseBlend like this...
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2); // double Mocha
//        beverage2 = new Whip(beverage2);
//        
//        // Resulting coffee has combined cost and description.
//        System.out.println(beverage2.getDescription()
//                + " " + nf.format(beverage2.cost()));
//    }

    
}

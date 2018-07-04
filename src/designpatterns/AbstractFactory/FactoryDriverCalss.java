/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.AbstractFactory;

import java.util.Random;

/**
 *
 * @author Shalitha Suranga
 */
public class FactoryDriverCalss {
    public static void main(String[] args) {
        final int type = Math.abs(new Random().nextInt()) % 2;
        Factory f = null;
        switch(type) {
            case 0:
                f = new LinuxFactory();
                break;
            case 1:
                f = new WindowsFactory();
                break;
        }
        Icon icon = f.getIcon();
        
        System.out.println(icon);
       
        
    }
}

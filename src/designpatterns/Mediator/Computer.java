/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Mediator;

/**
 *
 * @author Shalitha Suranga
 */
public class Computer {
    
    Mediator m;
    
    Computer(Mediator m) {
        this.m = m;
        this.m.registerComputer(this);
    }
    
    void receive(String message) {
        System.out.println("Computer got the message");
    }
}

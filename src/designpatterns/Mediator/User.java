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
public class User {
    Mediator m;
    
    User(Mediator m) {
        this.m = m;
        this.m.registerUser(this);
    }
    void send(String message){
        System.out.println("User send a new message ");
    }
}

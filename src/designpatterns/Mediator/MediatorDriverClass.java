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
public class MediatorDriverClass {
    public static void main(String[] args) {
        Mediator m = new Mediator();
        User u = new User(m);
        Computer c = new Computer(m);
        m.sendMessage("Hey..");
    }
}

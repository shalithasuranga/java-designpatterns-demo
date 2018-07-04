/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Observer;

/**
 *
 * @author Shalitha Suranga
 */
public class ObserverB extends Observer {
    
    ObserverB(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    void update() {
        System.out.println("B got message.." + subject.getState());
    }
    
    
}

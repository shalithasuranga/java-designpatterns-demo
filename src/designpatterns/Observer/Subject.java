/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Observer;

import java.util.ArrayList;

/**
 *
 * @author Shalitha Suranga
 */
public class Subject {
    private int state = 0;
    ArrayList <Observer> observers = new ArrayList();
    
    public void add(Observer o){
        this.observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    
    public void remove(Observer o){
        this.observers.remove(o);
    }
    
    public void notifyObservers() {
        for(Observer o : this.observers){
            o.update();
        }
    }
    
}


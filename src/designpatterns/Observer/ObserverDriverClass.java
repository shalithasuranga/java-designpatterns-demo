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
public class ObserverDriverClass {
    public static void main(String[] args) {
        Subject s = new Subject();
        new ObserverA(s);
        new ObserverB(s);
        s.setState(10);
    }
}

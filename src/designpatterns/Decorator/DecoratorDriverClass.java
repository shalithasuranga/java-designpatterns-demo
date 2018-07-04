/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Decorator;

/**
 *
 * @author Shalitha Suranga
 */
public class DecoratorDriverClass {
    public static void main(String[] args) {
        RedShapeDecorator redshape = new RedShapeDecorator(new Rectangle());
        BlueShapeDecorator blueshape = new BlueShapeDecorator(redshape);
        System.out.println(redshape.getName());
        System.out.println(blueshape.getName());
    }
}

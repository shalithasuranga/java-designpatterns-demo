/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Visitor;

/**
 *
 * @author Shalitha Suranga
 */
public class VisitorDriverClass {
    public static void main(String[] args) {
        FruitVisitor visitor = new FruitVisitor();
        Apple apple = new Apple();
        Orange orange = new Orange();
        apple.accept(visitor);
        orange.accept(visitor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Factory;

/**
 *
 * @author Shalitha Suranga
 */
public class FactoryDriverCalss {
    public static void main(String[] args) {
        WindowsFactory wf = new WindowsFactory();
        Icon windowsIcon = wf.getIcon();
        System.out.println(windowsIcon);
    }
}

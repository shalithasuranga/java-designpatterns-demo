/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Proxy;

/**
 *
 * @author Shalitha Suranga
 */
public class ProxyDriverClass {
    public static void main(String[] args) {
        ProxyATMMachine atmproxy = new ProxyATMMachine();
        atmproxy.withdraw();
        atmproxy.changePIN();
    }
}

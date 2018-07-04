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
public class ProxyATMMachine implements ATM{
    
    private final RealATMMachine realmachine = new RealATMMachine();

    @Override
    public void withdraw() {
        System.out.println("Yeah you can...");
        realmachine.withdraw();
    }

    @Override
    public void changePIN() {
        System.out.println("Oops!! you can't..");
    }
    
}

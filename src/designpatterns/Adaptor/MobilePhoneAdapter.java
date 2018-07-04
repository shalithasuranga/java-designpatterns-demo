/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Adaptor;

/**
 *
 * @author Shalitha Suranga
 */
public class MobilePhoneAdapter extends ToyMobile{
    private MobilePhone mobile = null;

    public MobilePhoneAdapter(MobilePhone mobile) {
        this.mobile = mobile;
    }

    @Override
    void fakeSound() {
        mobile.ring();
    }
    
    
}

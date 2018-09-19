package com.jc.serviceprovider1;

import com.jc.serviceproviderinterface.spi.ServiceProviderInterface;

public class ServiceProvider1 implements ServiceProviderInterface {

    @Override
    public void printServiceName() {
        System.out.println("This is service provider 1.");
    }
}

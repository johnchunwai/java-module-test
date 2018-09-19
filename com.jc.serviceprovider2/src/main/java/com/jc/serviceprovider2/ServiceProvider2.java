package com.jc.serviceprovider2;

import com.jc.serviceproviderinterface.spi.ServiceProviderInterface;

public class ServiceProvider2 implements ServiceProviderInterface {
    @Override
    public void printServiceName() {
        System.out.println("This is service provider 2!!");
    }
}

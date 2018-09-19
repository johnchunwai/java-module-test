package com.jc.serviceproviderinterface;

import com.jc.serviceproviderinterface.spi.ServiceProviderInterface;

import java.util.ServiceLoader;

public class Service {
    private static Service instance = new Service();

    public static Service instance() {
        return instance;
    }

    private Service() {}

    public void printServiceNames() {
        ServiceLoader<ServiceProviderInterface> serviceLoader = ServiceLoader.load(ServiceProviderInterface.class);
        serviceLoader.forEach(service -> service.printServiceName());
    }
}

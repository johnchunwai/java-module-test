module com.jc.serviceprovider1 {
    requires com.jc.serviceproviderinterface;

    provides com.jc.serviceproviderinterface.spi.ServiceProviderInterface with com.jc.serviceprovider1.ServiceProvider1;
}
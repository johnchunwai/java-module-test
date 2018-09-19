import com.jc.serviceproviderinterface.spi.ServiceProviderInterface;
import com.jc.serviceprovider2.ServiceProvider2;

module com.jc.serviceprovider2 {
    requires com.jc.serviceproviderinterface;

    provides ServiceProviderInterface with ServiceProvider2;
}
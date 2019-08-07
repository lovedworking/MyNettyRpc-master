package nettyRPC.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @program: NettyRpc-master
 * @description
 * @author: tkk fendoukaoziji
 * @create: 2019-08-07 18:23
 **/
public class ServiceRegistry {
    private static final Logger logger = LoggerFactory.getLogger(ServiceRegistry.class);
    private CountDownLatch latch = new CountDownLatch(1);
    private String registryAddress;
    public ServiceRegistry(String registryAddress) {
        this.registryAddress = registryAddress;
    }
}




















package myNettyRpc.test.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: NettyRpc-master
 * @description
 * @author: tkk fendoukaoziji
 * @create: 2019-08-07 18:47
 **/
public class RpcBootstrap {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("server-spring.xml");
    }
}

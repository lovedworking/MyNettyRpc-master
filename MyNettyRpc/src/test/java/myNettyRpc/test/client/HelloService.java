package myNettyRpc.test.client;

/**
 * @program: NettyRpc-master
 * @description
 * @author: tkk fendoukaoziji
 * @create: 2019-08-07 17:48
 **/
public interface HelloService {
    String hello(String name);
    String hello(Person person);

}

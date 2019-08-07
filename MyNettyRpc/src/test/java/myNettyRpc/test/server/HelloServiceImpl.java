package myNettyRpc.test.server;

import myNettyRpc.test.client.HelloService;
import myNettyRpc.test.client.Person;

/**
 * @program: NettyRpc-master
 * @description
 * @author: tkk fendoukaoziji
 * @create: 2019-08-07 17:59
 **/
public class HelloServiceImpl  implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello"+name;
    }

    @Override
    public String hello(Person person) {
        return "Hello"+person.firstName+" "+person.lastName;
    }
}

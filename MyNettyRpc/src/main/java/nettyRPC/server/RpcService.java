package nettyRPC.server;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: NettyRpc-master
 * @description
 * @author: tkk fendoukaoziji
 * @create: 2019-08-07 17:27
 **/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component //表示可以被Spring 扫描
public @interface RpcService {
    Class<?> value();
}

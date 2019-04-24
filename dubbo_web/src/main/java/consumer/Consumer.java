package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import provider.DemoService;

/**
 * Created by Administrator on 2017/12/12.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("tom");
        System.out.println(hello);

        System.in.read();// 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}

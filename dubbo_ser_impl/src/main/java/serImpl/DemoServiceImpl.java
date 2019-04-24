package serImpl;

import provider.DemoService;

/**
 * Created by Administrator on 2017/12/11.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

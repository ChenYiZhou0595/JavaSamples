package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPurchasing implements InvocationHandler {

    private Object object;

    public DynamicPurchasing(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(object, objects);
        if ("buy".equals(method.getName())) {
            System.out.println("Chen is buying");
        }
        return result;
    }
}

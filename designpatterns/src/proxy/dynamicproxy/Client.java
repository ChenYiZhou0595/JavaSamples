package proxy.dynamicproxy;

import proxy.staticproxy.Chen;
import proxy.staticproxy.IShop;

import java.lang.reflect.Proxy;
/**
 * 调用 Proxy.newProxyInstance（）来生成动态代理类，调用 purchasing DynamicPurchasing的invoke方法。
 */
public class Client {

    public static void main(String[] args) {
        IShop chen = new Chen();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(chen);
        ClassLoader classLoader = chen.getClass().getClassLoader();
        IShop purchasing = (IShop) Proxy.newProxyInstance(classLoader, new Class[]{IShop.class}, dynamicPurchasing);
        purchasing.buy();
    }
}

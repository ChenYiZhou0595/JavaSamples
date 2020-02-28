package src;

import java.io.ObjectStreamException;

/**
 * 静态内部类单例模式
 * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载 SingletonHolder 并初始化 sInstance。
 * 这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。所以，推 荐使用静态内部类单例模式。
 */
public class Singleton5 {

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return Singleton5Holder.instance;
    }

    private static class Singleton5Holder {
        private static final Singleton5 instance = new Singleton5();
    }
}

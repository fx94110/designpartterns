package us.codecraft.tinyioc.singleton;

/**
 * 内部类 Holder lazy class , Thread-safe,没有double-check的混乱
 * @Author: FangXu
 * @Date: 2020/7/22 11:17
 * @Version 1.0
 */
public class HolderSingleton {

    private static class InstanceHolder {
        private static final HolderSingleton SINGLETON = new HolderSingleton();
    }

    private HolderSingleton() {

    }

    public static HolderSingleton getInstance() {
        return InstanceHolder.SINGLETON;
    }
}

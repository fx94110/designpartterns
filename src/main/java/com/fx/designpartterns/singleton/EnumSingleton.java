package us.codecraft.tinyioc.singleton;

/**
 * 枚举类型
 * @Author: FangXu
 * @Date: 2020/7/22 14:32
 * @Version 1.0
 */
public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton() {
    }

    public void saySomething(String name) {
        System.out.println("Hello: " + name);
    }
}

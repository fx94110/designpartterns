package com.fx.designpartterns.singleton;

import java.util.concurrent.ExecutorService;

/**
 * double check 机制
 * @Author: FangXu
 * @Date: 2020/7/22 10:58
 * @Version 1.0
 */
public class DoubleCheckSingleton {
    // volatile 反正jvm重排序
    private static volatile DoubleCheckSingleton singleton = null;

    private static ExecutorService executorService;

    private DoubleCheckSingleton() {

    }

    private static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}

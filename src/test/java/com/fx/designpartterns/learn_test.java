package com.fx.designpartterns;

import com.fx.designpartterns.build.Result;
import com.fx.designpartterns.build.ResultBuild;
import com.fx.designpartterns.build.ResultTypeEnum;
import org.junit.Test;

/**
 * @Author: FangXu
 * @Date: 2020/7/23 20:26
 * @Version 1.0
 */
public class learn_test {
    @Test
    public void testBuild() {
        Result result = ResultBuild.newInstance().type(ResultTypeEnum.SUCCESS)
                .code("0000")
                .message("success")
                .data("请求成功")
                .build();
        System.out.println(result);
    }
}

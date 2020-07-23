package com.fx.designpartterns.proxy;

import java.util.List;

/**
 * @Author: FangXu
 * @Date: 2020/7/15 19:17
 * @Version 1.0
 */
public interface BookDao {

    int save(Book book);
    int delete(Long id);
    int update(Book book);
    List<Book> list();
}

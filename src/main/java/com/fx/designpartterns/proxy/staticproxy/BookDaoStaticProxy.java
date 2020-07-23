package com.fx.designpartterns.proxy.staticproxy;


import com.fx.designpartterns.proxy.Book;
import com.fx.designpartterns.proxy.BookDao;

import java.util.List;

/**
 * 静态代理
 * @Author: FangXu
 * @Date: 2020/7/17 16:28
 * @Version 1.0
 */
public class BookDaoStaticProxy implements BookDao {


    private BookDao bookDao;

    public BookDaoStaticProxy(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public int save(Book book) {
        System.out.println("开启事务");
        bookDao.save(book);
        System.out.println("关闭事务");
        return 0;
    }

    @Override
    public int delete(Long id) {
        System.out.println("开启事务");
        bookDao.delete(id);
        System.out.println("关闭事务");
        return 0;
    }

    @Override
    public int update(Book book) {
        System.out.println("开启事务");
        bookDao.update(book);
        System.out.println("关闭事务");
        return 0;
    }

    @Override
    public List<Book> list() {
        System.out.println("开启事务");
        bookDao.list();
        System.out.println("关闭事务");
        return null;
    }
}

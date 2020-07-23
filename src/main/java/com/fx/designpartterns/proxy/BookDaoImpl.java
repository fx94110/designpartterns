package us.codecraft.tinyioc.proxy;

import java.util.List;

/**
 * @Author: FangXu
 * @Date: 2020/7/15 19:19
 * @Version 1.0
 */
public class BookDaoImpl implements BookDao {
    @Override
    public int save(Book book) {
        System.out.println("save book==>" + book);
        return 0;
    }

    @Override
    public int delete(Long id) {
        System.out.println("delete book by id==>" + id);
        return 0;
    }

    @Override
    public int update(Book book) {
        System.out.println("update book==>" + book);
        return 0;
    }

    @Override
    public List<Book> list() {
        System.out.println("list books==>");
        return null;
    }
}

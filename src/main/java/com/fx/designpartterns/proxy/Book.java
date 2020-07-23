package us.codecraft.tinyioc.proxy;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: FangXu
 * @Date: 2020/7/15 19:15
 * @Version 1.0
 */
public class Book implements Serializable {

    private Long id;
    private String name;
    private String isBn;
    private List<String> publishers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsBn() {
        return isBn;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isBn='" + isBn + '\'' +
                ", publishers=" + publishers +
                '}';
    }
}

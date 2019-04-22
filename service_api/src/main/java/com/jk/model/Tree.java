/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Tree
 * Author:   dell
 * Date:     2019/4/20 22:28
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import java.io.Serializable;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author dell
 * @create 2019/4/20
 * @since 1.0.0
 */
public class Tree implements Serializable {

    private static final long serialVersionUID = 4971583831825963652L;
    private Integer id;
    private String text;
    private String href;
    private Integer pid;
    private List<Tree> nodes;
    private boolean selectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<Tree> getNodes() {
        return nodes;
    }

    public void setNodes(List<Tree> nodes) {
        this.nodes = nodes;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }
}

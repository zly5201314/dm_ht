package com.jk.model;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>项目名称：springcloud
 * 类名称：TreeController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/13 11:20
 * 修改人：张利瑶
 * 修改时间：2019/4/13 11:20
 * 修改备注：
 * @version </pre>
 */
public class TreeBean implements Serializable {
    private static final long serialVersionUID = -1845403875637557441L;

    private Integer id;

    private String text;

    private String href;

    private Integer pid;

    private List<TreeBean> nodes;

    private  Boolean selectable;

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

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return "TreeController{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }
}

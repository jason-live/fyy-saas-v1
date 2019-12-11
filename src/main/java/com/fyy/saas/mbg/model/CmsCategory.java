package com.fyy.saas.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CmsCategory implements Serializable {
    /**
     * 主键ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 父ID, 0-表示第一层级
     *
     * @mbggenerated
     */
    private Long pid;

    /**
     * 名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 中文首字母
     *
     * @mbggenerated
     */
    private String firstLetter;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     *
     * @mbggenerated
     */
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     *
     * @mbggenerated
     */
    private Integer showStatus;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * 图标
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 关键字
     *
     * @mbggenerated
     */
    private String keywords;

    /**
     * 记录创建时间
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * 记录修改时间
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * 记录创建人
     *
     * @mbggenerated
     */
    private Long subCreate;

    /**
     * 记录修改人
     *
     * @mbggenerated
     */
    private Long subModified;

    /**
     * 类型: 0-未删除 1-删除
     *
     * @mbggenerated
     */
    private Byte isDelete;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getSubCreate() {
        return subCreate;
    }

    public void setSubCreate(Long subCreate) {
        this.subCreate = subCreate;
    }

    public Long getSubModified() {
        return subModified;
    }

    public void setSubModified(Long subModified) {
        this.subModified = subModified;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", subCreate=").append(subCreate);
        sb.append(", subModified=").append(subModified);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
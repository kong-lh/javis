package com.ruoyi.project.money.building.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 教学楼管理对象 building
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
public class Building extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 教学楼名 */
    @Excel(name = "教学楼名")
    private String name;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkman;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String linkphone;

    /** 面积 */
    @Excel(name = "面积")
    private String area;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cretime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creuser;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updtime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String upduser;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setLinkman(String linkman)
    {
        this.linkman = linkman;
    }

    public String getLinkman()
    {
        return linkman;
    }
    public void setLinkphone(String linkphone)
    {
        this.linkphone = linkphone;
    }

    public String getLinkphone()
    {
        return linkphone;
    }
    public void setArea(String area)
    {
        this.area = area;
    }

    public String getArea()
    {
        return area;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setCretime(Date cretime)
    {
        this.cretime = cretime;
    }

    public Date getCretime()
    {
        return cretime;
    }
    public void setCreuser(String creuser)
    {
        this.creuser = creuser;
    }

    public String getCreuser()
    {
        return creuser;
    }
    public void setUpdtime(Date updtime)
    {
        this.updtime = updtime;
    }

    public Date getUpdtime()
    {
        return updtime;
    }
    public void setUpduser(String upduser)
    {
        this.upduser = upduser;
    }

    public String getUpduser()
    {
        return upduser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("linkman", getLinkman())
            .append("linkphone", getLinkphone())
            .append("area", getArea())
            .append("address", getAddress())
            .append("cretime", getCretime())
            .append("creuser", getCreuser())
            .append("updtime", getUpdtime())
            .append("upduser", getUpduser())
            .toString();
    }
}

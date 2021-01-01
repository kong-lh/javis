package com.ruoyi.project.money.classroom.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 教室管理对象 classroom
 * 
 * @author kong-lh
 * @date 2020-12-27
 */
public class Classroom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 教室名称 */
    @Excel(name = "教室名称")
    private String name;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkman;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String linkphone;

    /** 所属教学楼 */
    @Excel(name = "所属教学楼")
    private Integer buildingid;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 电脑数量 */
    @Excel(name = "电脑数量")
    private Integer computercount;

    /** 教室状态 */
    @Excel(name = "教室状态")
    private String status;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cretime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creuser;

    /** 更新人 */
    @Excel(name = "更新人", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updtime;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private String upduser;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
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
    public void setBuildingid(Integer buildingid)
    {
        this.buildingid = buildingid;
    }

    public Integer getBuildingid()
    {
        return buildingid;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setComputercount(Integer computercount)
    {
        this.computercount = computercount;
    }

    public Integer getComputercount()
    {
        return computercount;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
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
            .append("buildingid", getBuildingid())
            .append("address", getAddress())
            .append("computercount", getComputercount())
            .append("status", getStatus())
            .append("cretime", getCretime())
            .append("creuser", getCreuser())
            .append("updtime", getUpdtime())
            .append("upduser", getUpduser())
            .toString();
    }
}

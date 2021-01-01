package com.ruoyi.project.money.computer.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 电脑管理对象 computer
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
public class Computer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电脑IP */
    @Excel(name = "电脑IP")
    private String ip;

    /** 电脑MAC地址 */
    @Excel(name = "电脑MAC地址")
    private String mac;

    /** 教室 */
    @Excel(name = "教室")
    private String classroomid;

    /** 教学楼 */
    @Excel(name = "教学楼")
    private String buildingid;

    /** 电脑类型 */
    @Excel(name = "电脑类型")
    private String type;

    /** 是否在用 */
    @Excel(name = "是否在用")
    private String isuse;

    /** 电脑状态 */
    @Excel(name = "电脑状态")
    private String status;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 电脑品牌 */
    @Excel(name = "电脑品牌")
    private String factory;

    /** 电脑型号 */
    @Excel(name = "电脑型号")
    private String modelid;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cretime;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updtime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creuser;

    /** 更新人 */
    @Excel(name = "更新人")
    private String upduser;

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public String getIp()
    {
        return ip;
    }
    public void setMac(String mac)
    {
        this.mac = mac;
    }

    public String getMac()
    {
        return mac;
    }
    public void setClassroomid(String classroomid)
    {
        this.classroomid = classroomid;
    }

    public String getClassroomid()
    {
        return classroomid;
    }
    public void setBuildingid(String buildingid)
    {
        this.buildingid = buildingid;
    }

    public String getBuildingid()
    {
        return buildingid;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setIsuse(String isuse)
    {
        this.isuse = isuse;
    }

    public String getIsuse()
    {
        return isuse;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setFactory(String factory)
    {
        this.factory = factory;
    }

    public String getFactory()
    {
        return factory;
    }
    public void setModelid(String modelid)
    {
        this.modelid = modelid;
    }

    public String getModelid()
    {
        return modelid;
    }
    public void setCretime(Date cretime)
    {
        this.cretime = cretime;
    }

    public Date getCretime()
    {
        return cretime;
    }
    public void setUpdtime(Date updtime)
    {
        this.updtime = updtime;
    }

    public Date getUpdtime()
    {
        return updtime;
    }
    public void setCreuser(String creuser)
    {
        this.creuser = creuser;
    }

    public String getCreuser()
    {
        return creuser;
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
            .append("ip", getIp())
            .append("mac", getMac())
            .append("classroomid", getClassroomid())
            .append("buildingid", getBuildingid())
            .append("type", getType())
            .append("isuse", getIsuse())
            .append("status", getStatus())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("factory", getFactory())
            .append("modelid", getModelid())
            .append("cretime", getCretime())
            .append("updtime", getUpdtime())
            .append("creuser", getCreuser())
            .append("upduser", getUpduser())
            .toString();
    }
}

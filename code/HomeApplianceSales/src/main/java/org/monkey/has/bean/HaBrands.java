package org.monkey.has.bean;

import java.util.Date;

/**
 * 
 * @author Monkey
 *
 */
public class HaBrands {
    private int id;
    private String brandsNo;
    private String brandsName;
    private int creatorId;
    private Date createTime;
    private char status;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrandsNo() {
        return brandsNo;
    }
    public void setBrandsNo(String brandsNo) {
        this.brandsNo = brandsNo;
    }
    public String getBrandsName() {
        return brandsName;
    }
    public void setBrandsName(String brandsName) {
        this.brandsName = brandsName;
    }
    public int getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "HaBrands [id=" + id + ", brandsNo=" + brandsNo + ", brandsName=" + brandsName + ", creatorId="
                + creatorId + ", createTime=" + createTime + ", status=" + status + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brandsName == null) ? 0 : brandsName.hashCode());
        result = prime * result + ((brandsNo == null) ? 0 : brandsNo.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + creatorId;
        result = prime * result + id;
        result = prime * result + status;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HaBrands other = (HaBrands) obj;
        if (brandsName == null) {
            if (other.brandsName != null)
                return false;
        } else if (!brandsName.equals(other.brandsName))
            return false;
        if (brandsNo == null) {
            if (other.brandsNo != null)
                return false;
        } else if (!brandsNo.equals(other.brandsNo))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        } else if (!createTime.equals(other.createTime))
            return false;
        if (creatorId != other.creatorId)
            return false;
        if (id != other.id)
            return false;
        if (status != other.status)
            return false;
        return true;
    }
    
}

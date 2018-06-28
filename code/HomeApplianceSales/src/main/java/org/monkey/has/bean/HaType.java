package org.monkey.has.bean;

import java.util.Date;

/**
 * 
 * @author Monkey
 *
 */
public class HaType {
    private int id;
    private String typeNo;
    private String typeName;
    private int creatorId;
    private Date createTime;
    private char status;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTypeNo() {
        return typeNo;
    }
    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        return "HaType [id=" + id + ", typeNo=" + typeNo + ", typeName=" + typeName + ", creatorId=" + creatorId
                + ", createTime=" + createTime + ", status=" + status + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + creatorId;
        result = prime * result + id;
        result = prime * result + status;
        result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
        result = prime * result + ((typeNo == null) ? 0 : typeNo.hashCode());
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
        HaType other = (HaType) obj;
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
        if (typeName == null) {
            if (other.typeName != null)
                return false;
        } else if (!typeName.equals(other.typeName))
            return false;
        if (typeNo == null) {
            if (other.typeNo != null)
                return false;
        } else if (!typeNo.equals(other.typeNo))
            return false;
        return true;
    }
}

package org.monkey.has.bean;

import java.util.Date;

/**
 * 
 * @author Monkey
 *
 */
public class Ha {
    
    private int id;
    private String model;
    private double price;
    private int inventory;
    private int brandsId;
    private int typeId;
    private int cteatorId;
    private Date createTime;
    private char status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getBrandsId() {
        return brandsId;
    }

    public void setBrandsId(int brandsId) {
        this.brandsId = brandsId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCteatorId() {
        return cteatorId;
    }

    public void setCteatorId(int cteatorId) {
        this.cteatorId = cteatorId;
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
        return "Ha [id=" + id + ", model=" + model + ", price=" + price + ", inventory=" + inventory + ", brandsId="
                + brandsId + ", typeId=" + typeId + ", cteatorId=" + cteatorId + ", createTime=" + createTime
                + ", status=" + status + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + brandsId;
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + cteatorId;
        result = prime * result + id;
        result = prime * result + inventory;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + status;
        result = prime * result + typeId;
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
        Ha other = (Ha) obj;
        if (brandsId != other.brandsId)
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        } else if (!createTime.equals(other.createTime))
            return false;
        if (cteatorId != other.cteatorId)
            return false;
        if (id != other.id)
            return false;
        if (inventory != other.inventory)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (status != other.status)
            return false;
        if (typeId != other.typeId)
            return false;
        return true;
    }

}

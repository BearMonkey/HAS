package org.monkey.has.dao;

import java.util.List;

import org.monkey.has.bean.HaBrands;

/**
 * 
 * @author Monkey
 *
 */
public interface IHaBrandsDao {
    /**
     * insert
     * @param ha
     */
    public void insert(HaBrands ha);
    /**
     * delete
     * @param id
     */
    public void delete(int id);
    /**
     * update
     * @param ha
     */
    public void update(HaBrands ha);
    /**
     * selectById
     * @param id
     * @return
     */
    public HaBrands selectById(int id);
    /**
     * selectAll
     * @return
     */
    public List<HaBrands> selectAll();
}

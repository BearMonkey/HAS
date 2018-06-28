package org.monkey.has.dao;

import java.util.List;

import org.monkey.has.bean.Ha;

/**
 * 
 * @author Monkey
 *
 */
public interface IHaDao {
    /**
     * insert
     * @param ha
     */
    public void insert(Ha ha);
    /**
     * delete
     * @param id
     */
    public void delete(int id);
    /**
     * update
     * @param ha
     */
    public void update(Ha ha);
    /**
     * selectById
     * @param id
     * @return
     */
    public Ha selectById(int id);
    /**
     * selectAll
     * @return
     */
    public List<Ha> selectAll();
    
}

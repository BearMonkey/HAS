package org.monkey.has.dao;

import java.util.List;

import org.monkey.has.bean.HaType;
/**
 * 
 * @author Monkey
 *
 */
public interface IHaTypeDao {
    /**
     * insert
     * @param ha
     */
    public void insert(HaType haType);
    /**
     * delete
     * @param id
     */
    public void delete(int id);
    /**
     * update
     * @param ha
     */
    public void update(HaType haType);
    /**
     * selectById
     * @param id
     * @return
     */
    public HaType selectById(int id);
    /**
     * selectAll
     * @return
     */
    public List<HaType> selectAll();
}

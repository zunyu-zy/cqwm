package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    @Select("SELECT setmeal_id FROM setmeal_dish WHERE dish_id  ")
    List< Long> getSetmealIdsByDishIds(List<Long> dishIds);
    /**
     * 批量保存套餐菜品数据
     * @param setmealDishes
     */

    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除套餐菜品数据
     * @param id
     * @return
     */
    @Delete("DELETE FROM setmeal_dish WHERE setmeal_id = #{id}")
    void deleteBySetmealId(Long id);

    /**
     * 根据套餐id查询套餐菜品数据
     * @param setmealId
     * @return
     */
    @Select("SELECT * FROM setmeal_dish WHERE setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);
}

package com.dao;

import com.entity.GuangrongbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuangrongbangView;

/**
 * 光荣榜 Dao 接口
 *
 * @author 
 */
public interface GuangrongbangDao extends BaseMapper<GuangrongbangEntity> {

   List<GuangrongbangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

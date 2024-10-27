package com.dao;

import com.entity.LishijingpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LishijingpaiVO;
import com.entity.view.LishijingpaiView;


/**
 * 历史竞拍
 * 
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
public interface LishijingpaiDao extends BaseMapper<LishijingpaiEntity> {
	
	List<LishijingpaiVO> selectListVO(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
	
	LishijingpaiVO selectVO(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
	
	List<LishijingpaiView> selectListView(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);

	List<LishijingpaiView> selectListView(Pagination page,@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
	
	LishijingpaiView selectView(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
	
}

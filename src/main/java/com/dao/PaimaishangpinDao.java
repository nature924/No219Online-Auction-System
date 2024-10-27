package com.dao;

import com.entity.PaimaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaimaishangpinVO;
import com.entity.view.PaimaishangpinView;


/**
 * 拍卖商品
 * 
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
public interface PaimaishangpinDao extends BaseMapper<PaimaishangpinEntity> {
	
	List<PaimaishangpinVO> selectListVO(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
	
	PaimaishangpinVO selectVO(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
	
	List<PaimaishangpinView> selectListView(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);

	List<PaimaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
	
	PaimaishangpinView selectView(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
	
}

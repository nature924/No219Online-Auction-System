package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaimaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaimaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaimaishangpinView;


/**
 * 拍卖商品
 *
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
public interface PaimaishangpinService extends IService<PaimaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaimaishangpinVO> selectListVO(Wrapper<PaimaishangpinEntity> wrapper);
   	
   	PaimaishangpinVO selectVO(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
   	
   	List<PaimaishangpinView> selectListView(Wrapper<PaimaishangpinEntity> wrapper);
   	
   	PaimaishangpinView selectView(@Param("ew") Wrapper<PaimaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaimaishangpinEntity> wrapper);
   	
}


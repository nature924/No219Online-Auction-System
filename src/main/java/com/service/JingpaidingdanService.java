package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingpaidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingpaidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingpaidingdanView;


/**
 * 竞拍订单
 *
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
public interface JingpaidingdanService extends IService<JingpaidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingpaidingdanVO> selectListVO(Wrapper<JingpaidingdanEntity> wrapper);
   	
   	JingpaidingdanVO selectVO(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
   	
   	List<JingpaidingdanView> selectListView(Wrapper<JingpaidingdanEntity> wrapper);
   	
   	JingpaidingdanView selectView(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingpaidingdanEntity> wrapper);
   	
}


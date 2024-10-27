package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LishijingpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LishijingpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LishijingpaiView;


/**
 * 历史竞拍
 *
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
public interface LishijingpaiService extends IService<LishijingpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LishijingpaiVO> selectListVO(Wrapper<LishijingpaiEntity> wrapper);
   	
   	LishijingpaiVO selectVO(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
   	
   	List<LishijingpaiView> selectListView(Wrapper<LishijingpaiEntity> wrapper);
   	
   	LishijingpaiView selectView(@Param("ew") Wrapper<LishijingpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LishijingpaiEntity> wrapper);
   	
}


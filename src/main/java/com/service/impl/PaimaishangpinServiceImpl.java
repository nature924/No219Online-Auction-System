package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PaimaishangpinDao;
import com.entity.PaimaishangpinEntity;
import com.service.PaimaishangpinService;
import com.entity.vo.PaimaishangpinVO;
import com.entity.view.PaimaishangpinView;

@Service("paimaishangpinService")
public class PaimaishangpinServiceImpl extends ServiceImpl<PaimaishangpinDao, PaimaishangpinEntity> implements PaimaishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaimaishangpinEntity> page = this.selectPage(
                new Query<PaimaishangpinEntity>(params).getPage(),
                new EntityWrapper<PaimaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaimaishangpinEntity> wrapper) {
		  Page<PaimaishangpinView> page =new Query<PaimaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaimaishangpinVO> selectListVO(Wrapper<PaimaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaimaishangpinVO selectVO(Wrapper<PaimaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaimaishangpinView> selectListView(Wrapper<PaimaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaimaishangpinView selectView(Wrapper<PaimaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

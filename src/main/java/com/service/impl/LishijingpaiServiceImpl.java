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


import com.dao.LishijingpaiDao;
import com.entity.LishijingpaiEntity;
import com.service.LishijingpaiService;
import com.entity.vo.LishijingpaiVO;
import com.entity.view.LishijingpaiView;

@Service("lishijingpaiService")
public class LishijingpaiServiceImpl extends ServiceImpl<LishijingpaiDao, LishijingpaiEntity> implements LishijingpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LishijingpaiEntity> page = this.selectPage(
                new Query<LishijingpaiEntity>(params).getPage(),
                new EntityWrapper<LishijingpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LishijingpaiEntity> wrapper) {
		  Page<LishijingpaiView> page =new Query<LishijingpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LishijingpaiVO> selectListVO(Wrapper<LishijingpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LishijingpaiVO selectVO(Wrapper<LishijingpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LishijingpaiView> selectListView(Wrapper<LishijingpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LishijingpaiView selectView(Wrapper<LishijingpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

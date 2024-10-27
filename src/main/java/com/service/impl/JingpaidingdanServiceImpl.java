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


import com.dao.JingpaidingdanDao;
import com.entity.JingpaidingdanEntity;
import com.service.JingpaidingdanService;
import com.entity.vo.JingpaidingdanVO;
import com.entity.view.JingpaidingdanView;

@Service("jingpaidingdanService")
public class JingpaidingdanServiceImpl extends ServiceImpl<JingpaidingdanDao, JingpaidingdanEntity> implements JingpaidingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingpaidingdanEntity> page = this.selectPage(
                new Query<JingpaidingdanEntity>(params).getPage(),
                new EntityWrapper<JingpaidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingpaidingdanEntity> wrapper) {
		  Page<JingpaidingdanView> page =new Query<JingpaidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingpaidingdanVO> selectListVO(Wrapper<JingpaidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingpaidingdanVO selectVO(Wrapper<JingpaidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingpaidingdanView> selectListView(Wrapper<JingpaidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingpaidingdanView selectView(Wrapper<JingpaidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

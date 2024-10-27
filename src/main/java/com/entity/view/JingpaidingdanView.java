package com.entity.view;

import com.entity.JingpaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞拍订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
@TableName("jingpaidingdan")
public class JingpaidingdanView  extends JingpaidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingpaidingdanView(){
	}
 
 	public JingpaidingdanView(JingpaidingdanEntity jingpaidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jingpaidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

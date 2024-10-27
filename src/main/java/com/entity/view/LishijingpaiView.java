package com.entity.view;

import com.entity.LishijingpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 历史竞拍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
@TableName("lishijingpai")
public class LishijingpaiView  extends LishijingpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LishijingpaiView(){
	}
 
 	public LishijingpaiView(LishijingpaiEntity lishijingpaiEntity){
 	try {
			BeanUtils.copyProperties(this, lishijingpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.PaimaishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拍卖商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 16:07:05
 */
@TableName("paimaishangpin")
public class PaimaishangpinView  extends PaimaishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaimaishangpinView(){
	}
 
 	public PaimaishangpinView(PaimaishangpinEntity paimaishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, paimaishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

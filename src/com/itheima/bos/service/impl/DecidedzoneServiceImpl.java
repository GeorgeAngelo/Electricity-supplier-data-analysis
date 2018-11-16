package com.itheima.bos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.IDecidedzoneDao;
import com.itheima.bos.dao.ISubareaDao;
import com.itheima.bos.domain.Decidedzone;
import com.itheima.bos.domain.Subarea;
import com.itheima.bos.service.IDecidedzoneService;
import com.itheima.bos.utils.PageBean;

@Service
@Transactional
public class DecidedzoneServiceImpl implements IDecidedzoneService{
	@Autowired
	private IDecidedzoneDao decidedzoneDao;
	@Autowired
	private ISubareaDao subareaDao;
	
	/**
	 * 添加定区
	 */
	public void save(Decidedzone model, String[] subareaid) {
		decidedzoneDao.save(model);
		for (String sid : subareaid) {
			Subarea subarea = subareaDao.findById(sid);//持久对象
			//分区对象关联定区对象---多方关联一方
			//UPDATE Subarea SET decidedzone = ? WHERE id = ?
			subarea.setDecidedzone(model);
		}
	}

	public void pageQuery(PageBean pageBean) {
		decidedzoneDao.pageQuery(pageBean);
	}

}

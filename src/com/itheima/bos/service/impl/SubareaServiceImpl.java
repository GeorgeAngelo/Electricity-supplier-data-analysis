package com.itheima.bos.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.ISubareaDao;
import com.itheima.bos.domain.Subarea;
import com.itheima.bos.service.ISubareaService;
import com.itheima.bos.utils.PageBean;

@Service
@Transactional
public class SubareaServiceImpl implements ISubareaService{
	@Resource
	private ISubareaDao subareaDao;

	public void save(Subarea model) {
		subareaDao.save(model);
	}

	public void pageQuery(PageBean pageBean) {
		subareaDao.pageQuery(pageBean);
	}

	public List<Subarea> findAll() {
		return subareaDao.findAll();
	}

	/**
	 * 查询没有关联到定区的分区
	 */
	public List<Subarea> findListNotAssociation() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Subarea.class);
		detachedCriteria.add(Restrictions.isNull("decidedzone"));
		return subareaDao.findByCriteria(detachedCriteria );
	}
}

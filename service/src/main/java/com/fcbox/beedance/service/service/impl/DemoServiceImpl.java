package com.fcbox.beedance.service.service.impl;

import com.fcbox.beedance.service.domain.command.DemoCommand;
import com.fcbox.beedance.service.domain.dto.DemoDTO;
import com.fcbox.beedance.service.domain.entity.DemoEntity;
import com.fcbox.beedance.service.dao.DemoDao;
import com.fcbox.beedance.service.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2018/11/5 23:16
 */
@Service
public class DemoServiceImpl implements DemoService {

	private final DemoDao demoDao;

	@Autowired
	public DemoServiceImpl(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@Override
	public void demo(DemoCommand command) {
		DemoEntity entity = new DemoEntity();
		entity.setDemo(command.getDemo());
		demoDao.insert(entity);
	}

	@Override
	public DemoDTO demo(String demo) {
		return demoDao.get(demo);
	}
}

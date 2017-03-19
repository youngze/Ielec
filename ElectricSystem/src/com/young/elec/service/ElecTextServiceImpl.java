package com.young.elec.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.young.elec.dao.*;
import com.young.elec.domain.ElecText;
@Transactional(readOnly=true)//Ö»¶Á
@Service(IElecTextService.SERVICE_NAME)
public class ElecTextServiceImpl implements IElecTextService {

	@Resource(name=IElecTextDao.SERVICE_NAME)
	private IElecTextDao elecTextDao;
	
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, readOnly=false)
	public void saveElecText(ElecText elecText) {
		elecTextDao.save(elecText);
	}
	
}

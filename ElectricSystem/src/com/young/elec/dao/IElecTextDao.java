package com.young.elec.dao;
import org.springframework.stereotype.Repository;

import com.young.elec.domain.*;
public interface IElecTextDao extends ICommonDao<ElecText> {

	public final static String  SERVICE_NAME = "com.young.elec.dao.ElecTextDaoImpl";
	
}

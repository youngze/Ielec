package com.young.elec.dao;
import org.springframework.stereotype.Repository;
import com.young.elec.dao.IElecTextDao;
import com.young.elec.domain.ElecText;

@Repository(IElecTextDao.SERVICE_NAME)
public class ElecTextDaoImpl extends CommonDaoImpl<ElecText> implements IElecTextDao {

}

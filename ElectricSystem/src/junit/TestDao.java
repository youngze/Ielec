package junit;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.elec.dao.*;
import com.young.elec.domain.*;

public class TestDao {

	@Test
	public void saveElecText() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		//实例化PO对象，赋值，执行保存
		ElecText elecText = new ElecText();
		elecText.setTextName("DAO名称");
		elecText.setTextDate(new Date());
		elecText.setTextRemark("DAO备注");
		elecTextDao.save(elecText);
	}
	
}

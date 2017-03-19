package junit;

import java.util.Date;
import com.young.elec.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernate {

	@Test
	public void testElecTest() {
		
		/*SessionFactory sessionFactory = (new Configuration().configure()).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();*/
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		ElecText electext = new ElecText();
	
		electext.setTextName("≤‚ ‘√˚◊÷");
		electext.setTextDate(new Date());
		electext.setTextRemark("≤‚ ‘±∏◊¢");		
		session.save(electext);
		transaction.commit();
		session.close();
		
	}
	
}

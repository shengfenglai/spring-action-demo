package part.three;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
public class DataSourceConfigTest {

	@Autowired
	private DataSourceConfig dataSourceConfig;

	@Test
	public void test() {
		System.out.println(dataSourceConfig.jndiDataSource());
	}

}

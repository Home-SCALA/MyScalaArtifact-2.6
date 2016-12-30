package app.basePackage

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation._;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(Array("app"))
@EnableTransactionManagement
class RootConfigure {
 	@Bean
	def persistenceProperties():Properties={
		var props = new Properties();
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "create");
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		return props;
	}
  @Bean
  def sessionFactory():LocalSessionFactoryBean={
    
    var sfb = new LocalSessionFactoryBean()
		sfb.setDataSource(dataSource())
		sfb.setPackagesToScan("app.entities")
		sfb.setHibernateProperties(persistenceProperties())
		return sfb
    
  }
  
  @Bean
  def dataSource():BasicDataSource = {
    var ds = new BasicDataSource();
   	ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:~/test");
		ds.setUsername("sa");
		ds.setPassword("");
		ds.setInitialSize(5);
		ds.setMaxActive(10);
    return ds;    
    }
  @Bean
    def transactionManager(s:SessionFactory ): HibernateTransactionManager ={
        var txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
  
  
  
}
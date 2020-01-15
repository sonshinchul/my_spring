package dbtest;

import java.sql.DriverManager;

import org.junit.Test;
import java.sql.Connection;

public class PostGresqlConnectionTest {

	 private static final String DRIVER ="core.log.jdbc.driver.PostgresqlDriver";
	 
	 private static final String URL="jdbc:postgresql://192.168.0.79:5432/adms2";
	 
	 private static final String USER="postgres";
	 
	 private static final String PW="surienc";
	 
	 @Test
	 public void testConnection() throws Exception{
		 
		 Class.forName(DRIVER);
		 
		 try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			 System.out.println(con);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
	 }
	 
}

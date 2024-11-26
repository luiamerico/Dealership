package dealership.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class testeConexaoBD {

	public static void teste() {
		
     		String driver = "org.postgresql.Driver";
	        String user   = "postgres";
	        String password = "postgres";
			String url      = "jdbc:postgresql://localhost:5432/dealership_database";

	      try {
	        Class.forName(driver);
            Connection con = null;
            con = (Connection) DriverManager.getConnection(url, user, password);
    		System.out.println("Conex�o realizada com sucesso.");

			}catch(Exception e)
			{
				 System.err.print(e.getMessage());

			}
       			
	}

}
package dealership.aplication;

import java.util.Scanner;

import dealership.database.connection.ConectaPostgres;
import dealership.database.connection.testeConexaoBD;
import dealership.util.DeleteOperation;
import dealership.util.RegisterOperation;
import dealership.util.SelectOperation;


public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

 		@SuppressWarnings("unused")
		String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String password = "postgres";
		String url      = "jdbc:postgresql://localhost:5432/dealership_database";
		
		ConectaPostgres banco = new ConectaPostgres();
        banco.Conectar(url, user, password);
        testeConexaoBD.teste();
        
        System.out.println("Qual operação você deseja fazer?");
        System.out.println("1 - Inserir Dados");
        System.out.println("2 - Remover Dados");
        System.out.println("3 - Consultar Dados");

        
        
        switch (sc.nextInt()) {
        case 1:
            RegisterOperation.dealershipSale();
            break;
        case 2:
            DeleteOperation.deleteOperation();
            break;
        case 3:
            SelectOperation.selectOperation();
            break;
        default:
            System.out.println("Opção inválida! Por favor, escolha novamente.");
    }

        
        
	}
}
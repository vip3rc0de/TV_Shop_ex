
package Database_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Database_Connect {


    public static void main(String[] args) {
        try {
        String host = "jdbc:derby://localhost:1527/Main";
        String username = "root";
        String password= "0313";
        Connection con = DriverManager.getConnection( host, username, password );
        
        Statement stmt = con.createStatement( );
        String SQL = "SELECT * FROM UNTITLED";
        
        ResultSet rs = stmt.executeQuery( SQL );
        
        while (rs.next( )){
        String TELEVISION_NAME = rs.getString("TELEVISION_NAME");
        String PRICE = rs.getString("PRICE");
        String INCHES = rs.getString("INCHES");

        
        String p = TELEVISION_NAME + " " + PRICE + " " + INCHES + " "; 
        System.out.println(p);
        }
        }
        catch ( SQLException err ) {
        System.out.println( err.getMessage( ) );
 
    }
    
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yan.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private Connection connection=null;
    private static DatabaseConnection instance;
    
    private DatabaseConnection(){
    }
    
    public static DatabaseConnection getInstance(){
        if(instance==null){
            instance=new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void connectToDatabase() throws SQLException{
        String url="jdbc:mysql://localhost:3306/COS106";
        String driver="com.mysql.cj.jdbc.Driver";
        String username="root";
        String password="root";
        connection= DriverManager.getConnection(url,username,password);
    }

    public static class getInstance {

        public getInstance() {
        }
    }
}
    
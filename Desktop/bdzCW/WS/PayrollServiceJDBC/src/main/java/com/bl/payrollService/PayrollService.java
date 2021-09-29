package com.bl.payrollService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PayrollService {
    public static void main(String[] args) {
        Connection con;
        {
            try {
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                String DB_URL = "jdbc:mysql://localhost:3306/payroll_service";
                con = DriverManager.getConnection( DB_URL , "root" , "root" );
                String CREATE_TABLE_QUERY = "create table sample(No int, Name varchar(20))";
                Statement statement = con.createStatement( );
                statement.execute( CREATE_TABLE_QUERY );
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace( );
            } catch (ClassNotFoundException e) {
                e.printStackTrace( );
            }
        }
    }
}

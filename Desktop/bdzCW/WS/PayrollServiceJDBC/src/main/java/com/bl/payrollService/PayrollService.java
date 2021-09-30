package com.bl.payrollService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    public static void main(String[] args) {
                EmployeePayroll employee = null;
                PreparedStatement preparedStatement = null;
                PreparedStatement preparedStatement1 = null;
                List<EmployeePayroll> employeePayrolls = new ArrayList <>(  );
        Connection con;
        {
            try {
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                String DB_URL = "jdbc:mysql://localhost:3306/payroll_service";
                con = DriverManager.getConnection( DB_URL , "root" , "root" );
                String FETCH_QUERY = "SELECT * from employee_payroll";
                String UPDATE_QUERY ="UPDATE employee_payroll set START_DATE ='2000-01-01' where ID=10";

                preparedStatement = con.prepareStatement( UPDATE_QUERY );
                preparedStatement.executeUpdate();

                preparedStatement1 = con.prepareStatement( FETCH_QUERY);
                ResultSet resultSet = preparedStatement1.executeQuery();
                while(resultSet.next()){
                    employee = new EmployeePayroll();
                    employee.setId(resultSet.getInt( "ID" ) );
                    employee.setName(resultSet.getString( 2 ) );
                    employee.setGender(resultSet.getString( 3 ) );
                    employee.setSalary(resultSet.getInt( 4 ) );
                    employee.setDate(resultSet.getDate( 5 ).toString() );
                    employee.setEmpPhone(resultSet.getString( 6 ) );
                    employee.setDepartment(resultSet.getString( 7 ) );
                    employee.setAddress(resultSet.getString( 8 ) );
                    employee.setBasicPay(resultSet.getInt( 9 ) );
                    employee.setDeductions(resultSet.getInt( 10 ) );
                    employee.setTaxablePay(resultSet.getInt( 11 ) );
                    employee.setIncomeTax(resultSet.getInt( 12 ) );
                    employee.setNetPay(resultSet.getInt( 13 ) );

                    employeePayrolls.add(employee);
                }

                for (EmployeePayroll item: employeePayrolls){
                    System.out.println(item);
                }

                preparedStatement.close();
                con.close();
                System.out.println("Query Executed!!");
            } catch (SQLException e) {
                e.printStackTrace( );
            } catch (ClassNotFoundException e) {
                e.printStackTrace( );
            }
        }
    }
}

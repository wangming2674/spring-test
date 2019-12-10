package com.evan.imitate.test;

import java.sql.*;

public class JdbcTest {
    static {
        try {
            Class.forName(Driver.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        executeQueryTest();
        executeTest();
    }

    private static void executeQueryTest() throws SQLException {
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=yes&characterEncoding=UTF-8&useInformationSchema=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&allowPublicKeyRetrieval=true", "root", "123456");
        PreparedStatement preparedStatement = root.prepareStatement("SELECT * FROM t_person WHERE age =?");
        preparedStatement.setString(1, "22");
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        while (resultSet.next()) {
            String columnName1 = metaData.getColumnName(1);
            String columnName2 = metaData.getColumnName(2);
            System.out.println(columnName1 + ":" + resultSet.getString(1));
            System.out.println(columnName2 + ":" + resultSet.getString(2));
        }
        resultSet.close();
        preparedStatement.close();
        root.close();
    }

    private static void executeTest() throws SQLException {
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=yes&characterEncoding=UTF-8&useInformationSchema=true&useSSL=false&serverTimezone=UTC", "root", "123456");
        PreparedStatement preparedStatement = root.prepareStatement("INSERT INTO t_person(id,name,age) values (?,?,?)");
        preparedStatement.setString(1, "4");
        preparedStatement.setString(2, "赵六");
        preparedStatement.setString(3, "24");
        
        boolean execute = preparedStatement.execute();
        //如果第一个结果是更新计数或者没有结果，则返回 false
        if (execute==false){
            System.out.println("插入数据成功!");
        }
        preparedStatement.close();
        root.close();
    }
}

package model.repository;

import java.sql.Connection;

public class BaseRepository {
    public static Connection getConnect(){
        Connection connection=null;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

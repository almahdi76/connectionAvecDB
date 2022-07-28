package conct;

import conct.jdbcNatif.SansFW;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
    SansFW fw=new SansFW();
        fw.connectDB();

        fw.findByDesgnation("LG");


    }


}

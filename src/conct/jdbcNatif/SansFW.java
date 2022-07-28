package conct.jdbcNatif;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SansFW {
    List<Produit> produits ;
    public void connectDB() {
        System.out.println("test");
        String url = "jdbc:postgresql://localhost:5432/depotAKA";
        String username = "postgres";
        String password = "abdo";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("bien connecte");
        } catch (Exception e) {
            System.out.println("connection echoué");
            e.printStackTrace();
        }
    }

    public List<Produit> findByDesgnation(String motCle) throws SQLException {
        System.out.println("test");
        String url = "jdbc:postgresql://localhost:5432/depotAKA";
        String username = "postgres";
        String password = "abdo";
         produits = new ArrayList<Produit>();
        Connection con = DriverManager.getConnection(url, username, password);
        //  con=connectDB();
        PreparedStatement ps = con.prepareStatement("SELECT* FROM produit WHERE designation LIKE ?");
        ps.setString(1, "%"+motCle+"%");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Produit p = new Produit();


           // p.setId(rs.getLong("ID"));
            p.setDesignation(rs.getString("designation"));
           // p.getPrix(rs.getDouble("prix"));
           // p.getQuantity(rs.getInt("quantites"));
            System.out.println(rs.getString("designation"));

            produits.add(p);


        }
        return produits;
    }

}

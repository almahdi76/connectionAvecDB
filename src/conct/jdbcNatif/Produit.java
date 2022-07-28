package conct.jdbcNatif;

public class Produit {

private Long id;
private String designation;
private double prix;
private int quantity;

    public Produit(Long id, String designation, double prix, int quantity) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantity = quantity;
    }

    public Produit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix(double prix) {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantity(int quantites) {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

/*
Martín España 19258
Javier Estuardo Hernandez 19202
Angel Cuellar 18382    
Augusto Alonso 181085
Arturo Armendáriz 18021
*/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicines")
public class Medicine extends Models {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;


    @Column(name="brand")
    private String brand;

    @Column(name="stock")
    private int stock;

    public Medicine() {
    }

    public Medicine(String name, String brand, int stock) {
        this.name = name;
        this.brand = brand;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

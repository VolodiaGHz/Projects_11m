package ua.lviv.iot;

import javax.persistence.*;

@Entity
public class Goods {
//    private double receivingDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private double price = 0;
    @Column
    private int amount = 0;
    @Column
    private CustumerType grade;
    @Column
    private ColorType color;

    public Goods() {
    }

    public Goods(String name, double price, int amount, ColorType color, CustumerType grade) {
    }

    public Goods(String name, double price, int amount, final Integer id, CustumerType grade, ColorType color) {
        setName(name);
        setColorType(color);
        setAmount(amount);
        setGrade(grade);
        setPrice(price);
        setId(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public double getReceivingDate() {
//        return receivingDate;
//    }
//
//    public void setReceivingDate(double receivingDate) {
//        this.receivingDate = receivingDate;
//    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorType getColorType() {
        return color;
    }

    public void setColorType(ColorType color) {
        this.color = color;
    }

    public CustumerType getGrade() {
        return grade;
    }

    public void setGrade(CustumerType grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ", name = " + name + ", price = " + price + ", amount ="
                + amount + ", grade = " + grade + ", color = " + color;
    }

    public String getHeaders() {
        return "name, price, amount, grade, color ";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getAmount() + ", " + getGrade() + ", " + getColorType()+". ";
    }


}

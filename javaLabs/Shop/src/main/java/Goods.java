
public class Goods {
<<<<<<< HEAD
//    private double receivingDate;
    private Integer id;
=======
    private double receivingDate;
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd
    private String name;
    private double price = 0;
    private int amount = 0;
    private CustumerType grade;
    private ColorType color;

<<<<<<< HEAD
    public Goods() {
    }

    public Goods(String name, double price, int amount, ColorType color, CustumerType grade) {
        setName(name);
        setColorType(color);
=======

    public Goods(String name, double price, int amount, ColorType color, CustumerType grade) {
        setName(name);
        setColor(color);
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd
        setAmount(amount);
        setGrade(grade);
        setPrice(price);
    }

<<<<<<< HEAD
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
=======

    public double getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(double receivingDate) {
        this.receivingDate = receivingDate;
    }
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd

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

<<<<<<< HEAD
=======
    public String getName() {
        return name;
    }

>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public ColorType getColorType() {
        return color;
    }

    public void setColorType(ColorType color) {
=======
    public String getColor() {
        return color.name();
    }

    public void setColor(ColorType color) {
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd
        this.color = color;
    }

    public CustumerType getGrade() {
        return grade;
    }

    public void setGrade(CustumerType grade) {
        this.grade = grade;
    }

<<<<<<< HEAD
    public String getName() {
        return name;
    }
=======
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd

    @Override
    public String toString() {
        return ", name = " + name + ", price = " + price + ", amount ="
                + amount + ", grade = " + grade + ", color = " + color;
    }

<<<<<<< HEAD
    public String getHeaders() {
        return "name, price, amount, grade, color ";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getAmount() + ", " + getGrade() + ", " + getColorType()+". ";
    }

=======
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd

}

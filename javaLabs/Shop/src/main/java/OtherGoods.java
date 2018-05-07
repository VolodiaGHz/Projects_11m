
public class OtherGoods extends Goods {
    private OtherGoodsType otherGoodsType;

    public OtherGoods(String name, double price, int amount, ColorType color, CustumerType grade,
                      OtherGoodsType otherGoodsType) {
        super(name, price, amount, color, grade);

        setOtherGoodsType(otherGoodsType);
    }

    public OtherGoodsType getOtherGoodsType() {
        return otherGoodsType;
    }

    public void setOtherGoodsType(OtherGoodsType otherGoodsType) {
        this.otherGoodsType = otherGoodsType;
    }

    @Override
    public String toString() {
        return super.toString() + " otherGoodsType = " + otherGoodsType + "\n";
    }

<<<<<<< HEAD
    public String getHeaders() {
        return "name, price, amount, grade, color, otherGoodsType ";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getAmount() + ", " + getGrade() + ", " + getColorType() + ", " + getOtherGoodsType() + ". ";
    }

=======
>>>>>>> f9adea0ec465bf3467f4510f80c04d0eafa792dd
}

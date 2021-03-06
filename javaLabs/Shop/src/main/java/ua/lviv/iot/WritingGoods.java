package ua.lviv.iot;

public class WritingGoods extends Goods {
    private String material;
    private GoodsType goodsType;

    public WritingGoods(String name, double price, int amount, ColorType color, GoodsType goodsType, CustumerType grade, String material) {
        super(name, price, amount, color, grade);
        setMaterial(material);
        setGoodsType(goodsType);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return super.toString() + " material = " + material + ", goodsType = " + goodsType + "\n";
    }
    public String getHeaders() {
        return "name, price, amount, grade, color, material, goodsType";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getAmount() + ", " + getGrade() + ", " + getColorType() + ", "
                + getMaterial() + ", " + getGoodsType() + ". ";
    }



}

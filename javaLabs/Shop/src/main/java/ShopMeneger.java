import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ShopMeneger {
//    private String name;
//    private String adress;
    private static List<Goods> goodsList = new LinkedList<Goods>();
    private  Map<Integer, Goods> goodsMap;

//    public final void addGoods(final Goods addGoods){goodsList.add(addGoods);}

    public void setGoods(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Goods> getGoods() {
        return this.goodsList;
    }

//    public ShopMeneger() {
//    }

    public ShopMeneger(List<Goods> goodsList) {
        this.goodsList = goodsList;

    }

//   public void addGoods(Goods addGoods) {
//        this.goodsList.add(addGoods);
//    }

    public  List<Goods> searchByCustumerType(CustumerType grade) {
        List<Goods> result = new LinkedList<>();
        for (Goods good : goodsList) {
            if (good.getGrade() == grade) {
                result.add(good);
            }
        }
        return result;
    }

    public List<Goods> sortByColor(List<Goods> goods) {
        goodsList.sort(Comparator.comparing(Goods::getColorType));
        return goodsList;
    }


//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }

}

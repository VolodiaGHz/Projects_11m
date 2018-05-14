import org.junit.jupiter.api.Test;
import ua.lviv.iot.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ShopMenegerTest {
    private List<Goods> goods = new LinkedList<>();
    private List<Goods> result = new LinkedList<>();
    private ShopMeneger shop = new ShopMeneger(goods);

    @Test
    public void addGoods() {
        goods.add(new PaperGoods("Copybook", 20, 1000,"car" ,PagesNumber.EIGTHTEEN, PapersType.COPYBOOK,
                 ColorType.RED,CustumerType.FirstGRADE  ));
        goods.add(new WritingGoods("pen", 10.50, 400, ColorType.BLACK, GoodsType.PEN,
                CustumerType.EVERYONE, "plastic"));
        goods.add(new PaperGoods("Book", 100, 36,"sport",PagesNumber.MoreThanNINETISIX,
                PapersType.BOOK, ColorType.BLUE, CustumerType.GraduationGrade   ));
        goods.add(new PaperGoods("Notebook", 100, 75,"sport", PagesNumber.MoreThanNINETISIX,
                PapersType.BOOK, ColorType.GREEN, CustumerType.GraduationGrade ));
        goods.add(new OtherGoods("Tape", 9, 698, ColorType.WITHOUTCOLOR,
                CustumerType.EVERYONE, OtherGoodsType.TAPE));
    }

    @Test
    public void searchByCustumerType() {
        addGoods();
        List<Goods> searchResult = shop.searchByCustumerType(CustumerType.GraduationGrade);
//        assertEquals( shop,searchResult.size());
        assertEquals("Book", searchResult.get(0).getName());
        assertEquals("Notebook", searchResult.get(1).getName());
//        searchResult = shop.searchByCustumerType(CustumerType.EVERYONE);
//        assertEquals(goods.get(1),searchResult.get(1).getGrade());
    }

    @Test
    public void sortByColor() {
        addGoods();
        List<Goods> sortedGoods = shop.sortByColor(goods);
        assertEquals(ColorType.BLACK.toString(), sortedGoods.get(0).getColorType());
        assertEquals(ColorType.BLUE.toString(), sortedGoods.get(1).getColorType());
        assertEquals(ColorType.GREEN.toString(), sortedGoods.get(2).getColorType());
        assertEquals(ColorType.RED.toString(),sortedGoods.get(3).getColorType());
        assertEquals(ColorType.WITHOUTCOLOR.toString(), sortedGoods.get(4).getColorType());
    }

    @Test
    public void Writer() {
        GoodsWriter writer = new GoodsWriter();
        goods.add(new PaperGoods("Copybook", 20, 1000,"car",PagesNumber.EIGTHTEEN,
                PapersType.COPYBOOK,ColorType.RED, CustumerType.FirstGRADE));
        goods.add(new WritingGoods("pen", 10.50, 400, ColorType.BLACK, GoodsType.PEN,
                CustumerType.EVERYONE, "plastic"));
        goods.add(new PaperGoods("Book", 100, 36,"sport",PagesNumber.MoreThanNINETISIX,
                PapersType.BOOK,ColorType.BLUE, CustumerType.GraduationGrade));
        goods.add(new PaperGoods("Notebook", 100, 75,"sport",PagesNumber.MoreThanNINETISIX,
                PapersType.BOOK,ColorType.GREEN, CustumerType.GraduationGrade));
        goods.add(new OtherGoods("Tape", 9, 698, ColorType.WITHOUTCOLOR,
                CustumerType.EVERYONE, OtherGoodsType.TAPE));
        try {
            writer.writeToFile(shop.getGoods());
        }catch (Exception e){
            assertFalse(false);

        }
    }
}

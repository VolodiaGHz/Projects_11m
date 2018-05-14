package ua.lviv.iot;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

public class GoodsWriter {
    public final void writeToFile(final List<Goods> goodsList) {
        try (PrintWriter writer = new PrintWriter("GoodsStore.csv file")) {
            for (Goods goods : goodsList) {
                writer.println(goods.getHeaders());
                writer.print(goods.toCSV());


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

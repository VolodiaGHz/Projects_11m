//import java.awt.*;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        ShopMeneger shop = new ShopMeneger();
//        shop.addGoods(
//                new WritingGoods("pen", 10.50, 400, ColorType.BLACK, GoodsType.PEN, CustumerType.EVERYONE, "plastic"));
//        shop.addGoods(
//                new WritingGoods("pencill", 5, 720, ColorType.GRAY, GoodsType.PENCIL, CustumerType.EVERYONE, "wooden"));
//        shop.addGoods(new PaperGoods("Copybook", 20, 1000, ColorType.RED, CustumerType.FirstGRADE, "car",
//                PagesNumber.EIGTHTEEN, PapersType.COPYBOOK));
//        shop.addGoods(new PaperGoods("Copybook", 25, 500, ColorType.GREEN, CustumerType.Student, "Animals",
//                PagesNumber.NINETISIX, PapersType.COPYBOOK));
//        shop.addGoods(new PaperGoods("Book", 100, 36, ColorType.BLUE, CustumerType.GraduationGrade, "������ �����",
//                PagesNumber.MoreThanNINETISIX, PapersType.BOOK));
//        shop.addGoods(
//                new OtherGoods("Tape", 9, 698, ColorType.WITHOUTCOLOR, CustumerType.EVERYONE, OtherGoodsType.TAPE));
//        shop.addGoods(
//                new OtherGoods("Glue", 15, 315, ColorType.WITHOUTCOLOR, CustumerType.EVERYONE, OtherGoodsType.TAPE));
//
//        boolean menu = true;
//        while (menu) {
//
//            System.out.println("Menu");
//            System.out.println(" 1 - Print list of goods;");
//            System.out.println(" 2 - Search by grade;");
//            System.out.println(" 3 - Print list of goods sorted by color;");
//            System.out.println(" 4 - Exit;");
//
//            Scanner in = new Scanner(System.in);
//            int num = in.nextInt();
//            switch (num) {
//                case 1: {
//                    System.out.println(shop.getGoods().toString());
//                    break;
//                }
//                case 2: {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("Enter the type: ");
//                    String type = scanner.nextLine();
//                    if (type.equals("FirstGrade")) {
//                        System.out.println(shop.searchByCustumerType(CustumerType.FirstGRADE).toString());
//                    } else if (type.equals("GraduationGrade")) {
//                        System.out.println(shop.searchByCustumerType(CustumerType.GraduationGrade).toString());
//                    } else if (type.equals("Student")) {
//                        System.out.println(shop.searchByCustumerType(CustumerType.Student).toString());
//
//                    } else if (type.equals("Other")) {
//                        System.out.println(shop.searchByCustumerType(CustumerType.EVERYONE).toString());
//                    }
//                    break;
//                }
//                case 3: {
//                    System.out.println(shop.sortByColor(shop.getGoods()).toString());
//                    break;
//                }
//                case 5:
//                default: {
//                    System.out.println("Exited programm");
//                    menu = false;
//                    break;
//                }
//            }
//
//        }
//
//    }
//
//}

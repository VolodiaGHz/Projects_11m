from Goods.OtherGoods import OtherGoods
from Goods.PaperGoods import PaperGoods
from Goods.WritingGoods import WritingGoods
from Shop import Shop
from enums.CustumerType import CustumerType
from enums.GoodsType import GoodsType
from enums.OtherGoodsType import OtherGoodsType
from enums.PagesNumber import PagesNumber
from enums.PapersType import PapersType


if __name__ == '__main__':
    shop = Shop()

    tape = OtherGoods("Tape, ", 10, 100, CustumerType.EVERYONE, "white, ", OtherGoodsType.TAPE)
    book = PaperGoods("Book, ", 125, 15, CustumerType.FIRSTGRADE, "green, ", PagesNumber.MORETHENNINETISIX,
                      PapersType.BOOK, " tree, ")
    pen = WritingGoods("Pen, ", 4, 200, CustumerType.EVERYONE, "black, ", GoodsType.PEN)
    glue = OtherGoods("PVA, ", 9, 56, CustumerType.EVERYONE, "white, ", OtherGoodsType.GLUE)
    copybook = PaperGoods("CopyBook, ", 11, 200, CustumerType.FIRSTGRADE, "red, ", PagesNumber.TWELWE,
                          PapersType.COPYBOOK, " barbie, ")
    pencill = WritingGoods("Pencill, ", 7, 185, CustumerType.EVERYONE, "blue, ", GoodsType.PENCILL)

    shop.good = [tape, book, pen, glue, copybook, pencill]
    print("Previous list: ")
    shop.print_list()

    shop.sort_by_color()
    print("Sorted list: ")
    shop.print_list()
from Goods.Goods import Goods
from enums.PagesNumber import PagesNumber
from enums.PapersType import PapersType


class PaperGoods(Goods):
    pages_number = PagesNumber
    papers_type = PapersType

    def __init__(self, name, price, amount, custumer_type, color, pages_number, papers_type, titul_page):
        self.titul_page = titul_page
        self.pages_number = pages_number
        self.papers_type = papers_type
        Goods.__init__(self, name, price, amount, custumer_type, color)

    def __str__(self):
        return "Name : " + str(self.name) + " price: " + str(self.price) + "amount: " + str(self.amount)\
               + "color: " + str(self.color) + "custumer type: " + str(self.custumer_type) \
               + "titul page: " + str(self.titul_page) + "pages number: " + str(self.pages_number) \
               + "papers type: " + str(self.papers_type)
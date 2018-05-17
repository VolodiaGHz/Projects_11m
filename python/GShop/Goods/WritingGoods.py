from Goods.Goods import Goods
from enums.GoodsType import GoodsType



class WritingGoods(Goods):
    goods_type = GoodsType

    def __init__(self, name, price, amount, custumer_type, color, goods_type):
        self.goods_type = goods_type

        Goods.__init__(self, name, price, amount, custumer_type, color)

    def __str__(self):
        return "Name : " + str(self.name) + " price: " + str(self.price) + "amount: " + str(self.amount) \
               + "color: " + str(self.color) + "custumer type: " + str(self.custumer_type)
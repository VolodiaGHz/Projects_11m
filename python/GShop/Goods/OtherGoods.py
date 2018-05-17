from Goods.Goods import Goods
from enums.OtherGoodsType import OtherGoodsType


class OtherGoods(Goods):
    other_goods_type = OtherGoodsType

    def __init__(self, name, price, amount, custumer_type, color, other_goods_type):
        self.other_goods_type = other_goods_type

        Goods.__init__(self, name, price, amount, custumer_type, color)

    def __str__(self):
        return "Name : " + str(self.name) + " price: " + str(self.price) + "amount: " + str(self.amount) \
               + "color: " + str(self.color) + "custumer type: " + str(self.custumer_type) \
               + "goods type: " + str(self.other_goods_type)
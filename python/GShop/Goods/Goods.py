
from enums.CustumerType import CustumerType


class Goods:
    custumer_type = CustumerType

    def __init__(self, name, price, amount, custumer_type, color):
        self.name = name
        self.price = price
        self.amount = amount
        self.custumer_type = custumer_type
        self.color = color

class Shop:
    good = []

    def __init__(self):
        pass

    def sort_by_color(self):
        self.good.sort(key=lambda goods: goods.color, reverse=True)


    def find_by_grage(self, custumer_type):
        found_goods = []

        for goods in self.good:
            if goods.custumer_type == custumer_type:
                found_goods.append(goods)

        return found_goods

    def add_goods(self, goods):
        self.good += goods

    def print_list(self):
        for goods in self.good:
            print(goods)
from flask import Flask, jsonify, abort, make_response, request
from flask_sqlalchemy import SQLAlchemy
# from Goods import Goods
app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+mysqlconnector://root:11335577@localhost:3306/volodia-iot-test-db'
db = SQLAlchemy(app)


class Goods(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(45))
    price = db.Column(db.Integer)
    amount = db.Column(db.Integer)
    color = db.Column(db.String(45))
    dueDay = db.Column(db.String(45))


@app.route('/goods', methods=['GET'])
def get_all_goods():
    goods = []
    all_goods = Goods.query.all()
    for gd in all_goods:
        goods = {
            'name': gd.name,
            'price': gd.price,
            'amount': gd.amount,
            'color': gd.color,
            "dueDay": gd.dueDay
        }
        goods.append(goods)
    db.session.commit()
    return jsonify({'goods': goods})


@app.route('/goods/<int:good_id>', methods=['GET'])
def get_good(good_id):
    gd = Goods.query.get(good_id)
    if gd == None:
        abort(400)
    else:
        goods = {
            'name': gd.name,
            'price': gd.price,
            'amount': gd.amount,
            'color': gd.color,
            "dueDay": gd.dueDay
        }
    db.session.commit()
    return jsonify({'goods': goods})


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


@app.route('/goods', methods=['POST'])
def add_good():
    # if not request.json or not 'name' in request.json:
    #     abort(400)
    new_good = Goods()
    new_good.iD = request.json['id']
    new_good.name = request.json['name']
    new_good.price = request.json.get('price', 0)
    new_good.amount = request.json.get('amount', 0)
    new_good.color = request.json.get('color', "")
    new_good.dueDay = request.json.get('dueDay', "")

    db.session.add(new_good)
    db.session.commit()
    return jsonify('Successful')


@app.route('/goods/<int:good_id>', methods=['PUT'])
def update_good(good_id):
    gd = Goods.query.get(good_id)

    gd.name = request.json['name']
    gd.price = request.json['price']
    gd.amount = request.json['amount']
    gd.color = request.json['color']
    gd.dueDay = request.json['dueDay']
    db.session.commit()
    return jsonify('Successful')


@app.route('/goods/<int:good_id>', methods=['DELETE'])
def delete_good(good_id):
    gd = Goods.query.filter_by(id=good_id).first()
    db.session.delete(gd)
    db.session.commit()
    return jsonify({'result': True})


if __name__ == '__main__':
    app.run(debug=True)

package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.Goods;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

public class GoodDaoImpl extends AbstractDao<Goods> implements GoodsDao,Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Goods> getEntityClass() {
        return Goods.class;
    }
}

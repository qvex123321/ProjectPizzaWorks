package shopManageSystem.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _model.ProductBean;
import shopManageSystem.dao.ProductDao;

@Repository
public class ProductDaoImpl implements ProductDao {
	SessionFactory factory;

	@Override
	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProductBean> getAllProducts() {
		String hql = "FROM ProductBean";
		Session session = null;
		List<ProductBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}

	@Override
	public void updateOneProduct(ProductBean pb) {
		Session session = null;
		session = factory.getCurrentSession();
		ProductBean originalProduct = session.get(ProductBean.class, pb.getProductId());
		if (pb.getProductName() != null) {
			originalProduct.setProductName(pb.getProductName());
		}
		if (pb.getBriefInfo() != null) {
			originalProduct.setBriefInfo(pb.getBriefInfo());
		}
		if (pb.getUnitPrice() != null) {
			originalProduct.setUnitPrice(pb.getUnitPrice());
		}
		if (pb.getActiveStatus() != null) {
			originalProduct.setActiveStatus(pb.getActiveStatus());
		}
		if (pb.getSpicyLevel() != null) {
			originalProduct.setSpicyLevel(pb.getSpicyLevel());
		}
		if(pb.getVegetableOnly()!=null) {
			originalProduct.setVegetableOnly(pb.getVegetableOnly());
		}
		if(pb.getSeafood()!=null) {
			originalProduct.setSeafood(pb.getSeafood());
		}
		if(pb.getPork()!= null) {
			originalProduct.setPork(pb.getPork());
		}
		if(pb.getBeef()!= null) {
			originalProduct.setBeef(pb.getBeef());
		}
		if(pb.getChicken()!= null) {
			originalProduct.setChicken(pb.getChicken());
		}
		if(pb.getImagePath()!= null) {
			originalProduct.setImagePath(pb.getImagePath());
		}
	}
	@Override
	public ProductBean getProductById(int productId) {
		Session session = factory.getCurrentSession();
		ProductBean pb = session.get(ProductBean.class, productId);
		return pb;
	}
//	@Override
//	public String getImagePathById(Integer productId) {
//		Session session = null;
//		String imagePath = session.get(ProductBean.class, productId).getImagePath();
//		return imagePath;
//	}
}

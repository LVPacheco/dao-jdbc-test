package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println("Test 1");
        System.out.println(seller);

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        System.out.println("Test 2");
        list.forEach(System.out::println);

        list = sellerDao.findAll();
        System.out.println("Test 3");
        list.forEach(System.out::println);

//        System.out.println("Test 4");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println(sellerDao.findById(newSeller.getId()));

//        System.out.println("Test 5");
//        seller = sellerDao.findById(1);
//        seller.setName("Ana");
//        sellerDao.update(seller);
//        System.out.println(sellerDao.findById(seller.getId()));

        System.out.println("Test 6");
        sellerDao.deleteById(14);
    }
}

package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SellerDao sellerDao = DaoFactory.createSellerDao();
//        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//
//        System.out.println("Test 1");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("Test 2");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        list.forEach(System.out::println);
//
//        System.out.println("Test 3");
//        list = sellerDao.findAll();
//        list.forEach(System.out::println);
//
//        System.out.println("Test 4");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println(sellerDao.findById(newSeller.getId()));

//        System.out.println("Test 5");
//        seller = sellerDao.findById(1);
//        seller.setName("Ana");
//        sellerDao.update(seller);
//        System.out.println(sellerDao.findById(seller.getId()));

//        System.out.println("Test 6");
//        sellerDao.deleteById(14);

//        System.out.println("Test 7");
//        Department dp = new Department(null,"Clothes");
//        departmentDao.insert(dp);

//        System.out.println("Test 8");
//        Department dp = new Department(6,"Sports");
//        departmentDao.update(dp);

//        System.out.println("Test 9");
//        departmentDao.deleteById(7);

//        System.out.println("Test 10");
//        System.out.println(departmentDao.findById(3));

//        System.out.println("Test 11");
//        List<Department> deps = departmentDao.findAll();
//        deps.forEach(System.out::println);
    }
}

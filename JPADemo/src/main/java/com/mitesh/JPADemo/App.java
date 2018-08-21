package com.mitesh.JPADemo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitesh.JPADemo.dao.EmployeeDAOImpl;
import com.mitesh.JPADemo.dao.UserDAOImpl;
import com.mitesh.JPADemo.entities.Address;
import com.mitesh.JPADemo.entities.CardInfo;
import com.mitesh.JPADemo.entities.CardType;
import com.mitesh.JPADemo.entities.ContractEmployee;
import com.mitesh.JPADemo.entities.Employee;
import com.mitesh.JPADemo.entities.FullTimeEmployee;
import com.mitesh.JPADemo.entities.Profile;
import com.mitesh.JPADemo.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EcommerceApp");
//        UserDAOImpl daoImpl = new UserDAOImpl(factory);
////        User user = daoImpl.getUser("asjkf");
//        User user2 = new User("kbc3","def",new Address("1","2","city","aw"));
//        Profile profile = new Profile("miteshja2","srinab",Calendar.getInstance());
//        user2.setProfile(profile);
//        user2.addCardInfo(new CardInfo("asf8y85", new Date(), "mitesh", CardType.VISA));
//        user2.addCardInfo(new CardInfo("asf2fa2", new Date(), "mitesh2", CardType.MASTERCARD));
//        System.out.println(user2);
//        daoImpl.addUser(user2);
//        User user1 = daoImpl.getUser("kbc3");
//        System.out.println(user1);
//        
        //Address address = new Address("");
        //User user = new User("someuser5","updatedPassword");
        //daoImpl.addUser(user);
//        User user2 = daoImpl.getUser("someuser5");
//        System.out.println(user2);
//        daoImpl.updateUser(user);
//       
//        System.out.println(daoImpl.getUser("someuser5"));
//        daoImpl.deleteUser("someuser5");
//        System.out.println(daoImpl.getUser("someuser5"));
//        factory.close();
        EmployeeDAOImpl daoEmp = new EmployeeDAOImpl(factory);
        Employee e1 = new FullTimeEmployee(123.44,415.5,"name1","panathur");
        Employee e2 = new ContractEmployee(141.51,122.6,"empl2","chattisgarh");
        daoEmp.addEmployee(e1);
        daoEmp.addEmployee(e2);
        List<Employee> list = daoEmp.getAllFTEmployees();
        System.out.println(list);
        list = daoEmp.getAllContractEmployees();
        System.out.println(list);
        list = daoEmp.getAllEmployees();
        System.out.println(list);
    }
}

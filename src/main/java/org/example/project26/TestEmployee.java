package org.example.project26;

import org.example.project26.Entity.Detail;
import org.example.project26.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Vera", "Ruybkina",
//                    "HR", 1000);
//            Detail detail = new Detail("Moscow", "55555555", "veraruybkina@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Anton", "Popov",
//                    "IT", 1500);
//            Detail detail = new Detail("Voronezh", "45657611", "antonpopovn1@gmail.com");
//
//            employee.setEmpDetail(detail);

//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            ////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.remove(employee);

            session.getTransaction().commit();

            System.out.println("Успешно!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}

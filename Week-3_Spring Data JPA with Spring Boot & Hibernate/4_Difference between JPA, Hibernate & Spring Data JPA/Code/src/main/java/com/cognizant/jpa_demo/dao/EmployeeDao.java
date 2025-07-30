package com.cognizant.jpa_demo.dao;


import com.cognizant.jpa_demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
    private SessionFactory hibernateFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    public Integer createEmployee(Employee staffMember) {
        Session currentSession = hibernateFactory.openSession();
        Transaction databaseTransaction = null;
        Integer generatedId = null;
        try {
            databaseTransaction = currentSession.beginTransaction();
            generatedId = (Integer) currentSession.save(staffMember);
            databaseTransaction.commit();
        } catch (Exception exception) {
            if (databaseTransaction != null) databaseTransaction.rollback();
            exception.printStackTrace();
        } finally {
            currentSession.close();
        }
        return generatedId;
    }
}


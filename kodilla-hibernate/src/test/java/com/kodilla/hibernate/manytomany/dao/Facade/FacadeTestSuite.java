package com.kodilla.hibernate.manytomany.dao.Facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testMatchingCompaniesName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        searchFacade.save(softwareMachine);
        searchFacade.save(greyMatter);
        searchFacade.save(greyMatter);

        List<Company> matchingCompaniesName = null;
        try {
            matchingCompaniesName = searchFacade.searchCompany("soft");
        } catch (SearchException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(1, matchingCompaniesName.size());

        //CleanUp
        searchFacade.delete(softwareMachine.getId());
        searchFacade.delete(greyMatter.getId());
        searchFacade.delete(dataMaesters.getId());
    }

    @Test
    public void testMatchingEmployeeName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        searchFacade.save(softwareMachine);
        searchFacade.save(greyMatter);
        searchFacade.save(dataMaesters);

        List<Employee> matchingEmployeeName = null;
        try {
            matchingEmployeeName = searchFacade.searchEmployee("Sm");
        } catch (SearchException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(1, matchingEmployeeName.size());

        //CleanUp
        searchFacade.delete(softwareMachine.getId());
        searchFacade.delete(greyMatter.getId());
        searchFacade.delete(dataMaesters.getId());
    }
}


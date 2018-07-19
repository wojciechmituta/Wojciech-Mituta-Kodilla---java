package com.kodilla.hibernate.manytomany.dao.Facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void save(Company company){
        companyDao.save(company);
    }

    public void delete(int id){
        companyDao.delete(id);
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee> searchEmployee(String search) throws SearchException{
        LOGGER.info("Searching for employees matching " + search);
        List<Employee> list = employeeDao.findMatchingName(search);
        if (list.size() < 1) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else  {
            LOGGER.info("List of employees matching");
            for (Employee employee : list) {
                LOGGER.info(employee.getFirstname() + " " + employee.getLastname());
            }
            return list;
        }
    }

    public List<Company> searchCompany(String name) throws SearchException{
        LOGGER.info("Searching for companies matching " + name);
        List<Company> list = companyDao.findMatchingName(name);
        if(list.size() < 1){
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("List of companies matching");
            Set<Company> setList = new HashSet<>(list);
            List<Company> exitList = new ArrayList<>(setList);
            for (Company company : exitList){
                LOGGER.info(company.getName());
            }
            return exitList;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchFacade that = (SearchFacade) o;
        return Objects.equals(companyDao, that.companyDao) &&
                Objects.equals(employeeDao, that.employeeDao);
    }

    @Override
    public int hashCode() {

        return Objects.hash(companyDao, employeeDao);
    }
}

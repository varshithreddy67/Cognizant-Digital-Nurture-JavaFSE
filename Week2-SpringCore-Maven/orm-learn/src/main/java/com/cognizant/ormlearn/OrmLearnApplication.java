package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        testGetEmployee();
        testGetEmployeesByDepartment();
        testEmployeesBySalaryAndPermanent();
        testNativeQuery();
        testCriteriaAPI();
        testCriteriaSalary();
        testCriteriaOrderBySalary();

        // Uncomment when needed
        // testAddCountry();
        // testUpdateCountry();
        // testDeleteCountry();
        // testStockQueries();
    }

    private void testGetEmployee() {

        Employee employee = employeeService.getEmployee(1);

        if (employee == null) {
            System.out.println("Employee not found");
            return;
        }

        System.out.println("\n--- Employee Details ---");
        System.out.println(employee);

        if (employee.getDepartment() != null) {
            System.out.println("Department: " + employee.getDepartment().getName());
        }

        if (employee.getSkills() != null) {
            System.out.println("Skills:");
            employee.getSkills().forEach(skill ->
                    System.out.println("- " + skill.getName())
            );
        }
    }

    private void testCriteriaOrderBySalary() {

        System.out.println("\n--- Criteria API : Order By Salary DESC ---");

        employeeService
                .getEmployeesCriteriaOrderBySalary()
                .forEach(System.out::println);
    }

    private void testCriteriaSalary() {

        System.out.println("\n--- Criteria API : Salary > 60000 ---");

        employeeService
                .getEmployeesCriteriaBySalary(60000.0)
                .forEach(System.out::println);
    }

    private void testCriteriaAPI() {

        System.out.println("\n--- Criteria API ---");

        employeeService
                .getEmployeesCriteria()
                .forEach(System.out::println);
    }

    private void testGetEmployeesByDepartment() {

        System.out.println("\n--- Employees in IT Department ---");

        employeeService.getEmployeesByDepartment("IT")
                .forEach(System.out::println);
    }

    private void testAddCountry() {

        Country existingCountry = countryService.getCountry("JP");

        if (existingCountry != null) {
            System.out.println("JP country already exists");
            return;
        }

        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");

        countryService.addCountry(country);

        Country savedCountry = countryService.getCountry("JP");

        System.out.println("Country Added Successfully");
        System.out.println("Code: " + savedCountry.getCode()
                + ", Name: " + savedCountry.getName());
    }

    private void testUpdateCountry() {

        Country country = countryService.getCountry("JP");

        if (country == null) {
            System.out.println("JP country not found");
            return;
        }

        country.setName("Japan Updated");
        countryService.updateCountry(country);

        Country updatedCountry = countryService.getCountry("JP");

        System.out.println("Country Updated Successfully");
        System.out.println("Code: " + updatedCountry.getCode()
                + ", Name: " + updatedCountry.getName());
    }

    private void testDeleteCountry() {

        Country country = countryService.getCountry("JP");

        if (country == null) {
            System.out.println("JP country already deleted or not found");
            return;
        }

        countryService.deleteCountry("JP");

        System.out.println("Country Deleted Successfully");

        Country deletedCountry = countryService.getCountry("JP");

        if (deletedCountry == null) {
            System.out.println("JP country is not present in database");
        }
    }
    private void testEmployeesBySalaryAndPermanent() {

        System.out.println(
                "\n--- Permanent Employees With Salary Above 60000 ---"
        );

        employeeService
                .getEmployeesBySalaryAndPermanent(60000.0, true)
                .forEach(System.out::println);
    }

    private void testNativeQuery() {

        System.out.println("\n--- Native Query : Salary > 60000 ---");

        employeeService
                .getEmployeesWithSalaryGreaterThan(60000.0)
                .forEach(System.out::println);
    }

    private void testStockQueries() {

        System.out.println("\n--- Facebook Stocks: September 2019 ---");

        List<Stock> facebookStocks =
                stockRepository.findByCodeAndDateBetween(
                        "FB",
                        LocalDate.of(2019, 9, 1),
                        LocalDate.of(2019, 9, 30)
                );

        facebookStocks.forEach(System.out::println);

        System.out.println("\n--- Google Stocks: Close Price Greater Than 1250 ---");

        List<Stock> googleStocks =
                stockRepository.findByCodeAndCloseGreaterThan(
                        "GOOGL",
                        1250.0
                );

        googleStocks.forEach(System.out::println);

        System.out.println("\n--- Top 3 Highest Transaction Volumes ---");

        List<Stock> highestVolumeStocks =
                stockRepository.findTop3ByOrderByVolumeDesc();

        highestVolumeStocks.forEach(System.out::println);

        System.out.println("\n--- Netflix Lowest 3 Closing Prices ---");

        List<Stock> lowestNetflixStocks =
                stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");

        lowestNetflixStocks.forEach(System.out::println);
    }
}
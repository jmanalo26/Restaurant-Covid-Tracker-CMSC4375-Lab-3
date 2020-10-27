package src.edu.ben.labs.lab3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import src.edu.ben.labs.lab3.data.model.Address;
import src.edu.ben.labs.lab3.data.model.Customer;
import src.edu.ben.labs.lab3.data.model.Employee;
import src.edu.ben.labs.lab3.data.model.Restaurant;
import src.edu.ben.labs.lab3.data.repository.AddressRepository;
import src.edu.ben.labs.lab3.data.repository.CustomerRepository;
import src.edu.ben.labs.lab3.data.repository.EmployeeRepository;
import src.edu.ben.labs.lab3.data.repository.RestaurantRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This application will create the tables into the "cmsc4375_lab3" schema and update
 * each table with their respective data via the repositories.
 */
@SpringBootApplication
public class RestaurantCOVIDTracker {
    private final AddressRepository addressRepository;
    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final RestaurantRepository restaurantRepository;

    public static HashMap<Integer, Customer> customerList = new HashMap<>();
    public static HashMap<Integer, Employee> employeeList = new HashMap<>();
    public static HashMap<Integer, Address> addressList = new HashMap<>();
    public static HashMap<Integer, Restaurant> restaurantList = new HashMap<>();

    public static ArrayList<Integer> duplicateCustomers = new ArrayList<>();
    public static ArrayList<Integer> duplicateEmployees = new ArrayList<>();
    public static ArrayList<Integer> duplicateAddresses = new ArrayList<>();
    public static ArrayList<Integer> duplicateRestaurants = new ArrayList<>();

    public RestaurantCOVIDTracker(AddressRepository addressRepository, CustomerRepository customerRepository, EmployeeRepository employeeRepository,
                                  RestaurantRepository restaurantRepository){
        this.addressRepository = addressRepository;
        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
        this.restaurantRepository = restaurantRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestaurantCOVIDTracker.class, args);
    }

    @Bean
    public CommandLineRunner process(){
        return (args) ->
                processdata();
    }

    /**
     * This method will process the data from CSV's and place it into their respective repositories
     * @throws SQLException
     * @throws FileNotFoundException
     */
    private void processdata() throws SQLException, FileNotFoundException {
        File addressFile = new File("src/Address.csv");
        File customerFile = new File("src/Customer.csv");
        File employeeFile = new File("src/Employee.csv");
        File restaurantFile = new File("src/Restaurant.csv");

        addressFileReader(addressFile);
        customerFileReader(customerFile);
        employeeFileReader(employeeFile);
        restaurantFileReader(restaurantFile);

        // Remove from Map if entry in table
        for (Integer s : duplicateCustomers) {
            if (customerList.containsKey(s)) {
                customerList.remove(s);
            }
        }

        for (Integer s : duplicateEmployees) {
            if (employeeList.containsKey(s)) {
                employeeList.remove(s);
            }
        }

        for (Integer s : duplicateAddresses) {
            if (addressList.containsKey(s)) {
                addressList.remove(s);
            }
        }

        for (Integer s : duplicateRestaurants) {
            if (restaurantList.containsKey(s)) {
                restaurantList.remove(s);
            }
        }
    }

    public void addressFileReader(File csvFile) throws FileNotFoundException {
        Scanner fileInput = new Scanner(csvFile);
        // Skip 1st line
        fileInput.nextLine();
        // Store Student data
        while (fileInput.hasNext()) {
            String words = fileInput.nextLine().replace("'", "");
            String[] row = words.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            storeAddress(row);
        }
        fileInput.close();
    }

    public void storeAddress(String[] item) {
        Address newAddress = new Address();
        newAddress.setAddressID(Integer.parseInt(item[0]));
        newAddress.setStreet1(item[1]);
        newAddress.setStreet2(item[2]);
        newAddress.setStreet3(item[3]);
        newAddress.setCity(item[4]);
        newAddress.setState(item[5]);
        newAddress.setPostalCode(Integer.parseInt(item[6]));
        if (!addressList.containsKey(item[0])) {
            addressList.put(newAddress.getAddressID(), newAddress);
            addressRepository.save(newAddress);
            System.out.println(newAddress.getStreet1());
        }
    }

    public void customerFileReader(File csvFile) throws FileNotFoundException {
        Scanner fileInput = new Scanner(csvFile);
        // Skip 1st line
        fileInput.nextLine();
        // Store Student data
        while (fileInput.hasNext()) {
            String words = fileInput.nextLine().replace("'", "");
            String[] row = words.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            storeCustomer(row);
        }
        fileInput.close();
    }

    public void storeCustomer(String[] item) {
        Customer newCustomer = new Customer();
        newCustomer.setCustomerID(Integer.parseInt(item[0]));
        newCustomer.setFirstName(item[1]);
        newCustomer.setLastName(item[2]);
        newCustomer.setEmail(item[3]);
        newCustomer.setPhone(item[4]);
        newCustomer.setBirthday(item[5]);
        newCustomer.setEntryDate(item[6]);
        if (item[7].contains("x")) {
            item[7] = "1";
        } else {
            item[7] = "0";
        }
        newCustomer.setCovidPos(Integer.parseInt(item[7]));
        newCustomer.setAddressID(Integer.parseInt(item[8]));
        newCustomer.setRestaurantID(Integer.parseInt(item[9]));
        if (!customerList.containsKey(item[0])) {
            customerList.put(newCustomer.getCustomerID(), newCustomer);
            customerRepository.save(newCustomer);
            System.out.println(newCustomer.getFirstName() + " " + newCustomer.getLastName());
        }
    }

    public void employeeFileReader(File csvFile) throws FileNotFoundException {
        Scanner fileInput = new Scanner(csvFile);
        // Skip 1st line
        fileInput.nextLine();
        // Store Student data
        while (fileInput.hasNext()) {
            String words = fileInput.nextLine().replace("'", "");
            String[] row = words.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            storeEmployee(row);
        }
        fileInput.close();
    }

    public void storeEmployee(String[] item) {
        Employee newEmployee = new Employee();
        newEmployee.setID(Integer.parseInt(item[0]));
        newEmployee.setFirstName(item[1]);
        newEmployee.setLastName(item[2]);
        newEmployee.setEmail(item[3]);
        newEmployee.setPhone(item[4]);
        newEmployee.setBirthday(item[5]);
        newEmployee.setEntryDate(item[6]);
        if (item[7].contains("x")) {
            item[7] = "1";
        } else {
            item[7] = "0";
        }
        newEmployee.setCovidPos(Integer.parseInt(item[7]));
        newEmployee.setAddressID(Integer.parseInt(item[8]));
        newEmployee.setRestaurantID(Integer.parseInt(item[9]));
        if (!employeeList.containsKey(item[0])) {
            employeeList.put(newEmployee.getID(), newEmployee);
            employeeRepository.save(newEmployee);
            System.out.println(newEmployee.getFirstName() + " " + newEmployee.getLastName());
        }
    }

    public void restaurantFileReader(File csvFile) throws FileNotFoundException {
        Scanner fileInput = new Scanner(csvFile);
        // Skip 1st line
        fileInput.nextLine();
        // Store Student data
        while (fileInput.hasNext()) {
            String words = fileInput.nextLine().replace("'", "");
            String[] row = words.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            storeRestaurant(row);
        }
        fileInput.close();
    }

    public  void storeRestaurant(String[] item) {
        Restaurant place = new Restaurant(0, null, null, null, 0);
        place.setRestaurantID(Integer.parseInt(item[0]));
        place.setName(item[1]);
        place.setEmail(item[2]);
        place.setPhone(item[3]);
        place.setAddressID(Integer.parseInt(item[4]));
        if (!restaurantList.containsKey(item[0])) {
            restaurantList.put(place.getRestaurantID(), place);
            restaurantRepository.save(place);
            System.out.println(place.getName());
        }
    }

}

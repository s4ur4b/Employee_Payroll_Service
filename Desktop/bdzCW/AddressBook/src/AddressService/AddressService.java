package AddressService;

import AddressModel.Address;
import Utility.Utility;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressService {

    static ArrayList<Address> addressList = new ArrayList<>();

    public void addToBook() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = Utility.readString();

        System.out.println("Enter last name: ");
        String lastName = scan.next();

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scan.next();

        System.out.println("Enter email:");
        String email = scan.next();

        System.out.println("Enter state: ");
        String state = scan.next();

        System.out.println("Enter city: ");
        String city = scan.next();

        System.out.println("Enter zip");
        String zip = scan.next();

        Address obj = new Address();
        obj.setFirstName(firstName);
        obj.setLastName(lastName);
        obj.setPhoneNo(phoneNumber);
        obj.setState(state);
        obj.setCity(city);
        obj.setZip(zip);
        obj.setEmail(email);
        addressList.add(obj);

    }

    public void editAdBook() {

        AddressService obj = new AddressService();

        System.out.print("\nEnter the first name you want to edit the details for : ");
        String fName = Utility.readString();
        System.out.println(fName);
        for (Address item : addressList) {
            if (item.getFirstName().equals(fName)) {

                int editOption=0;

                while (editOption != 8) {

                System.out.println("Choos your edit option: ");
                System.out.println("1. First Name");
                System.out.println("2. Last Name");
                System.out.println("3. City");
                System.out.println("4. State");
                System.out.println("5. Zip");
                System.out.println("6. Phone Number");
                System.out.println("7. Email");
                System.out.println("8. Exit");
                editOption = Utility.readInteger();

                    Address contact = new Address();

                    switch (editOption) {

                        case 1:
                            System.out.println("Enter new First Name");
                            String eFirstName = Utility.readString();
                            item.setFirstName(eFirstName);
                            break;

                        case 2:
                            System.out.println("Enter new Last Name: ");
                            String eLastName = Utility.readString();
                            item.setLastName(eLastName);
                            break;

                        case 3:
                            System.out.println("Enter new City: ");
                            String eCity = Utility.readString();
                            item.setCity(eCity);
                            break;
                        case 4:
                            System.out.println("Enter new State: ");
                            String eState = Utility.readString();
                            item.setState(eState);
                            break;
                        case 5:
                            System.out.println("Enter new Zip: ");
                            String eZip = Utility.readString();
                            item.setZip(eZip);
                            break;
                        case 6:
                            System.out.println("Enter new Phone Number: ");
                            String ePhone = Utility.readString();
                            item.setPhoneNo(ePhone);
                            break;
                        case 7:
                            System.out.println("Enter new Email: ");
                            String eEmail = Utility.readString();
                            item.setEmail(eEmail);
                            break;
                    }

                }
            }
        }
    }

    public ArrayList<Address> getAllContacts(){
        return addressList;
    }

    public void addTempContact() {
        Address obj = new Address();
        obj.setFirstName("Saurabh");
        obj.setLastName("Chavan");
        obj.setPhoneNo("9421228322");
        obj.setEmail("gmail");
        obj.setState("mh");
        obj.setCity("pu");
        obj.setZip("456");
        addressList.add(obj);

        Address obj1 = new Address();
        obj1.setFirstName("Shubham");
        obj1.setLastName("Kumar");
        obj1.setPhoneNo("9421228311");
        obj1.setEmail("gmail");
        obj1.setState("mh");
        obj1.setCity("pu");
        obj1.setZip("456");
        addressList.add(obj1);
    }

    public void delete(String deleteName) {
        for (Address item : addressList) {
            if (item.getFirstName().equals(deleteName)){
                addressList.remove(item);
            }
        }

    }

    public void print() {
        for (Address items : getAllContacts()){
            System.out.println(items);
        }
    }

}


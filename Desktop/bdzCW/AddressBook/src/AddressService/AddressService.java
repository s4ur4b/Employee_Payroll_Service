package AddressService;

import AddressController.AddressController;
import AddressModel.Address;
import Utility.Utility;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressService {


    public ArrayList<Address> addToBook(ArrayList<Address> list) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scan.next();

        System.out.println("Enter last name: ");
        String lastName = scan.next();

        System.out.println("Enter Phone Number: ");
        double phoneNumber = scan.nextDouble();

        System.out.println("Enter email:");
        String email = scan.next();

        System.out.println("Enter state: ");
        String state = scan.next();

        System.out.println("Enter city: ");
        String city = scan.next();

        System.out.println("Enter zip");
        double zip = scan.nextDouble();

        Address obj = new Address();
        obj.setFirstName(firstName);
        obj.setLastName(lastName);
        obj.setPhoneNo(phoneNumber);
        obj.setState(state);
        obj.setCity(city);
        obj.setZip(zip);
        obj.setEmail(email);
        list.add(obj);

        return list;

    }

    public ArrayList<Address> editAdBook(ArrayList<Address> list1) {
        AddressController obj = new AddressController();

        System.out.print("\nEnter the first name you want to edit the details for : ");
        String fName = Utility.readString();
        String firstName = fName;

        for (Address item : obj.getAllContacts()) {
            if (obj.getAllContacts().contains(firstName)) {
                int x = obj.getAllContacts().indexOf(item);
                System.out.println("Choose your edit option: ");
                System.out.println("1. Last Name");
                System.out.println("2. City");
                System.out.println("3. State");
                System.out.println("4. Zip");
                System.out.println("5. Phone Number");
                System.out.println("6. Email");
                int editOption = Utility.readInteger();

                Address contact = new Address();

                switch (editOption) {

                    case 1:
                        System.out.println("Enter new Last Name: ");
                        String eLastName = Utility.readString();
                        list1.get(x).setLastName(eLastName);
                        //     contact.setLastName(eLastName);
                        break;

                    case 2:
                        System.out.println("Enter new City: ");
                        String eCity = Utility.readString();
                        list1.get(x).setCity(eCity);
                        break;
                    case 3:
                        System.out.println("Enter new State: ");
                        String eState = Utility.readString();
                        list1.get(x).setState(eState);
                        break;
                    case 4:
                        System.out.println("Enter new Zip: ");
                        double eZip = Utility.readDouble();
                        list1.get(x).setZip(eZip);
                        break;
                    case 5:
                        System.out.println("Enter new Phone Number: ");
                        double ePhone = Utility.readDouble();
                        list1.get(x).setPhoneNo(ePhone);
                        break;
                    case 6:
                        System.out.println("Enter new Email: ");
                        String eEmail = Utility.readString();
                        list1.get(x).setEmail(eEmail);
                        break;
                }

            }
        }

        return list1;
    }


}


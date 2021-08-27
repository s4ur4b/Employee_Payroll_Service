  package AddressController;

import Utility.Utility;
import AddressModel.Address;
import AddressService.AddressService;

import java.util.ArrayList;
import java.util.Set;

public class AddressController {

    static AddressService  service = new AddressService();

    public static void main(String[] args) {
            int choice = 0;

        while(choice != 5) {

            System.out.println("Press the key according to your requirements: \nEnter 1 For adding Details into the Address Book" +
                    "\nEnter 2 For Deleting Item of the Address Book\nEnter 3 For Editing Details of the Address Book" +
                    " \nEnter 4 for Displaying all contacts \nEnter 5 to exit ");
            choice = Utility.readInteger();

            switch (choice) {

                case 1:
                    service.addTempContact();
                    service.addToBook();

                    break;


                case 2:
                    System.out.println("Enter The Name of The Contact you want to delete");
                    String deleteName = Utility.readString();

                    service.delete(deleteName);
                    service.print();

                    break;

                case 3:
                    service.editAdBook();
                    service.print();
                    break;
                case 4:
                    service.print();

                    break;
            }

        }
        System.out.println("Thank you");

    }

}


package AddressController;

import Utility.Utility;
import AddressModel.Address;
import AddressService.AddressService;

import java.util.ArrayList;
import java.util.Set;

public class AddressController {
    static ArrayList<Address> addressList = new ArrayList<>();
    static AddressService  service = new AddressService();

    public static void main(String[] args) {
            int choice = 0;

        while(choice != 5) {

            System.out.println("Press the key acording to your requirements: \nEnter 1 For adding Details into the Address Book" +
                    "\nEnter 2 For Deleting Item of the Address Book\nEnter 3 For Editing Details of the Address Book" +
                    " \nEnter 4 fpr Displaying all contacts \nEnter 5 to exit ");
            choice = Utility.readInteger();


            switch (choice) {

                case 1: addressList = service.addToBook(addressList);

                    break;


                case 2:
                    Address contact = new Address();
                    System.out.println("Enter The Name of The Contact you want to delete");
                    String deleteName = Utility.readStringLine();
                    deleteName = Utility.readString();

                    for (Address item : addressList) {
                        if (item.getFirstName().equals(deleteName)){
                           int delIndex= addressList.indexOf(item);
                            addressList.remove(delIndex);
                        }
                    }
                    break;

                case 3:
                      addressList =  service.editAdBook(addressList);
                    break;
                case 4:
                    for (Address items : addressList){
                        System.out.println(items);
                    }
                    break;
            }

        }
        System.out.println("Thank you");

    }

    public ArrayList<Address> getAllContacts(){
        return addressList;
    }
}


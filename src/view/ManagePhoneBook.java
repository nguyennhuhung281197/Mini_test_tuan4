package view;

import controller.PhoneBookManage;
import modent.Contact;
import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args)  {
        PhoneBookManage phoneBookManage = new PhoneBookManage();

        Scanner sc = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) {
            System.out.println("""
                    +------------------------------------+
                    | 1. Add to contacts                 |
                    | 2. Edit name contacts              |
                    | 3. Delete contacts                 |
                    | 4. Search contacts                 |
                    | 5. Sort contacts                   |
                    | 6. Display All                     |
                    | 7.Display by Type                  |
                    | 0.Exit                             |
                    +------------------------------------+
                    """);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name  : ");
                    String name = sc.nextLine();

                    System.out.println("Enter Number Phone : ");
                    String number = sc.nextLine();

                    System.out.println(" Type Input ");
                    System.out.println("Enter id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name :");
                    String nameType = sc.nextLine();

                    Contact.Type type = new Contact.Type(id, nameType);
                    Contact contact = new Contact(name, number, type);
                    phoneBookManage.insertPhone(contact);

                    break;
                case 2:
                    System.out.println("Enter The Name You Want To Edit  ");

                    System.out.println("Enter Name Edit");
                    String editName = sc.nextLine();
                    System.out.println("Enter New Phone : ");
                    String editPhone = sc.nextLine();

                    type = new Contact.Type();
                    contact = new Contact(editName, editPhone, type);
                    phoneBookManage.updatePhone(editName, editPhone);
                    System.out.println("Successful fix..." + contact);
                    break;
                case 3:
                    System.out.println("Input Delete :");
                    String removeName = sc.nextLine();
                    phoneBookManage.removePhone(removeName);
                    System.out.println("Successful Delete....");
                    break;
                case 4:
                    System.out.println("Search Input :");
                    String searchName = sc.nextLine();
                    phoneBookManage.searchPhone(searchName);


                    break;
                case 5:
                    System.out.println("Sort Name....");
                    phoneBookManage.sortContact();
                    System.out.println("Successful Sort...");
                    break;
                case 6:
                    System.out.println("Show all....");
                    phoneBookManage.displayAll();
                    break;

                case 7:
                    System.out.println(" Are you late to re-enter Type  ");
                    System.out.println("Enter id : ");
                    int displayId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name :");
                    String displayNameType = sc.nextLine();

                    Contact.Type displayType = new Contact.Type(displayId, displayNameType);
                    phoneBookManage.display(displayType);

                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Please re-enter.............. ");

            }
        }
    }
}
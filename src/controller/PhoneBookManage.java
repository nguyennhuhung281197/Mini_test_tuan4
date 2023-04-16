package controller;

import modent.Contact;
import modent.IPhone;
import modent.Phone;
import storage.ReadWriteFile;

import java.util.*;

public class PhoneBookManage extends Phone implements IPhone {
    private List<Contact> contactsList;

    public PhoneBookManage() {
        contactsList = new ArrayList<>();

    }

    public PhoneBookManage(List<Contact> contactsList) {
        this.contactsList = contactsList;
        ReadWriteFile.readData();
    }

    public void displayAll() {
        for (Contact contact : contactsList) {
            System.out.println(contact);
        }
    }

    @Override
    public void searchPhone(String name) {
        for (Contact contact : contactsList) {
            if (contact.getName().equals(name)) {
                System.out.println(contact.getNumberPhone());
                return;
            }
        }
        System.out.println("Does not exist !");
    }

    @Override
    public void insertPhone(Contact contact) {
        contactsList.add(contact);
        ReadWriteFile.writeData(contactsList);

    }

    @Override
    public void removePhone(String name) {
        for (Contact contact1 : contactsList) {
            if (contact1.getName().equals(name)) {
                contactsList.remove(contact1);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (Contact contact1 : contactsList) {
            if (contact1.getName().equals(name)) {
                contact1.setNumberPhone(newPhone);

            }

        }
    }

    @Override
    public void sortContact() {
        contactsList.sort(Comparator.comparing(Contact::getName));
    }

    @Override
    public void display(Contact.Type type) {
        if (type == null) {
            for (Contact contact : contactsList) {
                System.out.println(contactsList.add(contact));
            }
        } else {
            for (Contact contact : contactsList) {
                if (contact.getType().getId() == type.getId()) {
                    System.out.println(contact.getName() + "  " + contact.getNumberPhone());
                }
            }
        }
    }
}
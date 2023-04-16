package modent;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Contact> phoneContact = new ArrayList<>();

    protected Phone() {
    }

    public abstract void display(Contact.Type type);

    public abstract void insertPhone(Contact contact);

    public abstract void removePhone(String name);

    public abstract void updatePhone(String name, String newPhone);

    public Phone(List<Contact> phoneContact) {
        this.phoneContact = phoneContact;
    }

    public List<Contact> getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(List<Contact> phoneContact) {
        this.phoneContact = phoneContact;
    }
}
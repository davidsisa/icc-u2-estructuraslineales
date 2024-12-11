package Controller;

import Models.Contact;
import Models.LinkedList;
import Models.Node;
public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;
    public  ContactManager (){
        this.contacts = new LinkedList<>();
    }
    public void addContact (Contact<?, ?> contact){
        contacts.appendToTall(contact);
    }
    public Contact<?, ?> findContactByName(String name){
        Node<Contact<?, ?>> current = contacts.getHead();
        while (current !=null) { 
            if(((String) current.getValue().getName()).equalsIgnoreCase(name)){
                return current.getValue();
            }    
            current = current.getNext();          
        }
        return null;
    }
    public void deleteContact(String name){
        Node<Contact<?, ?>> current = contacts.getHead();
        if(current == null)
            return;

        if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize() -1 );
            return;
        }

        while(current.getNext()!= null){
            if(((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)){
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() - 1);
                return;
            }
            current = current.getNext();
        }
        
    }   
}

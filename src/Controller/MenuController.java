package Controller;
import Models.Contact;
import View.ConsoleView;
public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;
    public MenuController(){
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }
    public void showMenu(){
        boolean exit = false;
        while(!exit){
            consoleView.displayMenu();
            String option = consoleView.getInput(" ");
            switch(option){
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printContact();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMesagge(" Exiting ...");
                    break;
                default:
                    consoleView.showMesagge("Invalid Option ");
                    break;

            }
        }
    }
    private void addContact(){
        String name = consoleView.getInput("Enter name : ");
        String phone = consoleView.getInput("Enter phone : ");
        Contact<String,String> contact = new Contact<>(name,phone);
        contactManager.addContact(contact);
        consoleView.showMesagge("Contact added");
    }
    private void findContact() {

    }
    private void deleteContact() {

    }
    private void printContact() {

    }

}

package RegionalControlComputer;

//define all variables and methods to be implemented
public interface Account {

    final int UID = 49251;

    void createAccount(int UID);

    void login(int ID);
    
    void checkCredentials(int ID);
    
    void updateAccount();
}

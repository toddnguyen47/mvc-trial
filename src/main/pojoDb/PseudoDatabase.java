package main.pojoDb;

import java.util.ArrayList;
import java.util.List;

import main.a_model.UserModel;

/**
 * A Singleton Object to represent a Database.
 * @author Todd Nguyen
 *
 */
public class PseudoDatabase {
    private static PseudoDatabase instance;
    private PseudoDatabase() {};
    public static PseudoDatabase getInstance() {
        if (instance == null) instance = new PseudoDatabase();
        return instance;
    }
    
    
    // Table of UserModels
    private List<UserModel> tableOfUserModels = new ArrayList<>();
    public List<UserModel> getTableOfUserModels() {return this.tableOfUserModels;}
}

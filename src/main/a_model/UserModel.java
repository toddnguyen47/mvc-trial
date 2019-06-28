package main.a_model;

import main.pojoDb.PseudoDatabase;

public class UserModel extends BaseModel {
    private int _id;
    private String _title;
    private String _jobDescription;
    private PseudoDatabase _database = PseudoDatabase.getInstance();

    public int getId() {
        return this._id;
    }

    public String getTitle() {
        return this._title;
    }

    public String getJobDescription() {
        return this._jobDescription;
    }

    public boolean setId(int id) {
        boolean idChanged = this._id != id;
        if (false == idChanged)
            this._id = id;

        return idChanged;
    }

    public boolean setTitle(String title) {
        boolean titleChanged = !(this._title.equalsIgnoreCase(title));
        if (false == titleChanged)
            this._title = title;

        return titleChanged;
    }

    public boolean setJobDescription(String jobDesc) {
        boolean jobDescChanged = !(this._jobDescription.equalsIgnoreCase(jobDesc));
        if (false == jobDescChanged)
            this._jobDescription = jobDesc;

        return jobDescChanged;
    }
    
    
    public void addToDatabase() {
        this._database.getTableOfUserModels().add(this);
    }
    

    /**
     * If two UserModels have the same ID, they are equal!
     */
    @Override
    public boolean equals(Object other) {
        if (false == (other instanceof UserModel))
            return false;

        return this._id == ((UserModel) other).getId();
    }
}

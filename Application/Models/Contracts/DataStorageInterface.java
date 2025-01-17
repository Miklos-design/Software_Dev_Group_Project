package Application.Models.Contracts;

import java.util.List;

public interface DataStorageInterface<T> {
    // Gets the data for a specific ID
    public T get(int id);

    // Get all entries as a list
    public List<T> getAll();

    //persists data of the created model
    public void save();

    //update the model
    public void update();

    // delete the retrieved object
    public void delete();

}

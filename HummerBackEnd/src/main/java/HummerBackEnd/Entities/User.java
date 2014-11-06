package HummerBackEnd.Entities;

import com.google.appengine.api.datastore.Email;
import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    long userId;
    String firstName;
    String lastName;
    Email emailId;
    GeoPt currentLocation;
    List<Item> items = new ArrayList<Item>();

    List<User> connections = new ArrayList<User>();

    public User() {
    }

    public User(long userId, String firstName, String lastName, Email emailId,
                GeoPt currentLocation, List<Item> items, List<User> connections) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.currentLocation = currentLocation;
        this.items = items;
        this.connections = connections;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Email getEmailId() {
        return emailId;
    }

    public void setEmailId(Email emailId) {
        this.emailId = emailId;
    }

    public GeoPt getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(GeoPt currentLocation) {
        this.currentLocation = currentLocation;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<User> getConnections() {
        return connections;
    }

    public void setConnections(List<User> connections) {
        this.connections = connections;
    }
}


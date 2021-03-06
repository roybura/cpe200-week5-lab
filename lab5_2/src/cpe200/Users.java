package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {

    public ArrayList<User> userList= new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUser(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        addUser(user);

    }

    public void deleteUser(User user) {
        if(!exists(user)){
            throw new RuntimeException();
        }else
            userList.remove(user);
    }

    public boolean exists(User user) {
        if (userList.contains(user)) {
            return true;
        } return false;
    }

    public boolean usernameExists(String username) {
        for(User usern:userList){
            if(usern.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName) {
        for(User usern : userList){
            if (usern.getUserName().equals(userName))
                return usern;
        }return  null;
    }

    public int count() {
        return userList.size();
    }

    public User[] getUserArray() {
        return userList.toArray(new User[userList.size()]);
    }
}

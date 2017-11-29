import java.lang.*;

public class User {
 protected String name;
 protected String surname;
 protected String password;

 protected String id;

 public void setName(String name) {
	 this.name = name;
    }
 public String getName() {
        return name;
    }
 public void setSurname() {
    }

 public void setId() {
    }

  public String getId() {
        return null;
    }
  
  public User() { } 

  public User(String name, String surname, String id, String password) {
     this.name = name;
     this.surname = surname;
     this.id = id;
     this.password = password;
    
  }
}


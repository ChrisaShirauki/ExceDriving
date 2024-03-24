/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class User {
    
    private String username;
    private int age;
    private String gender;
    private String email;
    private int progress; 
    
    
    public User(String username, int age, String gender, String email, int progress){
        this.username= username;
        this.age = age;
        this.gender= gender;
        this.email = email;
        this.progress =progress;
    }
    
    public String getUsername(){
        return this.username;
    }
    
     public int getAge(){
        return this.age;
    }
     
     public String getGender(){
         return this.gender;
     }
     
     public String getEmail(){
         return this.email;
     }
     
     public int getProgress(){
         return this.progress;
     }
     
     public void setUsername(String username){
         this.username = username;
     }
}


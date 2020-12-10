package com.aplikasi.resepmakanan;

public class LoginAction {

    boolean Login(String username, String password){
        if (username.equals("admin") && password.equals("admin")){
            return true;
        }else{
            return false;
        }
    }

}

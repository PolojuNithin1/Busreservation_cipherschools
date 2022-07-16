package org.example;

public class Main {
    public static void main(String[] args) {

        LoginSignup loginSignup = new LoginSignup();
        UserOperation userOperation = new UserOperation();
        AdminOperations adminOperations = new AdminOperations();
//        Signing up into the portal
        System.out.println(loginSignup.signup("nithin",99893273,"polojunithin@gmail.com","Thorror","csp","Telangana","1234567890"));
        System.out.println(loginSignup.signup("poloju",99895369,"poloju@gmail.com","thorrur","csp","Telangana","1234567890"));
        System.out.println(loginSignup.signup("Ajay",94415497,"nithin@gmail.com","thorrur","csp","Telangana","1234567890"));
//        Logging in into the portal
        System.out.println(loginSignup.login("polojunithin@gmail.com","1234567890"));
        System.out.println(loginSignup.login("polojunithin","1234567890"));
//        Creating new bus details
        adminOperations.createBus("AP 21 CG 3281","self","AP","Delhi");
        adminOperations.createBus("AP 71 CG 1234","driver","UP","HYD");
//        updating username
        userOperation.updateUserName("polojunithin@gmail.com","nithin");
//        displaying the updated username
        System.out.println(userOperation.findUser("polojunithin@gmail.com"));
    }
}
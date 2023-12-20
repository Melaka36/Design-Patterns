package com.designPatterns;

public class Email {
    public void sendEmail(){
        connect();
        authenticate();
        //send email
        disconnect();
    }
    private void connect(){
        System.out.println("COnnect");
    }
    private void disconnect(){
        System.out.println("Disconnect");
    }
    private void authenticate(){
        System.out.println("Authenticated");
    }

}


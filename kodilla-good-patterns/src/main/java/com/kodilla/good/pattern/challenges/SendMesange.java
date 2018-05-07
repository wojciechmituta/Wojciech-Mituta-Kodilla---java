package com.kodilla.good.pattern.challenges;

public class SendMesange implements InformationService{
    @Override
    public void info(User user) {
        System.out.println("Confirmation has been sent to: " + user.getName() + " " + user.getLastName());
    }
}

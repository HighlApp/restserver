package com.highlapp.restserver.classes;

import java.util.Date;

public class Response {

    private static int counter;

    private int id;
    private Date currentDate;
    private String handshakeMsg;
    private String detailMsg;

    public Response(String msgParam) {
        this.id = ++counter;
        this.currentDate = new Date();
        this.handshakeMsg = "Hello, " + msgParam + " !";
        this.detailMsg = "Welcome to my firtst RESTful web service server!";
    }

    public  int getId() {
        return id;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getHandshakeMsg() {
        return handshakeMsg;
    }

    public String getDetailMsg() {
        return detailMsg;
    }
}

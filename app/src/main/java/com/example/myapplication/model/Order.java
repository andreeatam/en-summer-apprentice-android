package com.example.myapplication.model;

import java.util.Date;

public class Order {
    private int orderID;
    private int customerID;
    private int ticketCategoryID;
    private Date orderedAt;
    private double numberOfTickets;
    private double totalPrice;

    public Order() {
    }

    public Order(int orderID, int customerID, int ticketCategoryID, Date orderedAt, double numberOfTickets, double totalPrice) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public double getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(double numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

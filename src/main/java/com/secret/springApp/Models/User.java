package com.secret.springApp.Models;

import com.secret.springApp.SubscriptionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "points")
    private Integer points;

    @Column(name = "timeJoined")
    private LocalDateTime timeJoined;

    @Column(name = "orders")
    private ArrayList<Order> orders;

    @Column(name = "isSubscribed")
    private boolean isSubscribed;

    @Column(name = "subscriptionType")
    private SubscriptionType subscriptionType;

    @Column(name = "timeSubscribed")
    private LocalDateTime timeSubscribed;

    @Column(name = "dateSubscriptionExpired")
    private LocalDateTime timeSubscriptionLeft;
}

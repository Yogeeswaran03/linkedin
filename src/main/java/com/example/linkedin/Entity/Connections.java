package com.example.linkedin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "connections")
public class Connections {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "connection_id")
    private Long connectionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Profile user;

    // No-arg constructor
    public Connections() {
    }

    // Getters and setters
    public Long getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
    }

    public Long getUserId() {
        return user != null ? user.getUserid() : null;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    // toString method
    @Override
    public String toString() {
        return "Connections{" +
                "connectionId=" + connectionId +
                ", userId=" + getUserId() +
                '}';
    }
}

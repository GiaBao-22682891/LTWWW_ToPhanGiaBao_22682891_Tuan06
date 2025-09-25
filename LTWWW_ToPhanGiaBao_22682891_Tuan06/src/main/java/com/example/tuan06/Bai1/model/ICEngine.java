package com.example.tuan06.Bai1.model;

public class ICEngine {
    private float cylinderCapacity;
    private String type;

    public ICEngine() {
    }

    public ICEngine(float cylinderCapacity, String type) {
        this.cylinderCapacity = cylinderCapacity;
        this.type = type;
    }

    public void start() {
        System.out.println("Engine is started");
    }
}

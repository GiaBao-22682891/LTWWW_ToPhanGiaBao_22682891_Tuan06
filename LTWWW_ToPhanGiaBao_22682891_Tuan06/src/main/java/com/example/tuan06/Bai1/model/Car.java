package com.example.tuan06.Bai1.model;

public class Car {
    private ICEngine engine;

    public void start () {
        engine = new ICEngine();
        engine.start();
    }
}

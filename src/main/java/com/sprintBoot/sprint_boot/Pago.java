package com.sprintBoot.sprint_boot;

public class Pago implements Transferencia{
    @Override
    public void transferir() {
        System.out.println("Realizar pago...");
    }
}

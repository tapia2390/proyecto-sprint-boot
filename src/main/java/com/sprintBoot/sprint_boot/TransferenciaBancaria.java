package com.sprintBoot.sprint_boot;

class TransferenciaBancaria implements  Transferencia{

    public  TransferenciaBancaria(){}

    @Override
    public void transferir() {
        System.out.println("Transfiriendo....");
    }


}
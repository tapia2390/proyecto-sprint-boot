package com.sprintBoot.sprint_boot;

class BancaWeb {
    private  TransferenciaBancaria tb;

    public  BancaWeb(){
        tb = new TransferenciaBancaria();

    }

    public void realizarTransferencia(){
        tb.transferir();
    }

}


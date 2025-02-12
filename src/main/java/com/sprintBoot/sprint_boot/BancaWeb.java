package com.sprintBoot.sprint_boot;

class BancaWeb {
    private  Transferencia it;

    public  BancaWeb(Transferencia t){
        this.it = t;

    }

    public void realizarTransferencia(){
        it.transferir();
    }

}


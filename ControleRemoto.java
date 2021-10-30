package questão1;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
 
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        if (this.getLigado()){
        
        System.out.println("----- Abrindo MENU -----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+= 10) {
            System.out.print("|");
            }
        } else {
            System.out.println("Ligue a Tv");
        }
    }
 
    public void fecharMenu() {
        if (this.getLigado()){
        System.out.println("Fechando Menu...");
        } else {
            System.out.println("Impossivel fechar o menu.");
        }
    }

    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() +5);
        } else {
            System.out.println("Impossível aumentar volume, ligue a Tv.");
        }
    }

    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -5);
        } else {
            System.out.println("Impossível diminuir volume, ligue a Tv.");
        }
    }

    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não posso reproduzir, ligue a Tv.");
        }
    }

    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar, ligue a Tv.");
        }
    }
    
}


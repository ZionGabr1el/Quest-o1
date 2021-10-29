package questão1;

import java.io.Serializable;

public class Controle implements Serializable {

  private static final long serialVersionUID = 1L;

  private Televisao televisao;

  public Controle()
  {
    this.televisao = new Televisao();
  }
  
  public void addCanal()
  {
    this.televisao.addCanal();
  }

  public void addVolume()
  {
    this.televisao.addVolume();
  }
  
  public int getCanal()
  {
    return this.televisao.getCanal();
  }

  public int getVolume()
  {
    return this.televisao.getVolume();
  }

  public void setCanal(int canal)
  {
    this.televisao.setCanal(canal);
  }

  public void subCanal()
  {
    this.televisao.subCanal();
  }
  
  public void subVolume()
  {
    this.televisao.subVolume();
  }
  public static void main(String[] args)
  {
    Controle controle = new Controle(); // Canal: 3 Volume: 0
    
    controle.addCanal(); // Canal: 5
    controle.addCanal(); // Canal: 6
    controle.addCanal(); // Canal: 9
    
    controle.addVolume(); // Volume: 1
    controle.subVolume(); // Volume: 0
    controle.subVolume(); // Volume: 0
    
    controle.setCanal(20); // Canal: 500
    controle.addCanal(); // Canal: 3
    controle.addCanal(); // Canal: 5
  }
}
public class Fan extends LightWalaFan implements SwitchBoard , Regulator { 

    @Override
    public void SwitchOn(){
        System.out.println("this will switch on the Fan");
    }

    @Override
    public void SwitchOff(){
        System.out.println("this will switch off the Fan");
    }

    @Override
    public void RotateLeft() {
        // TODO Auto-generated method stub
        System.out.println("rotate left");
     
    }

    @Override
    public void rotatRight() {
        // TODO Auto-generated method stub
        System.out.println("rotate right");
       
    }
  @Override
  public void welcome(){
    System.out.println("Welcome");
  }
    
}

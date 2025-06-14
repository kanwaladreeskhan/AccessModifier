package accessmodifier; 
public class Sphere{
  private double radius;
  private double height;
  public double getradius(){
      return radius;
  }
   public void setradius(double radius){
    this.radius=radius;                         
  }
     public double getheight(){
      return height;
  }
   public void setheight(double height){
    this.height=height;                         
  }
   public double surfacearea(){
      return 4*3.14*radius*radius ; 
   }
    public double volume(){
      return (4/3)*3.14*radius*radius*radius ; 
   }
}

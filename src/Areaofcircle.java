class Areaofcircle
{
  float areaofcircle(float pi,int r)
{
  return pi*r*r;
}
public static void main(String args[])
{
  Areaofcircle area=new Areaofcircle();
  float areacircle=area.areaofcircle(3.14f,9);
  System.out.println("Area of circle"+areacircle);
}
}
 
class Tree{
private String treeName;
private String treeType;
private boolean leavesFall;
private String leafColor;

Tree()
{
  treeName="";
  treeType="";
  leavesFall=false;
  leafColor="";
}
Tree(String a, String b, boolean c, String d)
{
  treeName=a;
  treeType=b;
  leavesFall=c;
  leafColor=d;
}
void setName(String a)
{
  treeName=a;
}
void setType(String a)
{
  treeType=a;
}
void setFallen(boolean a)
{
  leavesFall=a;
}
void setColor(String a)
{
  leafColor=a;
}
String getName()
{
  return treeName;
}
String getType()
{
  return treeType;
}
boolean getFallen()
{
  return leavesFall;
}
String getColor()
{
  return leafColor;
}
void print()
{
  String dummy=" does not ";
  if(leavesFall)
  {
    dummy=" does ";
  }
  System.out.println("This is a "+ treeName+" tree. It is a " + treeType+" and its leaves are currently "+leafColor+". It"+dummy+"lose its leaves for the winter.");
}
}
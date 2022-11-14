class Player
{
int a=10;
void player()
{
System.out.println("I am a player");
}
}
class Cricket_Player extends Player
{
int b=20;
void cricket_player()
{
System.out.println("I am a cricket player");
}
}
class Football_Player extends Player
{
int c=30;
void football_player()
{
System.out.println("I am a football player");
}
}
class Hockey_player extends Player
{
int d=40;
void hockey_player()
{
System.out.println("I am a hockey player");
}
}
public class execute
{
public static void main(String[] args)
{
Player p=new Player();
System.out.println("a= "+p.a);
p.player();
Cricket_Player cp=new Cricket_Player();
System.out.println("b= "+cp.b);
cp.cricket_player();
Football_Player fp=new Football_Player();
System.out.println("c= "+fp.c);
fp.football_player();
Hockey_player hp=new Hockey_player();
System.out.println("d= "+hp.d);
hp.hockey_player();
}
}
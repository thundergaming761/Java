//Songs search System
import java.util.*;
public class  Main{
    String name;
    String artist;
    String album;
    String genre;
    String a[];
    int i;
    Main(String name,String artist, String album, String genre, String a[])
{
    this.name=name;
    
    this.artist=artist;
    this.album=album;
    this.genre=genre;
    this.a=a;

}

void displaysongdetails(){
int k=1;
    System.out.println(name+" is a "+genre+" song by "+artist+" from the album "+album);
    System.out.println("Following are the songs of "+artist);
    for(int i=0;i<18;i++)
{
    System.out.println((k)+". "+a[i]);
k++;
}
    System.out.println("Default source and destination are " +a[0]+" and "+a[17]);

}
void change(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Choose your favourite singer");
    artist = sc.next();
    System.out.println("Playlist for you : This is " + artist + " playlist");
}
void display()

{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of songs you like : ");
    int n =sc.nextInt();
    String c[]=new String[n];
System.out.println("Enter your song :");
       for(int i=0;i<n;i++){ 
           
           c[i]=sc.next();
       }
       for (int i=0;i<n;i++){
           System.out.println((i+1)+" "+c[i]);
       }
        
       
    
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String a[]={"Love me like u do","flop song","come thru","barisho me ","love yourself","gerua","fairy tale","maa baap","Tera zkir","Tu Chaiye","Saddi Gali","I like you","Cooped up","Rider","Self care","Wish","Anjaan","Schedule"};

    Main obj=new Main("Love me like u do","Ellie Goulding","Fifty Shades of Grey","Pop",a);
while(true)
    {
        System.out.println("1. Display song details\n2. Change source and destination\n3. Enter Songs you like\n4. Exit");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)


        {
            case 1:
            obj.displaysongdetails();
            break;
            case 2:
            obj.change();
            break;
            case 3:
            obj.display();
            break;
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice");
        }
    }   
}
}
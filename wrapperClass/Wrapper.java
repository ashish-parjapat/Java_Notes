/**
 * Wrapper
 */
public class Wrapper {

    public static void main(String[] args) {
        
//         boxing of all data types inti theoir respective wrapper class and also string

//int
        int a=10;
        Integer b=Integer.valueOf(a);
        System.out.println(b);

        String c=String.valueOf(a);
        System.out.println(c);


        //byte

        byte d=20;
        Byte e=Byte.valueOf(d);
        System.out.println(e);

        String f=String.valueOf(d);
        System.out.println(f);


        //short

        short g=30;
        short h=Short.valueOf(d);
        System.out.println(h);

        String i=String.valueOf(g);
        System.out.println(i);


        //long

        long j=3000;
        long k=Long.valueOf(d);
        System.out.println(k);

        String l=String.valueOf(j);
        System.out.println(l);


        //double

        float m=40.f;
        float n=Float.valueOf(m);
        System.out.println(h);

        String o=String.valueOf(m);
        System.out.println(o);


        //char

        char p=30;
        char q=Character.valueOf(p);
        System.out.println(h);

        String r=String.valueOf(p);
        System.out.println(r);



     //   can i convert byte to Integer----------------->NO

        byte by=20;
        Integer in=Integer.valueOf(by);


        //can i convert int to Double ------------------>No
        int inte=200;
        Double dou=Double.valueOf(inte);

    //------------------------------->YES
        char ch='a';
        Integer integ=(int)ch;


//----------------------------------->YES
        int ze=10;
        Character chz=(char)ze;


        //double to Integer----------->NO

        double df=45.2;
        Integer jk=Double.valueOf(df);

        // Integer jk=(int)df;



        //----------------------------------------------------------------------------------------------------------
        //Unboxing if all wrapper class


        //Byte
        Byte bt=10;
        byte be=bt.byteValue();
        System.out.println(be);

        //Short

        Short st=20;
        short so=st.shortValue();
System.out.println(so);


//Integeeree

Integer itz=30;
int itg=itz.intValue();

System.out.println(itg);


//Long

Long lg=400l;
long lo=lg.longValue();
System.out.println(lo);


//Float

Float fl=120.0f;
float ft=fl.floatValue();
System.out.println(ft);




//can i convert Byte to int-------------->Yes

Byte bey=120;

int ti=(Byte)bey;
System.out.println(ti);


//Intgere to double--------------------->YEs

Integer cs=45;

double css=(Integer)cs;
System.out.println(css);



//Character to int----------->YES

Character x='x';

int gff=(Character)x;

System.out.println(gff);


//Integer to char------------>NO

Integer sc=56;

char ds=(Integer)sc;


//String to PDT


String str="10";
int aa=Integer.parseInt(str);

System.out.println(aa);


byte aaa=Byte.parseByte(str)


short shit=Short.parseShort(str);


long lng=Long.parseLong(str);


float fta=Float.parseFloat(str);



// //can i convert the integer string to double type of data -------------------->NO





// //can i convert the character String to int type ----------->NO
Character cr='n';
int gh=Integer.parseInt(cr);











    }
}
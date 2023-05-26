import java.util.*;
//--------------------------Login-------------------------------------------------------------------------------
class Login
{
    public void disp()
    {
        System.out.println("--------------------------------------Welcome to Hostipal-----------------------------------------------------------------------                             ");
        System.out.println("--------------------------------------Enter the login id -----------------------------------------------------------------------                             ");

    }
    public void Username()
    {
        String User = "cool";
        int userpass = 123;

        Scanner sc = new Scanner(System.in);

        // The login Area
        System.out.println("Enter the username : ");
        String Username = sc.next();

        System.out.println("Enter the password : ");
        int password = sc.nextInt();

        if (Username .equals(User) && password == userpass)
        {
            System.out.print("--------------------------------------Congratulation-----------------------------------------------------------------------");
        } else
        {
            System.out.println("Enter the correct login name or password");
            Username();

        }
    }
}

//------------------------------------------Doctors--------------------------------------------------------------------------------------------

class Doctors {
    public void selecctDoctors()
    {
        HashMap hm = new HashMap();
        hm.put(1," Dr. Shivani");
        hm.put(2," Dr. Saruk");
        hm.put(3," Dr. Madam");
        System.out.println(hm);

        Scanner sc = new Scanner(System.in);
        System.out.println("choose a doctor" );
        int value = sc.nextInt();
        System.out.println("The Chossen Doctor is : "+hm.get(value));

    }
}

//-------------------------------------------------------Diseases----------------------------------------------------------------------------------

class DIseases {
    public void diseases()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Diseases ");
        String disease = sc.next();
        System.out.println("The Diseases is " + disease);
    }
}

//-----------------------------------Medicine---------------------------------------------------------------------------

class Medicine {
    public void precautions()
    {
        System.out.println("Take care of diseases ");
        HashMap hm2 = new HashMap();
        hm2.put(1 , " Dolo 650");
        hm2.put(2, " paracetamol");
        System.out.println(hm2);

        System.out.println("Choose the Medicine ");
        Scanner sc = new Scanner(System.in);
        int med = sc.nextInt();
        System.out.println("The chosen medicine is " + hm2.get(med));
    }
}

//-------------------------------------------------Main-----------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        Login l = new Login();
        l.disp();
        l.Username();
        System.out.println();
        System.out.println();


        System.out.println("The Doctors in the hospital are ");
        Doctors Dr = new Doctors();
        Dr.selecctDoctors();
        System.out.println();


        DIseases d = new DIseases();
        d.diseases();
        System.out.println();

        Medicine m = new Medicine();
        m.precautions();

    }
}
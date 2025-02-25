import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Vector vector = new Vector();
    }
}
class Vector {
    int x1, y1, z1, x2, y2, z2;

    void input_coord()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите х1: ");
        x1  = in.nextInt();
        System.out.print("Введите x2: ");
        x2  = in.nextInt();
        System.out.print("Введите y1: ");
        y1  = in.nextInt();
        System.out.print("Введите y2: ");
        y2  = in.nextInt();
        System.out.print("Введите z1: ");
        z1  = in.nextInt();
        System.out.print("Введите z2: ");
        z2  = in.nextInt();
        System.out.printf(" x1: %d  x2: %d\n y1: %d \ty2: %d\n z1: %d \tz2: %d", x1, x2, y1, y2, z1, z2);
    }

    void dlina()
    {
        double dlina = Math.sqrt(x1*x2+y1*y2+z1*z2);
        System.out.print("\nДлина вектора: " + dlina);
    }
    void scal()
    {
        double scal = (x1*x2)+(y1*y2)+(z1*z2);
        System.out.print("\nСкалярное произведение равно: " + scal);
    }
    void vector_scal()
    {
        double a = y1*z2-z1*y2;
        double b = z1*x2-x1*z2;
        double c = x1*y2-y1*x2;
        System.out.printf("\nВекторное произведение равно: (%f, %f, %f)", a,b,c);
    }

    Vector()
    {
        input_coord();
        dlina();
        scal();
        vector_scal();
    }
}
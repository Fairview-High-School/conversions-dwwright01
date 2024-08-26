import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Kilograms to Pounds");
        System.out.println("8. Pounds to Kilograms");
        System.out.println("9. US Dollars to British Pounds");
        System.out.println("10. British Pounds to US Dollars");
        System.out.println("");
        System.out.println("Type a number 1-10 to select your desired conversion:");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahernheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahernheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * (0.3048);
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * (3.28084);
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * (29.5735);
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = (milliliters * 0.0338140565);
            System.out.println(milliliters + " milliliters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = kilograms * 2.20462;
            System.out.println(kilograms + " kilograms is " + pounds + " pounds");
        }
        if (selection == 8)
        {
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double kilograms = pounds * 0.453591830542594;
            System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        }
        if (selection == 9)
        {
            System.out.println("Enter US Dollars: ");
            double dollars = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = dollars * 0.76;
            System.out.println(dollars + " US Dollars is " + pounds + " British Pounds");
        }
        if (selection == 10)
        {
            System.out.println("Enter British Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double dollars = pounds * 1.27;
            System.out.println(pounds + " British Pounds is " + dollars + " US Dollars");
        }
        if (selection == 69)
        {
            System.out.println("...sus");
        }
        else
        {
            System.out.println("I told you to type in a number from 1-10 dum dum :(");
        }
    }
}
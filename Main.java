/**
Name: Viet Nguyen
Class: Java II
Assignment: Human Resources
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();

        Person testPerson = new Person("Wario", 173, 100);
        System.out.println("Test Person: " + testPerson);
        System.out.println();

        PersonSet testSet = new PersonSet();
        testSet.add(testPerson);
        System.out.println("Test PersonSet:");
        System.out.println(testSet);

        if (args.length < 1)
        {
            System.out.println("Usage: java Main <filename>");
            System.exit(1);
        }

        PersonSet hrSet = new PersonSet();

        try
        {
            Scanner fileReader = new Scanner(new File(args[0]));

            if (fileReader.hasNextLine())
            {
                fileReader.nextLine();
            }

            while (fileReader.hasNext())
            {
                String name   = fileReader.next();
                double height = fileReader.nextDouble();
                double weight = fileReader.nextDouble();

                Person p = new Person(name, height, weight);
                hrSet.add(p);
            }

            fileReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.exit(1);
        }

        System.out.println("HR data (no duplicates):");
        System.out.println("Name\tHeight (cm)\t\tWeight (kg)");
        System.out.print(hrSet);

        try
        {
            FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
            fileWriterOrder.write("Name\tHeight (cm)\t\tWeight (kg)\n");
            fileWriterOrder.write(hrSet.toString());
            fileWriterOrder.close();
            System.out.println("\nOutput written to outputfile.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.exit(1);
        }
    }
}

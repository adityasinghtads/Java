import java.util.Scanner;

class userInputs {

  static void aditya() {
    System.out.println("Hi this is tads");
  }
  

  public static void main(String[] args) {
    // Opening the scanner
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name : ");
    String name = scanner.nextLine();
    System.out.println(name);
    System.out.printf("Hello %s\n", name);

    System.out.print("What is your Age : ");
    int age = scanner.nextInt();
    System.out.printf("Your age is : %d", age);

    System.out.printf(" ");

    scanner.close();
    // closing the scanner

    Scanner scan = new Scanner(System.in);
    System.out.println("Hi I am Adita pls tell how can i help : ");
    String name1 = scan.nextLine();
    System.out.println(name1);
    scan.close();

    Scanner newScan = new Scanner(System.in);
    int number = newScan.nextInt();
    newScan.nextLine(); // Cleans up extra buffer input buffer
    System.out.println(number);
    newScan.close();

    /*
     * To take user inputs in java firstly we need to
     * Make a new scanner object and then take the input in the next line from the
     * user, once the complete use of scanner class is done we need to close the
     * object using the same name of the object.
     */

    Scanner adiScan = new Scanner(System.in);
    double newDouble = adiScan.nextDouble();
    double newDouble1 = Double.parseDouble(adiScan.nextLine());
    System.out.println(newDouble);
    System.out.println(newDouble1);
    adiScan.close();

    Scanner adi2 = new Scanner(System.in);
    // Float newFloat = adi2.nextFloat();
    int newFloat = Integer.parseInt(adi2.nextLine());
    System.out.println(newFloat);
    adi2.close();

    /*
     * We can always take input from nextLine() Then later convert to int
     * cam be done with
     * int age = Integer.parseInt(scanner.nextLine());
     */

  }
}

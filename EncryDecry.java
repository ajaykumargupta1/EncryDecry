import java.io.*;
import java.util.Scanner;
class EncryDecry
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to EncryDecry!");
        System.out.println("Enter 'E' for encry or 'D' for decry:");
        String choice = sc.nextLine();
        System.out.println("Enter the file name or path:");
        String fileName = sc.nextLine();
        if (choice.equalsIgnoreCase("E")) 
        {
            encryptFile(fileName);
        }
         else if (choice.equalsIgnoreCase("D"))
         {
            decryptFile(fileName);
        }
         else
         {
            System.out.println("Invalid choice.");
        }
        
        sc.close();
    }
    private static void encryptFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter("encrypted_" + fileName));
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character + 1);
            }
            reader.close();
            writer.close();
            System.out.println("Encryption DONE. Encrypted file saved as 'encrypted_" + fileName + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void decryptFile(String fileName)
     {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter("decrypted_" + fileName));
            int character;
            while ((character = reader.read()) != -1) 
            {
                writer.write(character - 1);
            }
            reader.close();
            writer.close();
            System.out.println("Decryption DONE. Decrypted file save 'decrypted_" + fileName + "'.");
        }
         catch (IOException e)
          {
            e.printStackTrace();
        }
    }
}
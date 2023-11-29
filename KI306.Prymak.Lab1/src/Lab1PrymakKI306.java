import java.io.*;
import java.util.*;
/**
 * @author Bogdan
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1PrymakKI306 {
     /**
     * @param args
     * @throws FileNotFoundException
     *
     */

    public static void main(String[] args) throws FileNotFoundException
    {
        int n=0;

        try{
            RandomAccessFile f = new RandomAccessFile ("num.txt","r");
            f.seek(0);

            String s = f.readLine();
            n = Integer.parseInt(s);

            System.out.println(n);
            f.close();
        }
        catch (Exception e) {
            System.err.println("Помилкаfff: " + e.getMessage());
        }




        char arr[][];
        String filler;
        String filler1;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        //System.out.print("Enter size of matrix: ");
        //n = in.nextInt();
        //in.nextLine();

        int r=n/4;
        arr = new char[n][];

        System.out.print("\nEnter the placeholder: ");
        filler = in.nextLine();

        System.out.print("\nEnter the placeholder 2: ");
        filler1 = in.nextLine();

        if(filler.length()==1) {
            for (int i = 0; i < arr.length; ++i) {
                if (i < r || i >= n-r) {
                    arr[i] = new char[n];
                    for(int j=0;j<n;j++)
                        arr[i][j] = (char)filler1.codePointAt(0);
                }
                else
                {
                    arr[i] = new char[r*2];
                    for(int j=0; j<arr[i].length;j++)
                        arr[i][j] = (char)filler.codePointAt(0);
                }

            }

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j] + " ");
                System.out.print("\n");
            }

            System.out.print("=====================================================\n");

            for(int i=0;i<n;i++)
            {
                int jk=0;
                for(int j=0;j<n;j++)
                {

                    if (i< r || i >= n-r){
                        System.out.print(arr[i][jk] + " ");
                        fout.print(arr[i][jk] + " ");
                        jk++;
                    }
                    else
                    {
                        if(j< r || j >= n-r){
                            System.out.print(arr[i][jk] + " ");
                            fout.print(arr[i][jk] + " ");
                            jk++;
                        }
                        else
                        {
                            System.out.print("  ");
                            fout.print("  ");
                        }
                    }
                }
                System.out.print("\n");
                fout.print("\n");
            }

        }

        else if(filler.length()==0)
            System.out.print("No character entered filler\n");
        else
            System.out.print("Too many characters aggregates\n");

        fout.flush();
        fout.close();
    }
}
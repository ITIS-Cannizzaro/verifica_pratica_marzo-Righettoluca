import java.lang.reflect.Array;
import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class MainClass
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				StampaPari();
				break;
			case 2:
				MinimodiArray();
				break;
			case 3:
				UgualiConsecutivi();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. MinimodiArray");
		System.out.println("2 - Es n. * - Titolo es. StampaPari");
		System.out.println("3 - Es n. * - Titolo es. uguali Consecutivi");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void UgualiConsecutivi()
	{
		int[]a = new int [20];
		for (int i = 0 ; i <a.length ; i++)
		{
			a[i] = (int)((Math.random()*7)-3);
		}
		for(int i = 0 ; i <a.length ;i++)
		{
			if(a{i} == a{i + 1}) 
		}
				System.out.print(a{i+1});
			System.out.print(a{i});
		

	}

	static void MinimodiArray()
	{
		int [] array1 = new int [10];
		int k = 0;
		for (int i = 0 ; i < array1.length ; i++)
		{
			array1[i] = (int)((Math.random()*10)-5);
			if (array1[i] < k)
				array1[i] = k;
		}

	}
	static void Swap( int v[] , int a , int b )
	{
		int temp = v[a];
		v [a] = v [b];
		v [b] = temp;
	}
	static void StampaPari()






	{
		int[] array1 = new int [20];
		int j = 0;
		int n = 0;
		int numeroPari = j+=2;
		for (int i = 0 ; i < array1.length ; i++)
		{
			array1[i] = (int)(Math.random()*100);
			if (i == numeroPari)
				System.out.println(array1[i]);
		}
		for(int i = 0 ; i < array1.length ; i++)
		{
			if(array1[i] < n)
				array1[i] = n;
			System.out.print(array1[i] + " ");

		}

	}
}



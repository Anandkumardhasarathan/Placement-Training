package WiproPractice;

import java.util.Scanner;

public class question {
//     Q1: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (Thousands digit of input1 x Hundereds digit of input2) + (smallest digit of input3)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (3 * 4) + 1 = 13

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
    public int findKey(int input1,int input2,int input3)
    {
        //Read only region end
        int key=(input1/1000)*((input2/100)%10);
        int mindig = 10;
        while(input3!=0)
        {
            if(input3%10<mindig)
                mindig = input3%10;
            input3/=10;
        }
        key+=mindig;
        return key;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		question m = new question();
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		System.out.println(m.findKey(input1,input2,input3));
	}



// // Q2. Find Key:
// // You are provided with 3 numbers: input1, input2 and input3
// // Each of these are four digit numbers within the range>=1000 and range<=9999.
// // i.e.
// // 1000 <= input1 <= 9999
// // 1000 <= input2 <= 9999
// // 1000 <= input3 <= 9999

// // You are expected to find the key using the formula -

// // key = (sum of Largest digits of all the 3 numbers) - (sum of Smallest digit of all 3 numbers)

// // For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (5+5+5) - (1+2+1) = 11

// // Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// // Solution:
// // import java.util.Scanner;
// // public class Main
// // {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int sum1=0,sum2=0;
//         int[] arr = {input1,input2,input3};
//         for(int i:arr)
//         {
//             sum1+=largest(i);
//             sum2+=smallest(i);
//         }
//         return (sum1-sum2);
//     }
//     public int largest(int n)
//     {
//         int max=0;
//         while(n!=0)
//         {
//             if(n%10>max)
//                 max=n%10;
//             n/=10;
//         }
//         return max;
//     }
//     public int smallest(int n)
//     {
//         int min=10;
//         while(n!=0)
//         {
//             if(n%10<min)
//                 min=n%10;
//             n/=10;
//         }
//         return min;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}



// Q3: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (Hundreds digit of input1 x Tens digit of input2) - (Largest digit of input3)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (5*5) - 5 = 20

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int key=((input1/100)%10)*((input2/10)%10);
//         int maxdig = 0;
//         while(input3!=0)
//         {
//             if(input3%10>maxdig)
//                 maxdig = input3%10;
//             input3/=10;
//         }
//         key-=maxdig;
//         return key;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q4: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (Thousands digit of input1 x Hundreds digit of input2) - (Largest digit of input3)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (3*4) - 5 = 7

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int key=(input1/1000)*((input2/100)%10);
//         int maxdig = 0;
//         while(input3!=0)
//         {
//             if(input3%10>maxdig)
//                 maxdig = input3%10;
//             input3/=10;
//         }
//         key-=maxdig;
//         return key;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q5: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = [largest digit in the thousands place of all three numbers][largest digit in the hundreds place of all three numbers][largest digit in the tens place of all three numbers][largest digit in the units place of all three numbers]

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = [3][5][5][2] = 3552

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.io.*;
// import java.util.*;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         String key="";
//         int p = 3;
//         while(input1!=0)
//         {
//             int div = (int)(Math.pow(10,p));
//             key+=Integer.toString(largest((input1/div),(input2/div),(input3/div)));
//             input1%=div;input2%=div;input3%=div;
//             p--;
//         }
//         return Integer.valueOf(key);
//     }
//     public int largest(int i1,int i2,int i3)
//     {
//         if(i1>i2 && i1>i3)
//             return i1;
//         else if(i2>i3)
//             return i2;
//         else
//             return i3;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q6: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = [largest digit in the thousands place of all three numbers - smallest digit in the thousands place of all three numbers][largest digit in the hundreds place of all three numbers - smallest digit in the thousands place of all three numbers][largest digit in the tens place of all three numbers - smallest digit in the thousands place of all three numbers][largest digit in the units place of all three numbers - smallest digit in the thousands place of all three numbers]

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = [3-1][5-3][5-2][2-1] = 2231

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.io.*;
// import java.util.*;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         String key="";
//         int p = 3;
//         while(input1!=0)
//         {
//             int div = (int)(Math.pow(10,p));
//             key+=Integer.toString((largest((input1/div),(input2/div),(input3/div))) - (smallest((input1/div),(input2/div),(input3/div))));
//             input1%=div;input2%=div;input3%=div;
//             p--;
//         }
//         return Integer.valueOf(key);
//     }
//     public int largest(int i1,int i2,int i3)
//     {
//         if(i1>i2 && i1>i3)
//             return i1;
//         else if(i2>i3)
//             return i2;
//         else
//             return i3;
//     }
//     public int smallest(int i1,int i2,int i3)
//     {
//         if(i1<i2 && i1<i3)
//             return i1;
//         else if(i2<i3)
//             return i2;
//         else
//             return i3;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q7: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (Hundreds digit of input1 x Tens digit of input2) * (Largest digit of input3)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (5*5) * 5 = 125

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int key=((input1/100)%10)*((input2/10)%10);
//         int maxdig = 0;
//         while(input3!=0)
//         {
//             if(input3%10>maxdig)
//                 maxdig = input3%10;
//             input3/=10;
//         }
//         key*=maxdig;
//         return key;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q8: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (sum of Smallest digit of all 3 numbers) - (sum of Largest digits of all the 3 numbers)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (1+2+1) - (5+5+5) = -11

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int sum1=0,sum2=0;
//         int[] arr = {input1,input2,input3};
//         for(int i:arr)
//         {
//             sum1+=largest(i);
//             sum2+=smallest(i);
//         }
//         return (sum2-sum1);
//     }
//     public int largest(int n)
//     {
//         int max=0;
//         while(n!=0)
//         {
//             if(n%10>max)
//                 max=n%10;
//             n/=10;
//         }
//         return max;
//     }
//     public int smallest(int n)
//     {
//         int min=10;
//         while(n!=0)
//         {
//             if(n%10<min)
//                 min=n%10;
//             n/=10;
//         }
//         return min;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q9: Find Key:
// You are provided with 3 numbers: input1, input2 and input3
// Each of these are four digit numbers within the range>=1000 and range<=9999.
// i.e.
// 1000 <= input1 <= 9999
// 1000 <= input2 <= 9999
// 1000 <= input3 <= 9999

// You are expected to find the key using the formula -

// key = (sum of Largest digits of all the 3 numbers) + (sum of Smallest digit of all 3 numbers)

// For e.g. if input1 = 3521, input2 = 2452, input3 = 1352, then key = (5+5+5) + (1+2+1) = 19

// Assume that the 3 numbers are passed to given function. Complete the function to find and return the key.

// Solution:
// import java.util.Scanner;
// public class Main
// {
//     public int findKey(int input1,int input2,int input3)
//     {
//         //Read only region end
//         int sum1=0,sum2=0;
//         int[] arr = {input1,input2,input3};
//         for(int i:arr)
//         {
//             sum1+=largest(i);
//             sum2+=smallest(i);
//         }
//         return (sum1+sum2);
//     }
//     public int largest(int n)
//     {
//         int max=0;
//         while(n!=0)
//         {
//             if(n%10>max)
//                 max=n%10;
//             n/=10;
//         }
//         return max;
//     }
//     public int smallest(int n)
//     {
//         int min=10;
//         while(n!=0)
//         {
//             if(n%10<min)
//                 min=n%10;
//             n/=10;
//         }
//         return min;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		int input1 = sc.nextInt();
// 		int input2 = sc.nextInt();
// 		int input3 = sc.nextInt();
// 		System.out.println(m.findKey(input1,input2,input3));
// 	}
// }

// Q10: Return the modified sentence

// Write a program that forms a new sentence upon taking an input Stringas per the below algorithm.
// 	-> shift the alphabets N number of times in FORWARD mode, where N is the length of a particular word in the given String.

// Example:
// input1: Hi Hell
// output1: Jk Lipp
// Explanation: H and i in the word "Hi" is shifted 2 times forward as the length of "Hi" is 2.
// All the alphabets in the word "Hell" is shifted 4 times forward as the length of "Hell" is 4.

// 	-> if the alphabet reaches the end of the series, then it should be replaced with z or Z, depending on its case.

// input2: ABCDX
// output2: FGHIZ
// Explanation: All the alphabets in the word "ABCDX" is shifted 5 times forward as the length of "ABCDX" is 5. 
// The last letter X is going beyond the Z, so we replaced that with Z.

// Solution:
// import java.io.*;
// import java.util.*;
// public class Main
// {
//     public String modifiedSentence(String input1)
//     {
//         //Read only region end
//         String s="";
//         String[] lst = input1.split(" ");
//         int k = 0;
//         for(String i : lst)
//         {
//             int n = i.length();
//             for(char j : i.toCharArray())
//             {
//                 if(j>=65 && j<=90)
//                 {
//                     if(((int)(j)+n)>90)
//                         s+='Z';
//                     else
//                         s+=(char)((int)j + n);
//                 }
//                 else if(j>=97 && j<=122)
//                 {
//                     if(((int)(j)+n)>122)
//                         s+='z';
//                     else
//                         s+=(char)((int)j + n);
//                 }
//             }
//             if(k<lst.length-1)
//             {
//                 s+=" ";
//                 k++;
//             }
//         }
//         return s;
//     }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Main m = new Main();
// 		String input1 = sc.nextLine();
// 		System.out.println(m.modifiedSentence(input1));
// 	}
// }
}

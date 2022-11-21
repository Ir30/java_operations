import java.util.Scanner;

class javaOperations{

    static int largest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
        return c;
        }
    }

    static int smallest(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<c){
            return b;
        }
        else{
        return c;
        }
    }

    static void prime(int n){
        boolean flag =true;
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Note Prime");
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Prime");
        }
    }

    static void check_even(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");

        }
    }

    static int rev(int n){
        String s = String.valueOf(n);
        String reversedStr = "";

        for (int i = 0; i < s.length(); i++) {
            reversedStr = s.charAt(i) + reversedStr;
            }
        return Integer.parseInt(reversedStr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the choice: ");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1.largest of three numbers");
        System.out.println("2.smallest of three numbers");
        System.out.println("3.check prime or not");
        System.out.println("4.check even or not");
        System.out.println("5.Reverse of a number");
        System.out.println("6.Exit");
        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        int choice = sc.nextInt();

        
        switch(choice){
            case 1:{
                System.out.println("enter three numbers: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
                System.out.println("largest is:"+largest(n1,n2,n3));
            }
            case 2:{
                System.out.println("enter three numbers: ");
                int n3 = sc.nextInt();
                int n4 = sc.nextInt();
                int n5 = sc.nextInt();
                System.out.println("smallest is:"+smallest(n3,n4,n5));
            }
            case 3:{
                System.out.println("enter the number: ");
                int p = sc.nextInt();
                prime(p);
            }

            case 4:{
                System.out.println("enter the number: ");
                int p = sc.nextInt();
                check_even(p);
            }

            case 5:{
                System.out.println("enter the number: ");
                int p = sc.nextInt();
                System.out.println(rev(p));
            }

            case 6:{
                break;
            }
        }

    
    }
}
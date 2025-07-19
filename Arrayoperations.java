import java.util.Scanner;
class Arrayoperations
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
        System.out.println("enter the array Size");
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements for a");
		
        for(int i=0;i<size;i++)
          {
             a[i]=s.nextInt();
          }
		menu(a,size);
	}
	    static void menu(int []a,int size)
	    {
				
		System.out.println("1.Traversing");
		System.out.println("2.insertion");
		System.out.println("3.deletion");
		System.out.println("4.searching");
		System.out.println("5.sorting");
		System.out.println("6.merging");
		System.out.println("7.exit");
		System.out.println("choose your choice");

		Arrayoperations arr=new Arrayoperations();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			  arr.Traversing(a,size);
			  menu(a,size);
		      break;
			case 2:
				arr.insertion(a,size);
			    menu(a,size);
			    break;
			case 3:
				arr.deletion(a,size);
			    menu(a,size);
			    break;
			case 4:
				arr.searching(a,size);
				menu(a,size);
			    break;
			case 5:
				arr.sorting(a,size);
				menu(a,size);
			    break;
			case 6:
				arr.merging(a,size);
			    menu(a,size);
			    break;
			case 7:
				
				System.exit(0);
				break;
			default :
				System.out.print("choose valid option");
				System.exit(0);
				break;
	}
	}
	public void Traversing(int []a,int size)
	{
        for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void insertion(int []a,int size)
	{
		
		Scanner scn =new Scanner(System.in);
		int b[]=new int[size+1];
		System.out.println("enter the position to be added ");
		int pos=scn.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i<pos)
			{
			b[i]=a[i];
			}
		    else if(i>=pos)
			{
				b[i+1]=a[i];
			}
			else
			{
				break;
			}
		}
		System.out.println("enter the value");
		int value=scn.nextInt();
		b[pos]=value;
		
        for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public void deletion(int []a,int size)
	{
		Scanner sc =new Scanner(System.in);
		int b[]=new int[size-1];
		System.out.println("the existing elements are");
		 for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter the index piosition to be ");
		int c=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
		if(i<c)
		{
		b[i]=a[i];
		}
		else if(i==c)
		{
		continue;
		}
		else 
		{
		b[i-1]=a[i];
		}
		}
		 for(int i=0;i<b.length;i++)                  
		{
			System.out.println(b[i]);
		}
		
		}
		public void searching(int[]a,int size)
		{
		Scanner scaa =new Scanner(System.in);
		int count=0;
		System.out.println("the existing elements are");
		 for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter element to be searched");
		int ele=scaa.nextInt();
		for(int i=0;i<a.length;i++)
			{

			if(a[i]==ele)
				{
				System.out.println("element is found "+i+" position");
				return;
				}
				
			}
			System.out.println("element is not found");
			
			
       }
	   public void sorting(int[]a,int size)
	   {
		Scanner s =new Scanner(System.in);
		System.out.println("the existing elements are");
		int b[]=new int[size-1];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("array after sorting");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	   }
	   public void merging(int[]a,int size)
	{
		   
		Scanner scn =new Scanner(System.in);
		 System.out.println("the existing elements are");
		 for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		 System.out.println("enter the array2 Size");
		 int s=scn.nextInt();
		 int b[]=new int[s];
		 int c[]=new int[size+s];
		System.out.println("enter the elements for b");          
        for(int i=0;i<s;i++)
          {
             b[i]=scn.nextInt();
          }
		  for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("merging is completed the elements are:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}
}
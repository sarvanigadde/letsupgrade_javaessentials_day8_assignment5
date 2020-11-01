class Student 
{
 int idNum; 
 String name; 
} 
class College
{
 public static void main(String[] args)
 { 
  Student[] st = {new Student(), new Student()}; 
  System.out.println("Initialized values of array:"); 
 for(int i=0; i < st.length; i++)
{
 System.out.print(st[i]+"\t"); 
 } 
 st[0].idNum = 9876;
 st[0].name = "bhuvana"; 
 st[1].idNum = 1234;
 st[1].name = "sravani"; 
 System.out.println("\n\nStudent details:"); 
 for (int i=0; i < st.length; i++) 
{
 System.out.println("Student" + (i+1) +" idNumber: "+st[i].idNum); 
 System.out.println("Student"+(i+1)+" name: "+st[i].name); 
}
 }
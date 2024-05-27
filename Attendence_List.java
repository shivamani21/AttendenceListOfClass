import java.io.*;
import java.util.*;
class Attendence_List{
    //Store data in a file
    public static void storeFile(int total, int Ab, int Pr, int Progress, String branch, char section, String Date){

        try{
            FileWriter in = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\AttendeceList.txt",true);
            
            in.write("------------------------------------------------");
		in.append("\nDATE  			   : " + Date);
            in.append("\nBRANCH                     : " + branch);
            in.append("\nSECTION                    : " + section);
            in.append("\nTOTAL CLASS STRENGTH IS    : " + total);
            in.append("\nTOTAL ABSENTIES            : " + Ab);
            in.append("\nTOTAL PRESENTIES           : " + Pr);
            in.append("\nTOTAL STUDENTS IN PROGRESS : " + Progress);
		in.append("\n");
            in.write("------------------------------------------------");
            in.append("\n\n");
            in.close();
            System.out.println("Data was Stored in the record");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
          int i,j,Temp1=0,Temp2=0,Temp3=0,Temp4=0,Temp5=0,Temp6=0;
          int total=0;
          int progress=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("\nENTER BRANCH NAME - ");
     String branch=sc.nextLine();
     System.out.println("ENTER SECTION - ");
     char section=sc.next().charAt(0);
     System.out.println("ENTER DATE(DATE/MONTH/YEAR): ");
      int day=sc.nextInt();
	int month=sc.nextInt();
	int year=sc.nextInt();
	String Date = day + "/" + month + "/" + year;
     System.out.println("\nNOW PROCEED THE ATTENDENCE OF " + branch +"-" + section + ":" + "\n");
     System.out.println("ENTER RANGE OF REG STUDENTS IN "+ branch +"-" + section + " CLASS");
     int size1=sc.nextInt();
     total+=size1;
     char arr1[] = new char[size1];
     char ch1='A';
     char ch11='a';
     char ch2='P';
     char ch22='p';
     int Absenties=0,Presenties=0;
     System.out.println("\nPLEASE ENTER ATTENDENCE OF REG STUDENTS OF " + branch +"-" + section + ":\nIF STUDENT IS PRESENT GIVE 'P' , IF STUDENT IS ABSENT GIVE 'A' , IF STUDENT IS IN-PROGRESS GIVE ANY SYMBOL.....!! ");
     System.out.println();
     for(i=0;i<size1;i++){
         System.out.print("Roll.No: "+(i+1)+"->");
         arr1[i]=sc.next().charAt(0);
     }
      for(i=0;i<size1;i++){
        if(arr1[i]==ch1 || arr1[i]==ch11){
            Absenties++;
        }
        else if(arr1[i]==ch2 || arr1[i]==ch22){
            Presenties++;
        }
        else
        {
            System.out.println("In progress--> Roll.No"+(i+1));
            progress++;
        }
     }
     System.out.println("\nTotal Absenties of REG STUDENTS: "+Absenties);
     System.out.println("Total Presenties of REG STUDENTS: "+Presenties);
     Temp1=Absenties;
     Temp2=Presenties;
     Absenties=0;
     Presenties=0;
     System.out.println();
     System.out.println("IF ANY LATERAL-ENTRY(LE) STUDENTS ARE THERE(Y/N):");
     char ch3='Y';
     char ch33='y';
     char str1=sc.next().charAt(0);
     if(str1==ch3 || str1==ch33){
          System.out.println("ENTER RANGE OF LATERAL-ENTRY(LE) STUDENTS:");
         int size2=sc.nextInt();
         total+=size2;
         char arr2[]=new char[size2];
	   System.out.println("\nIF STUDENT IS PRESENT GIVE 'P' , IF STUDENT IS ABSENT GIVE 'A' , IF STUDENT IS IN-PROGRESS GIVE ANY SYMBOL.....!!\n");
         for(i=0;i<size2;i++){
              System.out.print("LATERAL-ENTRY(LE) "+(i+1)+"->");
         arr2[i]=sc.next().charAt(0);
         }
           for(i=0;i<size2;i++){
        if(arr2[i]==ch1 || arr2[i]==ch11){
            Absenties++;
        }
        else if(arr2[i]==ch2 || arr2[i]==ch22){
            Presenties++;
        }
        else
        {
            System.out.println("In progress--> LE "+(i+1));
            progress++;
        }
     }
       System.out.println("\nTotal LATERAL-ENTRY(LE) Absenties: "+Absenties);
     System.out.println("Total LATERAL-ENTRY(LE) Presenties: "+Presenties +"\n");
     }
     else
     {
         System.out.println("\nMIGHT BE LATERAL-ENTRY(LE) STUDENTS ARE NOT THEIR!!\n");
         System.out.println();
         System.out.println();
     }
     Temp3=Absenties;
     Temp4=Presenties;
     Absenties=0;
     Presenties=0;
      System.out.println("IF ANY TRANSFOR STUDENTS ARE THERE(Y/N):");
      char str2=sc.next().charAt(0);
     if(str2==ch3 || str2==ch33){
           System.out.println("ENTER RANGE OF TRANSFOR STUDENTS:");
         int size3=sc.nextInt();
         total+=size3;
         char arr3[]=new char[size3];
	   System.out.println("\nIF STUDENT IS PRESENT GIVE 'P' , IF STUDENT IS ABSENT GIVE 'A' , IF STUDENT IS IN-PROGRESS GIVE ANY SYMBOL.....!! ");
         for(i=0;i<size3;i++){
              System.out.print("TRANSFOR STUDENT "+(i+1)+"->");
         arr3[i]=sc.next().charAt(0);
         }
         for(i=0;i<size3;i++){
        if(arr3[i]==ch1 || arr3[i]==ch11){
            Absenties++;
        }
        else if(arr3[i]==ch2 || arr3[i]==ch22){
            Presenties++;
        }
        else
        {
            System.out.println("In progress--> TRANSFORM STUDENT "+(i+1));
            progress++;
        }
     }
     System.out.println("\nTotal Absenties of TRANSFOR STUDENT: "+Absenties);
     System.out.println("Total Presenties of TRANSFOR STUDENT: "+Presenties +"\n");
     Temp5=Absenties;
     Temp6=Presenties;
   }
    else
     {
         System.out.println("\nMIGHT BE TRANSFOR STUDENTS ARE NOT THEIR!!\n");
     }
   int Ab=Temp1 + Temp3 + Temp5;
   int Pr=Temp2 + Temp4 + Temp6;

     System.out.println("------------------------------------------------");
     System.out.println("TOTAL CLASS STRENGTH IS:"+total);
     System.out.println("TOTAL ABSENTIES: "+Ab);
     System.out.println("TOTAL PRESENTIES: "+Pr);
     System.out.println("TOTAL STUDENTS IN PROGRESS:"+progress);
     System.out.println("------------------------------------------------");

     //Calling store file method
     storeFile(total, Ab, Pr, progress, branch, section, Date);
     
}
}

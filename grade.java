
/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade. */

public class grade{
    public static void main(String[] args)
{
    int m=100;
    if (m < 25)
    {
        System.out.println("The grade is F:");
        }
    else if(m<45){
        System.out.println("The grade is E:");
    }
    else if(m<50){
        System.out.println("The grade is D:");
    }
    else if(m<60)
    {
        System.out.println("The grade is C:");
    }
     else if(m<80)
    {
        System.out.println("The grade is B:");
    }
    else 
    {
        System.out.println("The grade is A:");
    }
    
}
}
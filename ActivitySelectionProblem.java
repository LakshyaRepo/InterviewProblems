/*problem Statement */
/* You are given n activities with their start and finish times. 
Select the maximum number of activities that can be performed by a single person, 
assuming that a person can only work on a single activity at a time. 
Example 1 : Consider the following 3 activities sorted by
by finish time.
     start[]  =  {10, 12, 20};
     finish[] =  {20, 25, 30};
A person can perform at most two activities. The 
maximum set of activities that can be executed 
is {0, 2} [ These are indexes in start[] and 
finish[] ]

Example 2 : Consider the following 6 activities 
sorted by by finish time.
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
A person can perform at most four activities. The 
maximum set of activities that can be executed 
is {0, 1, 3, 4} [ These are indexes in start[] and 
finish[] ]

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lakshya
 */
 
class Activity{
    int start;
    int end;
    public Activity(int start ,int end){
        this.start=start;
        this.end=end;
    }
}
public class ActivitySelectionProblem {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Activity You want to Organize");
        int n=sc.nextInt();
        Activity[] activity=new Activity[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th start time");
            int start=sc.nextInt();
            System.out.println("Enter "+(i+1)+"th End Time");
            int end=sc.nextInt();
            activity[i]=new Activity(start, end);
            
        }
        System.out.println("Details You have Entered");
          for(int i=0;i<n;i++){
            System.out.println((i+1)+"th start time is "+activity[i].start);
            
            System.out.println((i+1)+"th End time time is "+activity[i].end);
           
            
        }
        //anonymous class that implements Comparator interface
        Arrays.sort(activity ,new Comparator<Activity>(){
            
            
           public int compare(Activity one ,Activity two){
               
               Integer x=one.end;
               Integer y=two.end;
               return x.compareTo(y);//sort ascending order
               
           }    
            
            
        });
        System.out.println("After Sorting Your Details are");
                  for(int i=0;i<n;i++){
            System.out.println((i+1)+"th start time is "+activity[i].start);
            
            System.out.println((i+1)+"th End time time is "+activity[i].end);
           
            
        }
       //Logic Part After Sorting we have to perform First Activity anyhow because it is a shortest activity right??
                  
          System.out.println("Activities Order which is must");
          System.out.println(activity[0].start+"  "+activity[0].end);
          int i=0;
          int j=1;//comparing first activity's end time with second activity's start time
          while(j<activity.length){
              if(activity[j].start >= activity[i].end){
                 
                  System.out.println(activity[j].start+"  "+activity[j].end);
                  i++;j++;
          }
              j++;
       }
   }
}

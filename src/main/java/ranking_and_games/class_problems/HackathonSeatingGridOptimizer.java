import java.util.Scanner;
public class HackathonSeatingGridOptimizer {
 private static double rowAverage(int[] row){if(row.length==0)return 0.0;int sum=0;for(int score:row)sum+=score;return (double)sum/row.length;}
 static String classifyRows(int[][] seatingScores,int threshold){StringBuilder result=new StringBuilder();for(int i=0;i<seatingScores.length;i++){double average=rowAverage(seatingScores[i]);if(i>0)result.append(" | ");result.append("Row ").append(i).append(": ").append(average<threshold?"Quiet Zone":"Buzzing Zone");}return result.toString();}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int rows=sc.nextInt();int[][] scores=new int[rows][];for(int i=0;i<rows;i++){int columns=sc.nextInt();scores[i]=new int[columns];for(int j=0;j<columns;j++)scores[i][j]=sc.nextInt();}int threshold=sc.nextInt();System.out.println(classifyRows(scores,threshold));sc.close();}
}
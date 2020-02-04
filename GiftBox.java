package EPAM.NewYearsgift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
class Chocolate{
	public String name;
	public int cost;
	Chocolate(String name){
		this.name=name;
	}
	Chocolate(String name,int cost){
		this.name=name;
		this.cost=cost;
	}
	  public static Comparator<Chocolate> ChocolateComparator = new Comparator<Chocolate>() {

			public int compare(Chocolate c1, Chocolate c2) {
			   int  chocolate1cost = c1.getCost();
			   int  chocolate2cost = c2.getCost();
			   
			   //ascending order
			   return chocolate1cost-(chocolate2cost);
		    }};
	
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
	
	
}
class MilkChocolate extends Chocolate{
	MilkChocolate(String name){
		super(name);
	}
	MilkChocolate(String name,int cost){
		super(name,cost);
	}
	protected int sugarQuantity;
	protected int cost;
	protected void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity=sugarQuantity;
	}
	protected int getSugarQuantity() {
		return sugarQuantity;
	}
	protected void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost(){
		return cost;
		
	}
	
}
class DarkChocolate extends Chocolate{
	DarkChocolate(String name) {
		super(name);
	}
	DarkChocolate(String name,int cost){
		super(name,cost);
	}
	protected int sugarQuantity;
	protected int cost;
	protected void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity=sugarQuantity;
	}
	protected int getSugarQuantity() {
		return sugarQuantity;
	}
	protected void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost(){
		return cost;
		
	}
	
}

public class GiftBox extends Chocolate
{	GiftBox(String name) {
		super(name);
	}

static ArrayList<Chocolate> ChocolateSet=new ArrayList<Chocolate>();
	public static int totalChocolates(){
		return ChocolateSet.size();
	}
	public static ArrayList<String> varietiesInRange(int start,int end){
		ArrayList<String> res=new ArrayList<String>();
		for(Chocolate ch:ChocolateSet) {
			if(ch.getCost()>start&& ch.getCost()<end) {
				res.add(ch.getName());
			}
		}
		return res;
		
	}
	
    public static void main( String[] args )
    {
    	
        DarkChocolate dc1=new DarkChocolate("oreo");
        DarkChocolate dc2=new DarkChocolate("ecer");
        DarkChocolate dc3=new DarkChocolate("xxx");
        DarkChocolate dc4=new DarkChocolate("yyy");
        DarkChocolate dc5=new DarkChocolate("zzz");
        MilkChocolate ml1=new MilkChocolate("abc");
        MilkChocolate ml2=new MilkChocolate("abc");
        MilkChocolate ml3=new MilkChocolate("def");
        dc1.setSugarQuantity(100);
        dc1.setCost(15);
        dc2.setCost(55);
        dc3.setCost(33);
        dc4.setCost(22);
        dc5.setCost(35);
        ml1.setCost(26);
        ml2.setCost(21);
        ml3.setCost(22);
        ChocolateSet.add(dc1);
        ChocolateSet.add(dc2);
        ChocolateSet.add(dc3);
        ChocolateSet.add(dc4);
        ChocolateSet.add(dc5);
        ChocolateSet.add(ml1);
        ChocolateSet.add(ml2);
        ChocolateSet.add(ml3);
        System.out.println(totalChocolates());
        Collections.sort(ChocolateSet,ChocolateComparator);
        //System.out.print(ChocolateSet);
        Scanner sc=new Scanner(System.in);
        int startRange=sc.nextInt();
        int endRange=sc.nextInt();
        System.out.println(varietiesInRange(startRange,endRange));  
        
        
    }
}

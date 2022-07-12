import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.*;

public class Stream {

	public static void main(String[] args) {
		
		 HashSet<StreamOne> f = new HashSet<>();

		 f.add(new StreamOne("Jackfruit",200,"green",300));
		 f.add(new StreamOne("Apple",80,"red",200));
		 f.add(new StreamOne("Grapes",130,"brown",90));
		 f.add(new StreamOne("Banana",180,"yellow",60));
		 f.add(new StreamOne("Pineapple",180,"yellow",90));
		 
		 HashSet<StreamTwo> n = new HashSet<>();
		 n.add(new StreamTwo(123,"The Suheldev Bharatiya Samaj Party, which has kept its ally Samajwadi Party,"
			 		+ " opposition and the ruling party camps guessing on whom it will vote for in the presidential election,","Nothing to say","worry not",5670));
		
		 
		 List<StreamOne> list = (List<StreamOne>)f.stream().filter(c -> c.getCallories()<100).collect(Collectors.toList()); 
			        
			        for(StreamOne f1 : list){
			            System.out.println(f1);
			        }
			        
        System.out.println(" Question 1 \n");
			        
        List<StreamOne> color = f.stream()
                .sorted(Comparator.comparing(
                       StreamOne::getColor)) 
                .collect(Collectors.toList()); 
    	        
    	        for(StreamOne e : color){
    	            System.out.println(e);
    	        }
        System.out.println("Question 2 \n");
    	        
        List<StreamOne> list2 = (List<StreamOne>)f.stream().filter(c1 -> c1.getColor()=="red").sorted(Comparator.comparing(
                StreamOne::getPrice)).collect(Collectors.toList()); 
        
        for(StreamOne f2 : list2){
            System.out.println(f2);
        }
        System.out.println("Question 3 \n");
        
        List<StreamTwo> list3 = (List<StreamTwo>) n.stream().sorted(Comparator.comparingInt(
                StreamTwo::getCommentsCount)).collect(Collectors.toList()); 
      
            System.out.println("The id : "+list3.get(list3.size()-1).getNewsId());
            System.out.println(list3.get(list3.size()-1));
            
            System.out.println("Question 4 \n");
            
            for(StreamTwo n2 : list3){
                System.out.println(n2.getUserPost());
            }
            System.out.println("Question 5 \n");
            for(StreamTwo n2 : list3){
                System.out.println(n2.getUserComment());
            }
            System.out.println("Question 6 \n");
            
            HashSet<StreamThree> trader = new HashSet<>();
            trader.add(new StreamThree("Nidhi","Noida"));
            trader.add(new StreamThree("Vishnu","Chennai"));
            trader.add(new StreamThree("Meera","MP"));
            trader.add(new StreamThree("Dheeraj","AP"));
            trader.add(new StreamThree("Krishna","Banglore"));
            
            HashSet<StreamFour> trans = new HashSet<>();
            trans.add(new StreamFour(new StreamThree("Kiran","Delhi"),2011,1545));
            trans.add(new StreamFour(new StreamThree("Madhu","Indore"),2010,4834));
            trans.add(new StreamFour(new StreamThree("Divya","Pune"),2012,12093));
            trans.add(new StreamFour(new StreamThree("Kanjan","Mumbai"),2013,12903));
            trans.add(new StreamFour(new StreamThree("Liya","Banglore"),2014,12123));
            trans.add(new StreamFour(new StreamThree("Amir","Pune"),2016,12873));
            trans.add(new StreamFour(new StreamThree("Tanweer","Indore"),2021,17623));
            
            List<StreamFour> transd =(List <StreamFour>) trans.stream().filter(c -> c.getYear()==2011).collect(Collectors.toList()); //collector
	        
	        for(StreamFour t1 : transd){
	            System.out.println(t1.getValue());
	        }
            
	        System.out.println("Question 7 \n");
            
            
	        for(StreamFour t1 : transd){
	            System.out.println(t1);
	        }
	        System.out.println("Question 8 \n");
	                   
	        List<StreamThree> traderss =(List <StreamThree>) trader.stream().distinct().collect(Collectors.toList());
	        for(StreamThree trd : traderss){
	            System.out.println(trd.getCity());
	        }
	            System.out.println("Question 9 \n");
	            
	            
	            List<StreamThree> tradeind =(List <StreamThree>) trader.stream().filter(c1 -> c1.getCity()=="Indore").collect(Collectors.toList()); 
	            for(StreamThree trd1 : tradeind){
		            System.out.println(trd1);
		            }
	            System.out.println("Question 10 \n");

	            List<StreamThree> tradep =(List <StreamThree>) trader.stream().filter(c1 -> c1.getCity()=="Pune").collect(Collectors.toList()); 
	            for(StreamThree trdp : tradep){
		            System.out.println(trdp);
		            }
	            System.out.println("Question 11 \n");
	            List<StreamThree> tradersort =(List <StreamThree>) trader.stream().sorted(Comparator.comparing(
	            		StreamThree::getName)).collect(Collectors.toList()); 
	            for(StreamThree trdp : tradersort){
		            System.out.println(trdp);
		            }
	            System.out.println("Question 12 \n");
	            
	            List<StreamFour> transort = trans.stream().sorted(Comparator.comparing(
	            		StreamFour::getValue)).collect(Collectors.toList()); 
	            for(StreamFour trs : transort){
		            System.out.println(trs);
		            }
	            System.out.println(transort.get(transort.size()-1).getValue());
	            System.out.println("Question 13 \n");
	            System.out.println(transort.get(0));
	            System.out.println(transort.get(0).getValue());
	            
	            System.out.println("Question 14 \n");

	}
}
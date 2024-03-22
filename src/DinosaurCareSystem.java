import java.util.*;
public class DinosaurCareSystem extends Dinosaur{

    public static void main(String[] args){
        List<Dinosaur> dinosaurList = new ArrayList<>();

       //ILL DINOSAUR NAME
        dinosaurList.add(new Dinosaur("emy","a",true));
        dinosaurList.add(new Dinosaur("ema","b",false));
        dinosaurList.add(new Dinosaur("kelly","a",true));


        dinosaurList.stream().filter(r -> r.isILL().equals(true)).forEach(t->System.out.println("ILL DINOSAUR NAME ---> "+t.getName()));
        // Feeding time for each dinosaur
        List<Dinosaur> dinosaurList1 = new ArrayList<>();

        dinosaurList1.add(new Dinosaur("emy","a",true,"noon"));
        dinosaurList1.add(new Dinosaur("ema","b",false,"morning"));
        dinosaurList1.add(new Dinosaur("kelly","c",true,"morning"));
        dinosaurList1.add(new Dinosaur("kell","d",true,"night"));


        dinosaurList1.stream()
                .map(dinosaur -> "Feeding time for " + dinosaur.getName()+" --->  " + dinosaur.getFeedingTime())
                .forEach(System.out::println);


        ///Convert the array to an IntStream and calculate the sum

        List<Dinosaur> dinosaurList2 = new ArrayList<>();
        dinosaurList2.add(new Dinosaur("emy",10.5));
        dinosaurList2.add(new Dinosaur("ema",20.5));
        dinosaurList2.add(new Dinosaur("kelly",30.3));
        dinosaurList2.add(new Dinosaur("kell",40));
        double [] weight = new double[dinosaurList2.size()];
        int i=0;
        for(Dinosaur x : dinosaurList2 ){
            weight[i] = x.getWeight();
            i++;
        }
        double totalWeight = Arrays.stream(weight)
                .sum();

        System.out.println("Total weight of all dinosaurs: " + totalWeight + " kg");


        //If a dinosaur with the provided name doesn’t exist, Optional should return a message indicating the dinosaur
        // hasn’t been found.
        Map<String, Dinosaur> dinosaurMap = new HashMap<>();
        dinosaurMap.put("EMY_DINOSAUR", new Dinosaur("emy","a",true));
        dinosaurMap.put("EMA_DINOSAUR", new Dinosaur("ema","b",true));
        dinosaurMap.put("KELLY_DINOSAUR", new Dinosaur("kelly","c",true));

        String targetDinosaurName = "PRO_DINOSAUR";//check whether this present or not
        //String targetDinosaurName = "EMA_DINOSAUR";
        Optional<Dinosaur> optionalDinosaur = Optional.ofNullable(dinosaurMap.get(targetDinosaurName));

        String message = optionalDinosaur
                .map(dinosaur -> "Found dinosaur: " + dinosaur.getName())
                .orElse("Dinosaur not found for name: " + targetDinosaurName);

        System.out.println(message);

        //Convert a list of dinosaur weights into a parallel stream and use the average method to calculate the average
        // weight.
        List<Dinosaur> dinosaurList3 = new ArrayList<>();
        dinosaurList3.add(new Dinosaur("emy",10.5));
        dinosaurList3.add(new Dinosaur("ema",40));
        dinosaurList3.add(new Dinosaur("kelly",30.5));
        dinosaurList3.add(new Dinosaur("kell",20));

        List<Double> dinosaurWeight=new ArrayList<>(dinosaurList3.size());
        for(Dinosaur x : dinosaurList3 ){
            dinosaurWeight.add( x.getWeight());
        }
        //We use parallelStream() to create a parallel stream from the list of weights.
        //The mapToDouble(Double::doubleValue) operation converts each weight to a primitive double.
        double averageWeight = dinosaurWeight.parallelStream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0); // Default value if the list is empty

        System.out.println("Average weight of dinosaurs: " + averageWeight + " kg");

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {

	public static void main(String[] args) {
//		List<String> emplist=Arrays.asList("Anu","Anju","Zoe", "Elfy");
//		String s1=emplist.stream().collect(Collectors.joining(":"));
//		System.out.println(s1);
//		
//		
//	//	Integer[] empIds = { 1, 2, 3, 4,5,6 };
//		List<Integer> empIds= Arrays.asList(1, 2, 3, 4,5,6 );
//		Optional<Integer> i=empIds.stream().min(Integer::compare);
//		System.out.println(i.get());
		
//		Function<Integer,Integer> ft=t-> t*2;
//		System.out.println(ft.apply(10));
//		Function<Integer,String> ft1=t-> t.toString();
//		System.out.println(ft1.apply(20));
		
		List<String> list=Arrays.asList("Python","perl","Linux","OS");
		String s=list.stream()
				.reduce("aaaa",(x,y)->x+y);
        System.out.println(s);
        s=list.stream().reduce("",(x,y)->x+y.substring(0, 2));
        System.out.println(s);
        List<Integer> intlist=Arrays.asList(12,34,2,4,5,17,20,3);
        Optional<Integer> result=intlist.stream().reduce((x,y)->x<y?x:y);
        if(result.isPresent()) {
        	System.out.println("Result" + result.get());
        }
        else {
        	System.out.println("not found");
        }
        System.out.println(result.orElse(10));
        Integer[] intarr= {1,2,3,4};
        Stream<Integer> st=Stream.of(intarr);
        //intlist.addAll(Stream.of(intarr).map(x->x*x).collect(Collectors.toList()));
        	intlist.addAll(st.map(x->x*x).collect(Collectors.toList()));
	}
 
}

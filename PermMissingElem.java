import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class PermMissingElem{
	public static void main(String[] args){
		int[] a = new int[]{2, 3, 1, 5};
		System.out.println(permMissingElem(a));
	}
	
	private static int permMissingElem(int[] a){
		if(a.length == 0) return 1;
		if(a.length == 1 && a[0] == 1)
			return 2;
		else if(a.length == 1 && a[0] == 2)
			return 1;
		TreeSet<Integer> treeSet = new TreeSet<>(toList(a));
		Integer prev = null;
		for(Integer i: treeSet){
			if(prev != null
				&& (i.intValue() - prev.intValue() > 1))
					return prev + 1;
			prev = i;
		}
		if(a[0] == 1)
			return a[a.length -1] + 1;
		else
			return 1;
	}
	
	private static List<Integer> toList(int[] a){
		List<Integer> l = new ArrayList<>();
		for(int n: a) l.add(n);
		return l;
	}
}
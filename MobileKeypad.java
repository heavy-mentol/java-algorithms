import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class MobileKeypad{
	public static void main(String args[]){
		Map<Integer, List<Integer>> combinationMap = getPossibleCombinations();
		if(validateArgs(args)){
			int nCombinations = Integer.parseInt(args[0]);
			if(nCombinations == 1){
				System.out.println(10);
				return;
			}else{
				for(Integer rootKey : combinationMap.keySet()){
					
				}
			}
			return;
		}
		throw new IllegalArgumentException("Invalid argument!");
	}
	
	private static Map<Integer, List<Integer>> getPossibleCombinations(){
		Map<Integer, List<Integer>> combinationMap = new HashMap<>();
		combinationMap.put(0, toList(new int[]{8}));
		combinationMap.put(1, toList(new int[]{2, 4}));
		combinationMap.put(2, toList(new int[]{1, 3, 5}));
		combinationMap.put(3, toList(new int[]{2, 6}));
		combinationMap.put(4, toList(new int[]{1, 5, 7}));
		combinationMap.put(5, toList(new int[]{2, 4, 6, 8}));
		combinationMap.put(6, toList(new int[]{3, 5, 9}));
		combinationMap.put(7, toList(new int[]{4, 8}));
		combinationMap.put(8, toList(new int[]{5, 7, 9, 0}));
		combinationMap.put(9, toList(new int[]{6, 8}));
		
		return combinationMap;
	}
	
	private static boolean validateArgs(String args[]){
		if(args.length == 1){
			try{
				Integer n = Integer.parseInt(args[0]);
				return n.compareTo(0) >= 0;
			}catch(NumberFormatException nfe){
				return false;
			}
		}
		return false;
	}
	
	private static List<Integer> toList(int[] a){
		List<Integer> l = new ArrayList<>();
		for(int i: a){
			l.add(Integer.valueOf(i));
		}
		return l;
	}
}
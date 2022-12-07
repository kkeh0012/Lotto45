import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class LottoNumber {
	public LottoNumber() {
		//중복되지 않는 정수(1~45사이) 6개를 원소로 가지는 집합 만들기
		Set<Integer> lotto =new HashSet<>();
		Random random = new Random();
		while(lotto.size()<6) {
			int number =random.nextInt(45) +1;
			lotto.add(number);
		}  
		
		//보너스 숫자 만들기
		Set<Integer> bouns =new HashSet<>();
		
		while(bouns.size()<1) {
			int number =random.nextInt(45) +1;
			if(!lotto.contains(number) )
			bouns.add(number);
		}  
		lotto.addAll(bouns);
		
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);//Collection을 가지는 모든것은 생산자에서 전달 가능
		
		Collections.sort(list);//리스트 정렬
		System.out.println(list);
		

		}
	}
	


public class Random1 {
	public static void main(String[] args) {
		new LottoNumber();
	
		
	
}
	}

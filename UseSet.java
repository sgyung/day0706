package day0706;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class UseSet {

	public void useHashSet() {
		// 1. 생성 )
		Set<String> set = new HashSet<String>();
		// 2. 값 추가 ) - 값은 순차적으로 입력되지 않는다.
		set.add("홍희진");
		set.add("홍찬영");
		set.add("홍지성");
		set.add("차준식");
		set.add("정민교");
		set.add("장용석");
		
		// 중복값은 입력되지 않는다.
		set.add("차준식");
		set.add("차준식");
		
		// 배열로 복사
		// 1. set의 크기로 배열을 생성
		String[] nameArr = new String[set.size()];
		// 2.복사
		set.toArray(nameArr);
		
		// 값 얻기 : Iterator사용.
		// 1. Iterator제어권 넘겨주기
		Iterator<String> ita = set.iterator();
		// 2. element가 존재한다면 
		while( ita.hasNext() ) {
			System.out.println(ita.next());// 값을 얻고 다음 element로 이동
		}
		
		// 값 삭제 )
		// 특정 방의 값을 삭제
		set.remove("홍찬영");
		set.remove("홍희진");
		// 모든 방의 값을 삭제
		set.clear();
		
		System.out.println(set + " / " + set.size());
		
		// 배열의 복사된 값을 기존의 for loop를 사용하여 출력
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
	}	
		// 업무 : set을 사용하여 로또 번호를 구하고, 배열로 반환
		public Integer[] lottoProcess() {
		Random ran = new Random();
		Integer[] lottoArr = new Integer[6];// 로또번호를 저장할 배열
		Set<Integer> set = new HashSet<Integer>();// 중복값을 제거할 자료구조
		
		while(set.size() < 6) {// 발생되어 set에 추가된 값이 6개라면 반복문을 빠져나감
			set.add(ran.nextInt(45)+1);
		}
		set.toArray(lottoArr);// 발생된 번호를 배열로 복사
		return lottoArr;
		}
		
		// 업무 사용 : 로또번호 출력
		public void printLottoNum() {
			for(int value : lottoProcess()) {
				System.out.printf("%-4d", value);
			}
		}

	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		us.useHashSet();
		System.out.println("================================");
		us.printLottoNum();
	}

}

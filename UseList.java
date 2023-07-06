package day0706;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UseList {

	/**
	 * JDK1.1에서 부터 지원하는 모든 객체를 저장할 수 있는 문법
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void useNonGeneric() {
		// 1. 생성
		List list = new ArrayList();
		// 2. 값 할당
		list.add(Integer.valueOf(7));// Integer
		list.add(Integer.valueOf(6));
//		list.add("안녕하세요");// String
//		list.add(Boolean.valueOf(true));// Boolean
		// 3. 값 사용
		for (int i = 0; i < list.size(); i++) {
			// 꺼내서 사용할 때 에러가 발생할 수 있다.
			//System.out.println((Integer)list.get(i)*2);
			System.out.println(list.get(i));
		}
		 
	}
	
	public void useArrayList() {
		// 1. 생성 : Generic 사용
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.isEmpty());
		// 2. 값 할당
		list.add(2023);// autoboxing : Integer.valueOf(정수)
		Integer ii = Integer.valueOf(7);
		list.add(ii);
		list.add(Integer.valueOf(6));
		list.add(Integer.parseInt("12"));
		// Generic이 사용되면 선언된 데이터 형으로만 값이 입력된다.
		//list.add("39");
		list.add(40);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
		
		// 3. 값 얻기 : unboxing
		int i = list.get(0);
		System.out.println(i);
		i = list.get(1);
		System.out.println(i);
		
		// 일괄 처리
		for(int j = 0; j < list.size(); j++) {
			System.out.printf("list.get(%d) = %d\n",j,list.get(j));
		}
		
		// 배열로 복사
		// 1. 리스트의 크기로 배열을 생성
		Integer[] arr = new Integer[list.size()];
		
		// 2. 리스트에서 제공하는 복사 method 사용
		list.toArray(arr);
		
		// 리스트 방의 값 삭제) 방의 크기가 줄어든다.
		list.remove(2);
		list.remove(2);
		
		
		System.out.println(list + " / " + list.size() + "개");
	
		// arr배열의 값을 개선된 for로 출력
		for(Integer value : list) {
			System.out.print(value.intValue() + " ");
		}
		
		System.out.println();
		
		// 리스트는 중복값을 저장할 수 있다.
		List<String> nameList = new ArrayList<String>();
		nameList.add("강다연");// 0
		nameList.add("김다영");// 1
 		nameList.add("김선경");// 2
		nameList.add("김인영");// 3
		nameList.add("김선경");// 3		
		nameList.add("김주민");// 4
		for(String value : nameList) {
			System.out.println(value);
		}
	}
	
	public void useVector() {
		// 1. 생성 : Generic 사용
		List<Integer> list = new Vector<Integer>();
		System.out.println(list.isEmpty());
		// 2. 값 할당
		list.add(2023);// autoboxing : Integer.valueOf(정수)
		Integer ii = Integer.valueOf(7);
		list.add(ii);
		list.add(Integer.valueOf(6));
		list.add(Integer.parseInt("12"));
		// Generic이 사용되면 선언된 데이터 형으로만 값이 입력된다.
		//list.add("39");
		list.add(40);
				
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
				
		// 3. 값 얻기 : unboxing
		int i = list.get(0);
		System.out.println(i);
		i = list.get(1);
		System.out.println(i);
				
		// 일괄 처리
		for(int j = 0; j < list.size(); j++) {
			System.out.printf("list.get(%d) = %d\n",j,list.get(j));
		}
				
		// 배열로 복사
		// 1. 리스트의 크기로 배열을 생성
		Integer[] arr = new Integer[list.size()];
				
		// 2. 리스트에서 제공하는 복사 method 사용
		list.toArray(arr);
				
		// 리스트 방의 값 삭제) 방의 크기가 줄어든다.
		list.remove(2);
		list.remove(2);
				
				
		System.out.println(list + " / " + list.size() + "개");
			
		// arr배열의 값을 개선된 for로 출력
		for(Integer value : list) {
			System.out.print(value.intValue() + " ");
		}
				
		System.out.println();
				
		// 리스트는 중복값을 저장할 수 있다.
		List<String> nameList = new Vector<String>();
		nameList.add("강다연");// 0
		nameList.add("김다영");// 1
		nameList.add("김선경");// 2
		nameList.add("김인영");// 3
		nameList.add("김선경");// 3		
		nameList.add("김주민");// 4
		for(String value : nameList) {
			System.out.println(value);
		}
		
	}
	
	public void useLinkedList() {
		// 1. 생성
		List<String> nameList = new LinkedList<String>();
		// 2. 데이터 추가
		nameList.add("강다연");
		nameList.add("김다영");
		nameList.add("김인영");
		nameList.add("김주민");
		// 김다영 뒤에 김선경이 누락
		nameList.add(2,"김선경");
		
		System.out.println(nameList);
	}
	
	public static void main(String[] args) {
		UseList ul = new UseList();
		ul.useNonGeneric();
		System.out.println("=============================================");
		ul.useArrayList();
		System.out.println("=============================================");
		ul.useVector();
		System.out.println("=============================================");
		ul.useLinkedList();
		
	}

}

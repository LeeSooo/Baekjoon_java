package level5;

// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
// 구현 방식 : 1부터 10000까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면 그 수를 거르는 것이다.

public class Boj4673 {
	public static void main(String[] args) {
		// 1. boolean 배열을 선언하여 셀프 넘버를 구분했다. (1 ~ 10000 이하의 수)
		boolean[] check = new boolean[10001];
 
		// 2. for문을통해 1부터 10000까지 d(i)를 구한다.
		for (int i = 1; i < 10001; i++){
			int n = d(i);	// 생성자로 하는 수가 리턴되었므로 boolean배열을 통해 true로 바꾸어 준다.
		
			if(n < 10001)	// 100001보다 작은 수만 true로 변경(배열의 크기)
				check[n] = true;
		}
		StringBuilder sb = new StringBuilder();
        
		// 1부터 10000까지 돌려서 생성자가 아닌 false만 출력
		for (int i = 1; i < 10001; i++) {
			
			// false 인 인덱스만 출력
			if (!check[i]) 	
				sb.append(i).append('\n');
			
		}
		System.out.println(sb);
	}
 
	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); 		// 첫 째 자리수
			number = number/10;				// 10을 나누어 첫 째 자리를 없앤다
		}
		return sum;
		// return 된 수는 생성자가 있는 수, 
		// 즉 출력하면 안되는 수 이므로 boolean 배열을 통해 true로 바꾸어 준다.
	}
}    
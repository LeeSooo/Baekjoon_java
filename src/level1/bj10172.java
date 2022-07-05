package level1;

// 개를 출력한다.
/*
 
|\_/|
|q p|   /}
( 0 )"""\
|"^"`    |
||_/=\\__|
 
 */
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj10172 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("|\\_/|");
		bw.newLine();	// 줄 구분자
        
		bw.write("|q p|   /}");
		bw.newLine();	
        
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();	
        
		bw.write("|\"^\"`    |");
		bw.newLine();	
        
		bw.write("||_/=\\\\__|"); 
		        
		bw.flush();
		bw.close();
	}
}
package level1;

// 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
 
public class bj10718 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("강한친구 대한육군");
		bw.newLine();	// 줄 구분자
		bw.write("강한친구 대한육군");
        
		bw.flush();
		bw.close();
	}
}
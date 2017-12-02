package java_template_uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class TaskSolver {

		private BufferedReader br;
		private String input;
		private StringTokenizer stringTokenizer;

		public TaskSolver() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public void solve() throws IOException {

			while ((input = readLine()) != null) {
				stringTokenizer = new StringTokenizer(input);
				double a = Double.parseDouble(stringTokenizer.nextToken());
				stringTokenizer = new StringTokenizer(readLine());
				double b = Double.parseDouble(stringTokenizer.nextToken());

				double ans = Math.pow(b, 1.0 / a);
				String ans2 = String.format("%.0f", ans);
				System.out.println(ans2);
			}

		}

		public String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
			}
			return null;
		}

	}

	public static void main(String[] arg) {
		try {
			TaskSolver taskSolver = new TaskSolver();
			taskSolver.solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
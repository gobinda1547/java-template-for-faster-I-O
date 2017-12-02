package java_template_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static class TaskSolver {

		public static void solve(Scanner in, PrintWriter out) throws IOException {

			System.out.println("done");

		}
	}

	public static void main(String[] arg) {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			TaskSolver.solve(in, out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
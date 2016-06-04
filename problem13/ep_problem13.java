

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ep_problem13 {

	final static String FILE = "numbers.dat";
	final static int LINES_NUM = 100;

	public static void main (String[] args) {

		String[] data = readfile(FILE, LINES_NUM);
		long[] number = null;

		long sum  = 0;
		int first = 10;

		while (sum < 1e12) {
			number = parseData(data, first++);
			sum  = 0;
			for (long l : number) {
				sum += l;
			}
		}

		String result = Long.toString(sum).substring(0,10);
		System.out.println ("First 10 digits is: " + result);
	}

	public static String[] readfile(String file, int num_lines) {

		BufferedReader br = null;
		String[] data = new String[num_lines];

		int i = 0;

		try {

			String line;
			br = new BufferedReader ( new FileReader(file));
			while ((line = br.readLine()) != null || i < num_lines) {
				data[i++] = line;
			}

		} catch (IOException e) {
	
			e.printStackTrace();
	
		} finally {
	
			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

		return data;
	}

	public static long[] parseData(String[] data, int first) {
		long[] number = new long[data.length];
		for (int i = 0; i < data.length ; i++) {
			number[i] = Long.parseLong(data[i].substring(0,first+1));
		}
		return number;
	}
}


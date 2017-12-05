package gcd;

import java.util.ArrayList;

public class Choop {

	public ArrayList<Integer> gcd(int a, int b) {

		ArrayList<Integer> rest = new ArrayList<Integer>();

		rest.add(a);
		rest.add(b);

		for (int i = 0; i < rest.size(); i++) {
			int mod = rest.get(i) % rest.get(rest.size() - 1);

			rest.add(mod);

			if (rest.get(rest.size() - 1) == 0)
				break;

		}
		return rest;
	}

	public void euclid(int r0, int r1) {

		ArrayList<Integer> R = gcd(r0, r1);
		ArrayList<Integer> Q = new ArrayList<Integer>();

		for (int i = 0; i < R.size() - 1; i++) {
			if (R.get(i + 1) != 0) {

				int q = R.get(i) / R.get(i + 1);
				Q.add(q);
			}
		}
		Q.remove(Q.size() - 1);

		ArrayList<Integer> S = new ArrayList<Integer>();

		S.add(1);
		S.add(0);

		for (int i = 0; i < Q.size(); i++) {
			int sn = S.get(i) - Q.get(i) * S.get(i + 1);

			S.add(sn);
		}

		ArrayList<Integer> T = new ArrayList<Integer>();

		T.add(0);
		T.add(1);

		for (int i = 0; i < Q.size(); i++) {
			int tn = T.get(i) - Q.get(i) * T.get(i + 1);

			T.add(tn);
		}

		System.out.println("Q_k: " + Q);
		System.out.println("R_k: " + R);
		System.out.println("S_k: " + S);
		System.out.println("T_k: " + T);
		System.out.println("-------------");
		System.out.println("R = " + R.get(R.size()-2));
		System.out.println("S = " + S.get(S.size()-1));
		System.out.println("T = " + T.get(T.size()-1));
	}
	
	public void euclidWithSolution(int r0, int r1, int x) {

		ArrayList<Integer> R = gcd(r0, r1);
		ArrayList<Integer> Q = new ArrayList<Integer>();

		for (int i = 0; i < R.size() - 1; i++) {
			if (R.get(i + 1) != 0) {

				int q = R.get(i) / R.get(i + 1);
				Q.add(q);
			}
		}
		Q.remove(Q.size() - 1);

		ArrayList<Integer> S = new ArrayList<Integer>();

		S.add(1);
		S.add(0);

		for (int i = 0; i < Q.size(); i++) {
			int sn = S.get(i) - Q.get(i) * S.get(i + 1);

			S.add(sn);
		}

		ArrayList<Integer> T = new ArrayList<Integer>();

		T.add(0);
		T.add(1);

		for (int i = 0; i < Q.size(); i++) {
			int tn = T.get(i) - Q.get(i) * T.get(i + 1);

			T.add(tn);
		}
		
		String besked = "";
		boolean isTrueOrFalse;
		if(x % R.get(R.size()-2) == 0) {
			isTrueOrFalse = true;
			besked = isTrueOrFalse + " da " + R.get(R.size()-2) + " går op i " + x;
		} else {
			isTrueOrFalse = false;
			besked = isTrueOrFalse + " da " + R.get(R.size()-2) + " IKKE går op i " + x;
		}

		System.out.println("Q_k: " + Q);
		System.out.println("R_k: " + R);
		System.out.println("S_k: " + S);
		System.out.println("T_k: " + T);
		System.out.println("-------------");
		System.out.println("R = " + R.get(R.size()-2));
		System.out.println("S = " + S.get(S.size()-1));
		System.out.println("T = " + T.get(T.size()-1));
		System.out.println("Findes der en heltalsløsning til ligningen? " + besked);
	}
}

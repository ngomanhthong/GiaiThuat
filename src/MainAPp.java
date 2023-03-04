
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainAPp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.println("nhap so luong so nguyen");
		int n = sc.nextInt();
		//nhập list
		System.out.println("list");
		for (int i = 0; i < n; i++) {
			System.out.println("so nguyen " + (i + 1));
			int num = sc.nextInt();
			list.add(num);
		}
		//nhập list2
		System.out.println("list2");
		for (int i = 0; i < n; i++) {
			System.out.println("so nguyen " + (i + 1));
			int num = sc.nextInt();
			list2.add(num);
		}
		// theo thứ tự nhập vào
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		// thứ tự ngược với thứ tự nhập vào
		for (int i = list2.size() - 1; i >= 0; i--) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();
		phanTuTrungNhau(list);
		phanTuTrungNhau(list2);
		XoaSoLe(list);
		XoaSoLe(list2);
	}

	public static void phanTuTrungNhau(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(i);

				}
			}

		}
	}

	public static void XoaSoLe(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 1) {
				list.remove(i);
			}

		}
	}

}

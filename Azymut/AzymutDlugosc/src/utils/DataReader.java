package utils;

import java.util.Scanner;

import data.Point;

public class DataReader {

	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}

	public Point readPoint() {
		System.out.println("Podaj wsp�rz�dn� X:");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.println("Podaj wsp�rz�dn� Y:");
		double y = sc.nextDouble();
		sc.nextLine();

		return new Point(x, y);

	}
}

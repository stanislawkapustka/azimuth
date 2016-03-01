package app;
import data.Point;
import utils.AzimuthLengthMethods;
import utils.DataReader;

public class App {

	public static void main(String[] args) {
		
		DataReader input = new DataReader();
		
		System.out.println("Wprowad� wsp�rz�dne punktu pocz�tkowego:");
		Point p1 = input.readPoint();
		System.out.println("Wprowad� wsp�rz�dne punktu ko�cowego:");
		Point p2 = input.readPoint();
		
		input.close();
		
		AzimuthLengthMethods al = new AzimuthLengthMethods();
		
		System.out.println("Azymut wynosi:" + al.Azimuth(p1, p2));
		System.out.println("D�ugo�� Wynosi:" + al.Length(p1, p2));

	}

}

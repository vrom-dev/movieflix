package utilidades;

import java.util.Scanner;

public class LecturaDatos {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static String leerLinea() {
		return scanner.nextLine();
	}

	public static String leerLinea(String mensaje) {
		System.out.println(mensaje);
		return leerLinea();
	}

	public static int leerInt() {
		return scanner.nextInt();
	}

	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		return leerInt();
	}

	public static short leerShort() {
		return scanner.nextShort();
	}

	public static short leerShort(String mensaje) {
		System.out.println(mensaje);
		return leerShort();
	}

	public static float leerFloat() {
		return scanner.nextFloat();
	}

	public static float leerFloat(String mensaje) {
		System.out.println(mensaje);
		return leerFloat();
	}

	public static long leerLong() {
		return scanner.nextLong();
	}

	public static long leerLong(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextLong();
	}

	public static double leerDouble() {
		return scanner.nextDouble();
	}

	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextDouble();
	}

	public static byte leerByte() {
		return scanner.nextByte();
	}

	public static byte leerByte(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextByte();
	}

	public static String leerPalabra() {
		return scanner.next();
	}

	public static String leerPalabra(String mensaje) {
		System.out.println(mensaje);
		return scanner.next();
	}

}
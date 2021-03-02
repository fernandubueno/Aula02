
public class TestandoStrings {

	public static void main(String[] args) {
		String nomeJedi1 = "Luke Skywalker";
		
		System.out.println("Resultado do 1� teste com o .equals:");
		System.out.println(nomeJedi1.equals("Luke SKYWALKER"));
		
		System.out.println("Resultado do 2� teste com o .equals:");
		System.out.println(nomeJedi1.equals("Luke Skywalker"));
		
		System.out.println("Resultado do 1� teste com o .equalsIgnoreCase:");
		System.out.println(nomeJedi1.equalsIgnoreCase("Luke SKYWALKER"));
		
		System.out.println("Resultado do 2� teste com o .equalsIgnoreCase:");
		System.out.println(nomeJedi1.equalsIgnoreCase("Luke Skywalker"));
		
		System.out.println("Resultado do 1� teste com o .contentEquals:");
		System.out.println(nomeJedi1.contentEquals("Luke SKYWALKER"));
		
		System.out.println("Resultado do 2� teste com o .contentEquals:");
		System.out.println(nomeJedi1.contentEquals("Luke Skywalker"));

	}

}

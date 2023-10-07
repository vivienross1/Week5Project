package W5CodingProject;

public class App {

	public static void main(String[] args) {
		
		Logger astericklogger = new AsterickLogger();
		Logger spacedlogger = new SpacedLogger();
		
		astericklogger.Log("Hello");
		astericklogger.Error("Goodbye");
		
		System.out.println();

		spacedlogger.Log("Welcome");
		spacedlogger.Error("Warning");
		
		
			

	}

}

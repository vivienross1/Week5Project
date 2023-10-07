package W5CodingProject;

public class AsterickLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		String str = "Error:" + error; 
		System.out.println("*******************");
		Log(str);
		System.out.println("*******************");
		
	}

}

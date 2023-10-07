package W5CodingProject;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		StringBuilder str = new StringBuilder();
        for (int i = 0; i < log.length(); i++) {
            str.append(log.charAt(i)).append(" ");	
	}
        System.out.println(str);
	}

	@Override
	public void Error(String error) {
		StringBuilder er = new StringBuilder();
        for (int i = 0; i < error.length(); i++) {
            er.append(error.charAt(i)).append(" ");	
	}
        System.out.println("ERROR:" + " " + er);
		 
		 
		 
	}
	
}
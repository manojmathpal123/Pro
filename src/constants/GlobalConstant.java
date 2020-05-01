package constants;

public class GlobalConstant {
	
	public enum Filename
	{
		CONFIG("application");
		
		private String value;
		
		private Filename(String value)
		{
			this.value = value;
		}
		
		public String tosString()
		{
			return value;
		}
	}

}

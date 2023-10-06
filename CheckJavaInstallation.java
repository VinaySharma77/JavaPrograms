class CheckJavaInstallationf{
	public static void main(String args[]){
		String javaVersion = System.getProperty("java.version");
		if(javaVersion != null){
			System.out.println("Java is installed, version : " + javaVersion);
		}
		else{
			System.out.println("Java is not installed on your computer !!");
		}
	}
}
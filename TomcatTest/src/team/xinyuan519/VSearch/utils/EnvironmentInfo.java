package team.xinyuan519.VSearch.utils;

public class EnvironmentInfo {
	public static final String projectName ="VSearch";
	
	public static final String serverIP ="120.27.47.167";
	public static final int webServicePort = 80;
	public static final String dbIP = serverIP;
	public static final int dbPort = 27017;
	public static final String pythonServerIP = serverIP;
	public static final int pythonServerPort = 4399;
	
	public static final String dbNameSuffix = "";
//	public static final String historyDBName = "WeiXinHistory";
	public static final String freshDBName = "WeiXinFresh";
	public static final String accountInfoDBName = "AccountInfo";
	public static final String accountInfoCollectionName = "accountInfo";
	public static final String taskDBName = "RefreshTask";
	
	public static final String PhantomJSExecutablePath = "D:\\phantomjs.exe";
//	public static final String PhantomJSExecutablePath = "/home/dtlvhyy/APPS/Phanjomjs/phantomjs/bin/phantomjs";
	public static final String ParametersFilePath = "D:\\rawURL.txt";
	
	public static final String dbUser = "JavaOperator";
	public static final char[] dbPwd = "gsh632260737".toCharArray();
	public static final String authDB = "admin";
}

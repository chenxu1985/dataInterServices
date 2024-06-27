package cn.ac.big.bigd.webservice.model.gsa;

public class Status {
    public static final int STEP_ONE = 11;
    public static final int STEP_TWO = 12;
    public static final int STEP_THREE = 13;
    public static final int STEP_FORE = 14;
    public static final int STEP_FIVE = 15;

    public static final int UNFINISHED = 1;
    public static final int FINISHED = 2;
    public static final int CHECKED_OK = 3;
    public static final int CHECKED_FAILED = 4;
    public static final int DELETE = 5;
    public static final int WAITING = 6;
    public static final int PROCESSING = 7;
    public static final int PROCESS_OK = 8;
    public static final int PROCESS_FAILED = 9;

    public static final String[] StatusString={
            "",					//0
            "Unfinished",    	//1
            "Unchecked",     	//2
            "Checked OK",    	//3
            "Checked Failed",	//4
            "Deleted",       	//5
            "Uploading",     	//6
            "Uploaded Succeed", //7
            "Uploaded Error",	//8
            "Processing",	//9
            "Processed Succeed",	//10
            "Processed Error",	//11
            "Files Archived"	//12
    };
    public static final String[] ReleaseStateString={
            "",					//0
            "Confidential",    	//1
            "Public",     		//2
            "Suppressed",    	//3
            "Replaced",		//4
            "Killed"       	//5
    };
}

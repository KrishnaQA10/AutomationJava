package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static final int Max_count = 1; //retry count
    @Override
    public boolean retry(ITestResult result){
        if(count<Max_count){
            count++;
            return true;
        }
        return false;
    }
}

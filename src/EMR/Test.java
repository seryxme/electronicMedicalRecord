package EMR;

public class Test {
    private int testId;
    private String testName;
    private String testResult;

    public Test(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    @Override
    public String toString() {
        return String.format("""
                
                ID No.: %d
                Test: %s
                Result: %s
                """, testId, testName, testResult);
    }
}

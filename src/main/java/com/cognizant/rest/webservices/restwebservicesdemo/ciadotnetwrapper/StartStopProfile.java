package com.cognizant.rest.webservices.restwebservicesdemo.ciadotnetwrapper;

/**
 * Created by dharma on 6/8/20.
 */
public class StartStopProfile {

    private String projectName;
    private String projectDesc;
    private String testType;
    private String testId;

    public StartStopProfile(){

    }

    public StartStopProfile(String projectName, String projectDesc, String testType, String testId) {
        super();
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.testType = testType;
        this.testId = testId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    @Override
    public String toString() {
        return "StartProfile{" +
                "projectName='" + projectName + '\'' +
                ", projectDesc='" + projectDesc + '\'' +
                ", testType='" + testType + '\'' +
                ", testId='" + testId + '\'' +
                '}';
    }
}

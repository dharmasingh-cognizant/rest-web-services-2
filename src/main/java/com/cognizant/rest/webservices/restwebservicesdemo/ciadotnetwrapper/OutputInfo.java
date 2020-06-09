package com.cognizant.rest.webservices.restwebservicesdemo.ciadotnetwrapper;

/**
 * Created by dharma on 6/8/20.
 */
public class OutputInfo {

    private String output;
    private String error;

    public OutputInfo(String outputStream, String errorStream) {
        super();
        this.error = errorStream;
        this.output = outputStream;
    }


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

package com.cognizant.rest.webservices.restwebservicesdemo.ciadotnetwrapper;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.io.*;


/**
 * Created by dharma on 6/8/20.
 */

@Component
public class StartProfilerDaoService {

    public StartProfilerDaoService() {

    }
    public OutputInfo startProfiler(@Valid StartStopProfile startProfiler) throws IOException, InterruptedException {

        String command = "whoami";
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        Process process = processBuilder.start();
        process.waitFor();
        BufferedReader outbuffer = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuffer out = new StringBuffer();
        String line;
        while ((line = outbuffer.readLine()) != null) {
            out.append(line).append(" ");
        }
        BufferedReader errbuffer = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        StringBuffer err = new StringBuffer();
        while ((line = errbuffer.readLine()) != null) {
            err.append(line).append(" ");
        }
        return new OutputInfo(out.toString() , err.toString());

    }

    public OutputInfo stopProfiler(@Valid StartStopProfile startProfiler) {
        return new OutputInfo("" ,"" );
    }

    public OutputInfo scanArtifacts(@Valid StartStopProfile startProfiler) {
        return new OutputInfo("" ,"" );
    }
}

package com.cognizant.rest.webservices.restwebservicesdemo.ciadotnetwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by dharma on 6/8/20.
 */

@RestController
public class CIADotNetController {
 @Autowired
 private StartProfilerDaoService startProfilerDaoService;

    @PostMapping("/startprofiler")
    public OutputInfo startProfiler(@Valid @RequestBody StartStopProfile startProfiler) throws IOException, InterruptedException {
        return startProfilerDaoService.startProfiler(startProfiler);
    }

    @PostMapping("/stopprofiler")
    public OutputInfo stopProfiler(@Valid @RequestBody StartStopProfile startProfiler) throws IOException, InterruptedException {
        return startProfilerDaoService.stopProfiler(startProfiler);
    }

    @PostMapping("/scan")
    public OutputInfo scan(@Valid @RequestBody StartStopProfile startProfiler) throws IOException, InterruptedException {
        return startProfilerDaoService.scanArtifacts(startProfiler);
    }

}

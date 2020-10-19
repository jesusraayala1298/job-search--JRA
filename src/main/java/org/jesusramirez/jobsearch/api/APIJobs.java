package org.jesusramirez.jobsearch.api;

import feign.Headers;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface ApiJobs {
@RequestLine("GET /")
}

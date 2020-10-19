package org.jesusramirez.jobsearch;

import com.beust.jcommander.JCommander;

import org.jesusramirez.jobsearch.cli.CLIArguments;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        JCommander jCommander = CommanderFunction.builCommanderWithName("job-search", CLIArguments::newInstance);

    }
}

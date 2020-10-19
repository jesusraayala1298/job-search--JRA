package org.jesusramirez.jobsearch;

import com.beust.jcommander.JCommander;

import java.util.function.Supplier;

public class CommanderFunction {
    static <T>JCommander builCommanderWithName(String cliName, Supplier<T> argumentSupplier){
        JCommander jCommander= JCommander.newBuilder().addCommand(argumentSupplier.get()).build();
        jCommander.setProgramName(cliName);
        return jCommander;
    }
}

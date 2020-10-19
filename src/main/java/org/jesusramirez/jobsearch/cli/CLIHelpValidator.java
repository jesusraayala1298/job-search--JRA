package org.jesusramirez.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class cliHelpValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean valorActual = Boolean.parseBoolean(value);
        if(valorActual){
            throw new ParameterException("Ayuda solicita");
        }
    }
}

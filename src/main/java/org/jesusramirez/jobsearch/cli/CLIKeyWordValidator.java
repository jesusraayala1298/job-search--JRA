package org.jesusramirez.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeyWordValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[A-Za-z]+[0-9]*$")){
            System.err.println("El criterio de busqueda no es valido");
            throw  new ParameterException("Solo letras y numeros");
        }
    }
}

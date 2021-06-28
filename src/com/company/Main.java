package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	String request = read.readLine();
	StringValidator validator = new StringValidator();
	if (validator.isPatternRight(request)) {
		String operationType = validator.operationType(request);
		boolean isArabian = ((validator.containsArabian(request)) == 1);
		StringBuilder builder = new StringBuilder();
		String separator = builder.append("\\").append(validator.operationType(request)).toString();
		String strinWOSpaces = request.replaceAll(" ","");
		String[] requestParam = strinWOSpaces.split(separator);
		if(isArabian) {
			NumericFactory numericFactory = new NumericFactory();
			ArabianPairs arabianPairs = numericFactory.arabianInit(requestParam);
			numericFactory.arabianExec(arabianPairs,operationType);
		} else {
			NumericFactory numericFactory = new NumericFactory();
			List<RomanNumber> list = numericFactory.romanianInit(requestParam);
			numericFactory.romanianExec(list, operationType);
		}

	}

    }

}

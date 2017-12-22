package com.rgowdah.springMvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	private String[] coursePrefix;
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix=courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result=false;
		if(theCode!=null){
			// loop thru course prefixes
			// check to see if code matches any of the course prefixes
			for (String tempPrefix : coursePrefix) {
				result=theCode.startsWith(tempPrefix);
				if(result)
					break;
			}
		}
		else
			result=true;
		return result;
	}
}

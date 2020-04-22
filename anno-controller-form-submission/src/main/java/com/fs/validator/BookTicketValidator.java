package com.fs.validator;

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.fs.form.TicketForm;

@Component
public class BookTicketValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(TicketForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		TicketForm form = (TicketForm) target;
		if (isInValid(form.getPassengerName())) {
			errors.reject("passengerName.blank", "passengerName");
		}
		if (isInValid(form.getGender())) {
			errors.reject("gender.blank", "gender");
		}
		if (errors.hasFieldErrors("age") == false) {
			if (form.getAge() < 0 || form.getAge() > 100) {
				errors.reject("age.invalid", "age");
			}
		}

		if (isInValid(form.getContactNo())) {
			errors.reject("contactNo.blank", "contactNo");
		}
		if (isInValid(form.getEmailId())) {
			errors.reject("emailId.blank", "emailId");
		}

	}

	private boolean isInValid(String attributeName) {
		if (attributeName == null || attributeName.trim().length() == 0) {
			return true;
		}
		return false;
	}

}

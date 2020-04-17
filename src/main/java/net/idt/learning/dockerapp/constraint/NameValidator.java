package net.idt.learning.dockerapp.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<UpperCaseName, String> {

   public void initialize(UpperCaseName constraint) {
   }

   public boolean isValid(String name, ConstraintValidatorContext context) {
      return name != null && name.matches("[A-Z][a-z]+");
   }
}

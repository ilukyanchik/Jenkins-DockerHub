package net.idt.learning.dockerapp.constraint;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface UpperCaseName {
    String message() default "Invalid name";
    Class[] groups() default {};
    Class[] payload() default {};
}

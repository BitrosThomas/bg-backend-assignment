package com.thomas.blueground.validator;

import com.thomas.blueground.domain.Review;
import com.thomas.blueground.model.ReviewModel;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Set;

@Component
public class ReviewValidator implements Validator {


    public boolean supports(Class<?> aClass) {

        return ReviewModel.class.isAssignableFrom(aClass);
    }


    public void validate(Object target, Errors errors) {

        ReviewModel ReviewModel = (ReviewModel) target;

        if (Double.valueOf(ReviewModel.getScore()) == null ) {

            errors.rejectValue("Score","score is empty");
        }
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validate(T t, Class<?>... classes) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateProperty(T t, String s, Class<?>... classes) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> aClass, String s, Object o, Class<?>... classes) {
        return null;
    }

    @Override
    public BeanDescriptor getConstraintsForClass(Class<?> aClass) {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) {
        return null;
    }

    @Override
    public ExecutableValidator forExecutables() {
        return null;
    }
}

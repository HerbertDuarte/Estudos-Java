package com.calc.demo;

import org.springframework.web.bind.annotation.RestController;

import com.calc.demo.exceptions.UnsuportedMathOperationException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class MathController {

    @RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);
        Double n2 = convertToDouble(numberTwo);

        return n1 + n2;

    }

    @RequestMapping(value = "sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);
        Double n2 = convertToDouble(numberTwo);

        return n1 - n2;

    }

    @RequestMapping(value = "mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mul(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);
        Double n2 = convertToDouble(numberTwo);

        return n1 * n2;

    }

    @RequestMapping(value = "div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);
        Double n2 = convertToDouble(numberTwo);

        return n1 / n2;

    }

    @RequestMapping(value = "med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);
        Double n2 = convertToDouble(numberTwo);

        return (n1 + n2)/2;
    }

    @RequestMapping(value = "sqr/{numberOne}", method = RequestMethod.GET)
    public Double sqr(
            @PathVariable(value = "numberOne") String numberOne) throws Exception {

        if (!isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double n1 = convertToDouble(numberOne);

        return Math.sqrt(n1);

    }

    public Double convertToDouble(String strNumber) {

        if (strNumber == null)
            return 0D;
        String number = strNumber.replace(",", ".");
        if (isNumeric(strNumber))
            return Double.parseDouble(number);
        return 0D;
    }

    public boolean isNumeric(String strNumber) {
        if (strNumber == null)
            return false;
        String number = strNumber.replace(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
}

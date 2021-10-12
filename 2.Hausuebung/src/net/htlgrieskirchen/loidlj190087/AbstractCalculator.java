/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.htlgrieskirchen.loidlj190087;

/**
 *
 * @author loidl
 */
public abstract class AbstractCalculator implements CalculateOperation{
    protected CalculateOperation add;
    protected CalculateOperation subtract;
    protected CalculateOperation multiply;
    protected CalculateOperation divide;

    public AbstractCalculator(CalculateOperation add, CalculateOperation subtract, CalculateOperation multiply, CalculateOperation divide){};
    
    public abstract Number add(Number a, Number b);
    public abstract Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}

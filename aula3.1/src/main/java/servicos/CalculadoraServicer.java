/**
 * CalculadoraServicer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicos;

public interface CalculadoraServicer extends java.rmi.Remote {
    public float divisao(float num1, float arg1) throws java.rmi.RemoteException;
    public float soma(float num1, float num2) throws java.rmi.RemoteException;
    public float subtracao(float num1, float arg1) throws java.rmi.RemoteException;
    public float multiplicacao(float num1, float arg1) throws java.rmi.RemoteException;
}

package Cucmber_test;


import org.testng.IExecutionListener;

public class Listeners implements IExecutionListener {

    @Override
    public void onExecutionStart() {
        System.out.println("This is Exe_Start");

    }

    @Override
    public void onExecutionFinish() {
        System.out.println("This is Exe_Stop");

    }
}

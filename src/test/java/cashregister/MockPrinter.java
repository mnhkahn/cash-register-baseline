package cashregister;

import static junit.framework.TestCase.assertTrue;

class MockPrinter extends Printer {
    public boolean printhasBeenCalled;

    @Override
    public void print(String printThis) {
        printhasBeenCalled = true;
//        System.out.print("print " + printThis);
    }

    public void verifyPrintHasBeenCalled(){
        assertTrue(printhasBeenCalled);
    }
}

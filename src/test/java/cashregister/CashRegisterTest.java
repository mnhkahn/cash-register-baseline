package cashregister;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CashRegisterTest {
//    @Mock
//    private MockPrinter mockPrinter;
//
//    @Mock
//    private MockPurchase stubPurchase;

    @Test
    public void should_print_the_real_purchase() {
        //initialize CashRegister and fake Printer
        MockPrinter mockPrinter = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mockPrinter);
        Item[] items = new Item[1];
        items[0] = new Item("aaa", 1);
        MockPurchase stubPurchase = new MockPurchase(items);
        cashRegister.process(stubPurchase);

        //verify that printer was called
        mockPrinter.verifyPrintHasBeenCalled();
    }

}

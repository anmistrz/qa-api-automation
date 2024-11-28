import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import example.ExecutionListeners;

@Listeners(ExecutionListeners.class)
public class testNG {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);
 
    @Test
    public void testPrintMessage() {
       Assert.assertEquals(message, messageUtil.printMessage());
    }

}


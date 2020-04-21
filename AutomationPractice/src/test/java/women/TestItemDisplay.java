package women;

import org.testng.annotations.Test;
import pages.WomenPage;

public class TestItemDisplay extends WomenPage{

    @Test
    public void items(){
        selectItems();
    }
}

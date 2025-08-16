package hooks;


import utility.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfterHooks {

    @Before
    public void setUp() {
        Base.initializeDriver();
    }

    @After
    public void tearDown() {
        Base.quitDriver();
    }
}

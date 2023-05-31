package suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import teste.AplicaDiscountTest;
import teste.PoateRezervaTest;

@Suite
@SelectClasses({AplicaDiscountTest.class, PoateRezervaTest.class})
@IncludeTags({"tag1"})
public class SuitaCustom {
}

package inc.blackhorse.pmmi;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author val.rudi
 */
public class SetObjectMapperTest {

    @Test
    public void shouldConvert() {
        System.out.println(SetObjectMapper.INSTANCE.toGrpc(new SetsHolderModel(new HashSet<>(), new HashSet<>())));
    }

}

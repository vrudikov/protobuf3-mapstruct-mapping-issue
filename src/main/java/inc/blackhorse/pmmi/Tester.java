package inc.blackhorse.pmmi;

import java.util.HashSet;

/**
 * @author val.rudi
 */
public class Tester {

    public static void main(String[] args) {
        System.out.println(SetObjectMapper.INSTANCE.toGrpc(new SetsHolderModel(new HashSet<>(), new HashSet<>())));
    }

}

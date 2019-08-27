package inc.blackhorse.pmmi;

import java.util.Set;

/**
 * @author val.rudi
 */
class SetsHolderModel {
    private Set<String> set1;
    private Set<String> set2;

    public SetsHolderModel() {
    }

    SetsHolderModel(Set<String> set1, Set<String> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public Set<String> getSet1() {
        return set1;
    }

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public Set<String> getSet2() {
        return set2;
    }

    public void setSet2(Set<String> set2) {
        this.set2 = set2;
    }

    @Override
    public String toString() {
        return "SetsHolderModel{" +
                "set1=" + set1 +
                ", set2=" + set2 +
                '}';
    }
}

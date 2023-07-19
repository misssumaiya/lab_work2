package problem_E2_1;
public class StringReplace {
    private String stateName;

    public StringReplace() {
        stateName = "Mississippi";
    }

    public StringReplace(String stateName) {
        this.stateName = stateName;

    }

    public int replace1() {
        String stateName1 = null;
        int stringLength;
        stateName1 = stateName.replace("i", "ii");
        stringLength = stateName1.length();
        return stringLength;
    }

    public int replaces() {
        String newStateName = null;
        int stringLength2;
        newStateName = stateName.replace("ss", "s");
        stringLength2 = newStateName.length();
        return stringLength2;
    }
}


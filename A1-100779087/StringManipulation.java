public class StringManipulation {
    private String str;

    // Creates constructor for class
    public StringManipulation(String str) {
        this.str = str;
    }

    // Getters and Setters

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // Function to remove all underscores and capitilize all middle words
    public String manipulate(String str) {
        String msg = "";
        String[] test = str.split("_"); // split strings around _ and store in an array

        // From the second letter forth capitilize first letter and keep all other
        // letter normal
        // Then concatenate to string
        for (int i = 1; i < test.length; i++) {
            String firstLetter = test[i].substring(0, 1).toUpperCase();
            String otherLetters = test[i].substring(1);

            msg = msg + firstLetter + otherLetters;
        }

        // if there is more than one word add first letter to string and print
        if (test.length > 1) {
            msg = test[0] + msg;
        } else if (test.length == 1) { // else if only word in string then capitilize it and print
            String test1 = test[0].substring(0, 1).toUpperCase();
            String test2 = test[0].substring(1);
            msg = test1 + test2;
        }

        return msg;
    }
}

public class SimpleBookParser implements BookParser {
    private final String text;

    public SimpleBookParser(String text) {
        this.text = text;
    }


    @Override
    public int getNumOfPages() {
        return text.length();
    }
}

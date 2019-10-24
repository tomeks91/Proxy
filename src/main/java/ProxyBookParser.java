public class ProxyBookParser implements BookParser {
    private final String text;
    private BookParser bookParser;

    public ProxyBookParser(String text) {
        this.text = text;
    }

    @Override
    public int getNumOfPages() {
        //checking access
        if(bookParser == null){
            bookParser = new SimpleBookParser(text);
        }
        return bookParser.getNumOfPages();
    }
}

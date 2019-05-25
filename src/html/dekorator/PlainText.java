package html.dekorator;

public class PlainText extends AbstractText {

    protected String word;

    PlainText(String word) {
        this.word = word;
    }

    @Override
    public void show() {
        System.out.print(this.word);
    }
}

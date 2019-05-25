package html.dekorator;


abstract class Decorator extends AbstractText {

    protected AbstractText text;
    
    Decorator(AbstractText text){
    this.text = text;
    }
    
    @Override
    public void show() {
        text.show();
    }
    
}

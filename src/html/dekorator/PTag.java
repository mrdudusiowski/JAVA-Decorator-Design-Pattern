/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.dekorator;

/**
 *
 * @author Patryk
 */
public class PTag extends Decorator {

    public PTag(AbstractText text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.print("<p>");
        super.show();
        System.out.print("</p>");

    }

}

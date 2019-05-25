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
public class EmTag extends Decorator {

    public EmTag(AbstractText text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.print("<em>");
        super.show();
        System.out.print("</em>");
    }

}

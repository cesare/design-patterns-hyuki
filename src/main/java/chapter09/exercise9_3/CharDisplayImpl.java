package chapter09.exercise9_3;

import chapter09.DisplayImpl;

public class CharDisplayImpl extends DisplayImpl {
    char openChar;
    char character;
    char closeChar;
    
    public CharDisplayImpl(char openChar, char character, char closeChar) {
        this.openChar = openChar;
        this.character = character;
        this.closeChar = closeChar;
    }

    @Override
    public void rawOpen() {
        System.out.print(openChar);
    }

    @Override
    public void rawPrint() {
        System.out.print(character);
    }

    @Override
    public void rawClose() {
        System.out.println(closeChar);
    }
}

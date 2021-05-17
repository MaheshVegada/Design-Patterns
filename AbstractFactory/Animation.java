package AbstractFactory;

import java.util.*;

public class Animation {

    private ArrayList<Character> ch = new ArrayList<Character>();

    public void addCharacter(String CharName, String CharType) {
        Character c = null;
        switch (CharType) {
            case "Normal":
                c = new NormalCharacterFactory().getCharacter(CharName);
                break;
            case "Color":
                c = new ColorCharacterFactory().getCharacter(CharName);
                break;
        }
        ch.add(c);
    }

    public void reRender() {
        Iterator<Character> i = ch.iterator();
        while (i.hasNext()) {
            Character c = i.next();
            c.render();
        }
    }
}

package AbstractFactory;

public class ColorCharacterFactory {

    public Character getCharacter(String SourceType) {
        switch (SourceType) {
            case "Mowgli":
                return new ColorCharacterMowgli();
            case "Sherkhan":
                return new ColorCharacterSherkhan();
        }
        return null;
    }
}

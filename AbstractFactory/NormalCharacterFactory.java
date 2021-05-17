package AbstractFactory;

public class NormalCharacterFactory {

    public Character getCharacter(String SourceType) {
        switch (SourceType) {
            case "Mowgli":
                return new NormalCharacterMowgli();
            case "Sherkhan":
                return new NormalCharacterSherkhan();
        }
        return null;
    }
}

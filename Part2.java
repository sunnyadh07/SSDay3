public class Part2 {
    public static void main(String[] args) {
        openCharacterHistory("Sunny");
    }

    public static void openCharacterHistory(String characterName ){
        System.out.println(displayCharacter(characterName));
        System.out.println(getCharacterHighScores());
    }

    public static String displayCharacter(String characterName) {

        return (characterName + " Is being displayed.");
    }

    public static String getCharacterHighScores() {

        return ("Highest kills: 10000");
    }
}

public class Example2 {
    public static void main(String[] args) {
        String[] wordlistone = {
            "Day","Morning", "Night"
        };
        String[] wordlisttwo = {
           "Janurary", "Febraury", "March"
        };
        String[] wordlisthree = {
            "monday","Tuesday", "wednesday"
        };

        int one = wordlistone.length;
        int two = wordlisttwo.length;
        int three = wordlisthree.length;

        java.util.Random randomG = new java.util.Random();
        int rand1 = randomG.nextInt(one);
        int rand2 = randomG.nextInt(two);
        int rand3 = randomG.nextInt(three);

        String phrase = wordlistone[rand1] + " " + wordlisttwo[rand2] + " " + wordlisthree[rand3];

        System.out.println("What we need is a " + phrase);

    }
}

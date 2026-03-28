package amazon.learn.week2;

public class TextGame {
    String text;

    static void main(String[] args) {
        TextGame textGame = new TextGame();
        textGame.text = """
                Vom Eise befreit sind Strom und Bäche
                Durch des Frühlings holden, belebenden Blick
                Im Tale grünet Hoffnungs-Glück
                Der alte Winter, in seiner Schwäche
                Zog sich in rauhe Berge zurück
                Von dorther sendet er, fliehend, nur
                Ohnmächtige Schauer körnigen Eises
                In Streifen über die grünende Flur
                Aber die Sonne duldet kein Weißes
                Überall regt sich Bildung und Streben
                Alles will sie mit Farben beleben
                Doch an Blumen fehlt's im Revier
                Sie nimmt geputzte Menschen dafür
                """;

        String[] words = textGame.text.split("[\\s]+");
        int count = 0;
        for(String word : words){
            System.out.println(word);
            if(word.equals("In") || word.equals("in")){

                System.out.println("-----------word" + word);
                count++;
            }
        }
        System.out.println("Number of times 'in' appears in the text: " + count);
    }
}

package JavaArray;

public class NotaAltaPequeña {
    public static void main(String[] args) {
        float[] notes = {6.4f, 4.0f, 9.7f, 9.0f, 1.3f};

        float notaMinima = 10.0f;
        float notaMaxima = 0.0f;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > notaMaxima) {
                notaMaxima = notes[i];
            }
        }
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < notaMinima) {
                notaMinima = notes[i];
            }
        }
        System.out.println(notaMaxima);
        System.out.println(notaMinima);
    }


}



//        for (float note : notes) {
//            sumatoriNotes += note;
//        }
//        System.out.println("media classe: " + sumatoriNotes/notes.length);
//    }
//}

package task6;

/**
 * Class for additing, removing and editing of Notes
 */
public class NotePad {

    static void addNote(String[] note) {
        for(int i = 0; i < note.length; i++){
            if(note[i] == null){
                note[i] = "added";
                break;
            }
        }
    }

    static void removeNote(String[] note) {
        for(int i = 0; i < note.length; i++){
            if(!(note[i] == null)){
                note[i] = "null";
                break;
            }
        }
    }

    static void editNote(String[] note, int num) {
        note[num] = "edited";
    }

    static void showNote(String[] finNote) {
        for (int i = 0; i < finNote.length; i++) {
            System.out.println(finNote[i]);
        }
    }
}

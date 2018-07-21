package task6;

public class Note extends NotePad{
    private static String[] noteArr = new String[10];

    public Note(String[] note){
        this.noteArr = note;
    }

    public static void main(String[] args) {
        Note note = new Note(noteArr);

        for(int i = 0; i < 5; i++){
            note.addNote(noteArr);
        }
        note.removeNote(noteArr);
        note.editNote(noteArr, 3);
        note.showNote(noteArr);
    }

}

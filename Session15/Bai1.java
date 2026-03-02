package Session15;

import java.util.Stack;

public class Bai1 {
    public static class EditAction{
        String description;
        String time;

        public EditAction(String description, String time) {
            this.description = description;
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static class MedicalRecordHistory{
        static Stack<EditAction> history =  new Stack<>();
        public void addEdit(EditAction action){
            history.push(action);
        }

        public EditAction undoEdit(){
            return history.pop();
        }

        public EditAction getLatestEdit(){
            return history.peek();
        }

        public boolean isEmpty(){
            return history.isEmpty();
        }

        public void displayHistory(){
            if(isEmpty()){
                System.out.println("History is empty");
                return;
            }
            int i =1;
            for (EditAction editAction : history){
                System.out.println((i++) + ": ");
                System.out.println(editAction.getDescription());
                System.out.println(editAction.getTime());
            }
        }
    }
    public static void main(String[] args) {
        MedicalRecordHistory record = new MedicalRecordHistory();
        record.addEdit(new EditAction("edit 1", "900"));
        record.addEdit(new EditAction("edit 2", "1000"));
        System.out.println(record.undoEdit().getDescription());
        record.addEdit(new EditAction("edit 3", "900"));
        record.addEdit(new EditAction("edit 4", "900"));
        System.out.println(record.getLatestEdit().getDescription());
        record.displayHistory();
    }
}
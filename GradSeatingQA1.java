/**
 * Seat graduating students in rows x column of chairs, snaking direction.
 * 
 * @author Anh Nguyen 
 * @version v.1
 */
public class GradSeatingQA1
{
    public static void main (String[] args)
    { 
        String[] inits = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        int grCount = inits.length;
        int row = (int) (Math.random()*2 * Math.sqrt(grCount)) +1;
        int col = grCount/row + 1;
        System.out.println("RUN 1");
        System.out.println(grCount + " graduating students (in alphabetical order) in " + row + "x" + col + " chairs");
        
        GradSeating seatsI = new GradSeating(inits, grCount, row, col);
        seatsI.doSeating();
        
        System.out.println(seatsI);

        
        String[] names13 = {"Aesha", "Ajay", "Andrew", "Andy", "Anelise", "Angela", "Anny", "Avinash", "Bryce", 
            "Chea", "Cooper", "Edwin", "Erika", "Ishaan", "Jae Won", "James", "Jerome", "Joseph", "Karsten", 
            "Kevin", "Leron", "Manoj", "Matthew R.", "Matthew T.", "Max", "Nicolai", "Nishitha", "Oliver", 
            "Paige", "Paul", "Richard L.", "Richard S.", "Rohan", "Sarah", "Shawn", "Shivanshu", "Sravya", 
            "Taylor", "Utkarsh", "Vihan", "William"};
        
        grCount = names13.length;
        row = (int) (Math.random()*3 * Math.sqrt(grCount)) +1;
        col = grCount/row + 1;
        System.out.println("RUN 2");
        System.out.println(grCount + " graduating students (in alphabetical order) in " + row + "x" + col + " chairs:");
        
        GradSeating seats13 = new GradSeating(names13, grCount, row, col);
        seats13.doSeating();
        
        System.out.println(seats13);
        
        
        String[] names1 = {"Andrew", "Andy", "Anny", "Avinash", "Bryce", "Chea", "Edwin", "Erika", 
            "Ishaan", "Jae Won", "Kevin", "Matthew R.", "Matthew T.", "Max", "Oliver", "Richard S.", 
            "Sarah", "Shawn", "William"};
        
        grCount = names1.length;
        row = (int) (Math.random()*2 * Math.sqrt(grCount)) +1;
        col = grCount/row + 1;
        System.out.println("RUN 3");
        System.out.println(grCount + " graduating students (in alphabetical order) in " + row + "x" + col + " chairs:");
        
        GradSeating seats1 = new GradSeating(names1, grCount, row, col);
        seats1.doSeating();
        
        System.out.println(seats1);        
             
    }
}
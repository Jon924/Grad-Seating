
/**
 * Write a description of class GradSeating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradSeating
{
    // instance variables - replace the example below with your own
    private String[] grads;
    private int gradCount;
    private String[][] chairs;

    /**
     * Constructor for objects of class GradSeating
     */
    public GradSeating(String[] givenGrads, int givenGradCount, int rowCount, int colCount)
    {
        grads = givenGrads;
        gradCount = givenGradCount;
        chairs = new String[rowCount][colCount];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void doSeating()
    {
        int count = 0;
        for(int r=0; r<chairs.length;r++){
            if(r%2==0){
                for(int c=0;c<chairs[0].length;c++){
                   if(count<grads.length){
                    chairs[r][c]=grads[count];
                    count++;
                  }else{
                      break;
                  }
                }
            }else{
                for(int c=chairs[0].length -1;c>=0;c--){
                     if(count<grads.length){
                    chairs[r][c]=grads[count];
                    count++;
                  }else{
                      break;
                    }
                }
            }
        }
    }
    
    public String toString(){
        String rtn="";
        for(int r=0; r<chairs.length;r++){
            for(int c=0;c<chairs[0].length;c++){
                rtn+=chairs[r][c];
                rtn+="\t";
            }
            rtn+="\n";
        }
        return rtn;
    }
}

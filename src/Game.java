public class Game {
        private int counter =0;
        private final int compNumber;
        private int myNumber;

        public Game(){
            compNumber = (int)(Math.random()*100);
        }
        public void setNumber(int n){
            myNumber = n;
        }
        public int isCorrect(){
            if (myNumber == compNumber) {
                return 1;
            } else if (myNumber > compNumber) {
                return 2;
            }else {
                return 3;
            }
        }
        public void setCounter(){
            counter++;
        }
        public void getCounter(){
            System.out.print("Total number of guesses: "+counter);
        }

}

public class Quartet {
    private static int[][] playfield =  {{1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,0,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,0,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1}};

    public static void printField(){ // this is upside down
        for(int a = 0; a < playfield.length; a++){
            for(int b = 0; b < playfield[0].length; b ++){
                System.out.print(playfield[a][b]);
            }
            System.out.println();
        }
    }
    public static void clear(){
        int[][] temp = new int[20][10];
        int layerIncrement = 0;
        printField();
        for(int k = 0; k < playfield.length; k++){
            for(int i = 0; i < playfield[0].length; i++){
                if(playfield[k][i] == 0) {
                    i = 10;
                    temp[layerIncrement]= playfield[k];
                    layerIncrement++;

                }
            }
        }

        playfield = temp;
        printField();



    }
    public static void main(String[] args){

        Quartet.clear();
    }
}



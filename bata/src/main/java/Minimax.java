public class Minimax {
        public int [] Minimax  (int Array[] ){

            int n =Array.length;

            int [] Minimax  = {Array[0] , Array[0]};

            for ( int i=1; i<n; i++){
                if(Array[i] <= Minimax [0])
                    Minimax [0] = Array[i];
                else if (Array[i] >= Minimax [1])
                    Minimax [1] = Array[i];
            }

            return Minimax ;

        }
    }

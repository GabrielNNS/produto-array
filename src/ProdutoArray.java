public class ProdutoArray {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5};
        int[] novoArray = new int[array.length];
        int multiplica;

        for(int num : array){ //Mostra os elementos do array
            System.out.print(num + " ");
        }

        for(int i = 0; i < array.length; i++){
            multiplica = 1;
            for(int y = 0; y < array.length; y++){
                if(i != y){ //Quando o i for diferente y, multipla e guarda o valor em conta
                    multiplica *= array[y];
                }
            }
            novoArray[i] = multiplica; //Guarda o resultado de multiplica no novoArray
            System.out.printf("\nArray [%d] = %d", i+1, novoArray[i]); //Mostra o novoArray em refernência ao indice I
        }

    }
}

public class Contador extends  ParametrosInvalidosException {

    public static int contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1 > n2){
            throw new ParametrosInvalidosException();
        }
        return n2 - n1;
    }
}

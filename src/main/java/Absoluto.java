public class Absoluto {
    public int retornaValorAbsoluto(int valor){
        int res = valor;
        if (valor < 0) {
            res = -valor;
        }
        else if (valor == 0){
            res = 0;
        }
        System.out.println(res);
        return res;
    }
}
public class PixMetodo implements MetodoPagamentoInterface{
    double valorPagamento;
    String metodoPagamento = "Pix";

    public PixMetodo(double valorPagamento){
        this.valorPagamento = valorPagamento;

    }

    @Override
    public double valorCobranca(){
        return valorPagamento;
    }
    @Override
    public String metodoCobranca(){
        return metodoPagamento;
    }

}

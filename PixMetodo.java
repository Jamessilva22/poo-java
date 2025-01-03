public class PixMetodo implements MetodoPagamentoInterface{
    double valorPagamento = 32.50;
    String metodoPagamento = "Pix";

    public PixMetodo(double valorPagamento, String metodoPagamento){
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
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

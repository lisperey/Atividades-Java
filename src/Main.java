public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Carlos", "001V", "Rua: x");
        Produto produtoSemPromo = new Produto("001P",  "...", 10.0, 8.0, false);
        Venda venda1 = new Venda();


        vendedor.setPorcetagem(10.0);
        venda1.setProduto(produtoSemPromo);
        venda1.setVendedor(vendedor);
        venda1.setQuantidadeItens(2);
        venda1.imprimir();

        Produto produtoComPromo = new Produto("002P","...", 100.0, 80.0, true);
        Vendedor vendedor2 = new Vendedor("Eduardo", "002V", "Rua Y");
        Venda venda2 = new Venda();

        vendedor2.setPorcetagem(10.0);
        venda2.setProduto(produtoComPromo);
        venda2.setVendedor(vendedor2);
        venda2.setQuantidadeItens(3);
        venda2.setDesconto(10.0);
        venda2.imprimir();

        Venda venda3 = new Venda();

        venda3.setProduto(produtoComPromo);
        venda3.setVendedor(vendedor2);
        venda3.setDesconto(30.0);
        venda3.setQuantidadeItens(1);
        venda3.imprimir();
    }
}
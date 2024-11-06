let subTotal = 0;
let ListaProdutos = document.getElementById('lista-produtos')
let valorTotal = document.getElementById('valor-total');

function adicionar(){

    let produto = document.getElementById('produto').value;
    let nomeProduto = produto.split('-')[0]
    let precoProduto = produto.split('R$')[1]
    let qtdProdutos = document.getElementById('quantidade').value;

    let preco = qtdProdutos * precoProduto;

    ListaProdutos.innerHTML = ListaProdutos.innerHTML+ ` <section class="carrinho__produtos__produto"> <span class="texto-azul">${qtdProdutos}x</span> ${nomeProduto} <span class="texto-azul">R$${preco}</span>        </section>`

    let total =+ preco;


    valorTotal.textContent = `R$${calculaSoma(total)}`
}

function calculaSoma(total){
    return subTotal += total
}

function limpar(){
    ListaProdutos.innerHTML ='';
    valorTotal.innerHTML ='';
}

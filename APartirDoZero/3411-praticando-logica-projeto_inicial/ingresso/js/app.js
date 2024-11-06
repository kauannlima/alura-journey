function comprar(){
    tipoIngresso = document.getElementById('tipo-ingresso').value;
    quantidade = document.getElementById('qtd').value;

    listaQuantidade = document.getElementById(`qtd-${tipoIngresso}`);

    if(parseInt(listaQuantidade.textContent) >= quantidade){
        listaQuantidade.textContent = parseInt(listaQuantidade.textContent) - quantidade;
    }else{
        alert('O Valor que você deseja comprar excede a quantidade disponível')
    }

}
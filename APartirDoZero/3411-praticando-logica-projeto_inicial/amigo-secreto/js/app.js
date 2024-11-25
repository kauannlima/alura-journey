let amigos = []
let listaDeAmigos;
let listaSorteio;

function adicionar() {
    let amigoAdicionado = document.getElementById('nome-amigo');

    if (amigoAdicionado.value != '') {
        if (!amigos.includes((amigoAdicionado.value).toUpperCase())) {
            amigos.push((amigoAdicionado.value).toUpperCase())

            console.log(amigoAdicionado.value)

            listaDeAmigos = document.getElementById('lista-amigos');
            listaDeAmigos.innerHTML = amigos;
            listaDeAmigos.innerHTML = amigos.join(", ");

            console.log(amigos)
            amigoAdicionado.value = ''
        } else {
            alert('Não é possível incluir um amigo que já foi adicionado')
        }
    }
    else {
        alert('Não é possível incluir um amigo sem nome')
    }
}

function sortear() {
    embaralha(amigos);
    console.log(amigos);

    listaSorteio = document.getElementById('lista-sorteio');

    listaSorteio.innerHTML = "";

    if ((amigos.length % 2) == 0) {
        for (let index = 0; index < amigos.length; index += 2) {
            listaSorteio.innerHTML += `${amigos[index]} -> ${amigos[index + 1]}<br>`;
        }
    } else {
        alert('Não é possível realizar o sorteio com um número ímpar de amigos')
    }

}

function embaralha(lista) {
    for (let indice = lista.length; indice; indice--) {

        const indiceAleatorio = Math.floor(Math.random() * indice);

        [lista[indice - 1], lista[indiceAleatorio]] = [lista[indiceAleatorio], lista[indice - 1]];
    }
}

function reiniciar() {
    listaSorteio.innerHTML = "";
    listaDeAmigos.innerHTML = '';
}
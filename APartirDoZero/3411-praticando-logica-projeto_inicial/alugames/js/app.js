function alterarStatus(n){
    let game = document.getElementById(`game-${n}`)
    let image = game.querySelector('.dashboard__item__img');
    let btn = game.querySelector('.dashboard__item__button');

    if(btn.textContent.includes('Devolver')){
        image.classList.remove('dashboard__item__img--rented');
        btn.classList.remove('dashboard__item__button--return');
        btn.textContent = 'Alugar';
    }else{
        image.classList.add('dashboard__item__img--rented');
        btn.classList.add('dashboard__item__button--return');
        btn.textContent = 'Devolver'; 
    }
}
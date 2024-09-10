function adcionarClasse() {
    const caixa = document.querySelector('#caixa');
    caixa.classList.add('caixa-ativa');
}
document.querySelector('#adcionarClasse').onclick = adcionarClasse;
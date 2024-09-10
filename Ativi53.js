function trocarImagem(){
    const Imagem = document.querySelector('#Imagem');

   Imagem.src = "/Tsugi/Image/Asta.jpg";
}
document.querySelector('#trocarImagem').addEventListener('click',trocarImagem);


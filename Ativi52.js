//Selecionando o texto 
const texto = document.querySelector("#texto");
//Selecionando o botao que sera clicado 
const botao = document.querySelector("#botao");
//Adicionar um evento como se fosse um botao 
botao.addEventListener("click", function(){
if (texto.style.display === "block"){
    texto.style.display = "none";

} else{
    texto.style.display = "block";
}
}

)

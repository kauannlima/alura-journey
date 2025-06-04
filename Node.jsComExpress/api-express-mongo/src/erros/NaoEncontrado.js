import ErroBase from "./ErroBase.js";

class NaoEncontrado extends ErroBase {
  constructor(mensagem = "Página não encontrada! (˘･_･˘)") {
    super(mensagem, 404);
  }
}

export default NaoEncontrado;

import { useState } from "react";
import axios from "axios";

function App() {

  const [nome, setNome] = useState("");
  const [numero, setNumero] = useState("");
  const [dados, setDados] = useState([]);

  function numbersCadastro() {
    axios.post("http://localhost:3001/numbers", {

      nome: nome,
      numero: numero

    })
    .then(() => {
      alert("Cadastrado!");
    })
    .catch(() => {
      alert("Erro");
    });

  }

  function cadastroShow() {
    axios.get("http://localhost:3001/numbers")
    .then((response) => {
      console.log(response.data);
      setDados(response.data);
    })
    .catch(() => {
      alert("Erro");
    });
  }


  return (
    <div>
      <input
        type="text"
        placeholder="Nome do item"
        onChange={(e) => setNome(e.target.value)}
      />
      <input
        type="number"
        placeholder="Quantidade"
        onChange={(e) => setNumero(e.target.value)}
      />
      <button onClick={numbersCadastro}>Enviar</button>
      <button onClick={cadastroShow}>Mostrar</button>
      <ul>
        {dados.map((item) => (
          <li key={item.id}>
            {item.nome}: {item.numero}
          </li>
        ))}
      </ul>
    </div>
  )

}

export default App;
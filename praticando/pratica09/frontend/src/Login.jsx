import { useNavigate } from "react-router-dom";
import { useState } from "react";
import axios from "axios";
import Home from "./Home";


function Login() {

  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");
  const navigate = useNavigate();

  function cadastrar() {

    axios.post("http://localhost:3001/usuarios", {
      email,
      senha
    })
    .then(() => {
      alert("Usuário cadastrado");
    });

  }

  function login() {
    
    axios.post("http://localhost:3001/login", {
      email,
      senha
    })
    .then((res) => {
      if (res.data.length > 0) {
        localStorage.setItem("usuarioId", res.data[0].id);
        localStorage.setItem("email", res.data[0].email);
        alert("Login bem-sucedido");
        navigate("/home");
      } else {
        alert("Email ou senha incorretos");
      }
  });
}

  return (
    <>
      <input
        placeholder="Email"
        type="email"
        onChange={(e) => setEmail(e.target.value)}
      />

      <br />

      <input
        placeholder="Senha"
        type="password"
        onChange={(e) => setSenha(e.target.value)}
      />

      <br />

      <button onClick={cadastrar}>
        Cadastrar
      </button>

        <button onClick={login}>
          Login
        </button>

        
    </>
  );

}

export default Login;
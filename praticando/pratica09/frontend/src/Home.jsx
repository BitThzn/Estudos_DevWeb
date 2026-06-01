import { useState } from "react";
import axios from "axios";

function Home() {

    const usuarioId = localStorage.getItem("usuarioId");
    const email = localStorage.getItem("email");

    const [texto, setTexto] = useState("");
    const [anotacoes, setAnotacoes] = useState([]);

    function carregarAnotacoes() {

        axios.get(
            `http://localhost:3001/anotacoes/${usuarioId}`
        )
        .then((response) => {
            setAnotacoes(response.data);
        })
        .catch((error) => {
            console.error("Erro ao carregar anotações:", error);
        });

    }

    function salvarAnotacao() {

        axios.post(
            "http://localhost:3001/anotacoes",
            {
                texto,
                usuarioId
            }
        )
        .then(() => {

            alert("Anotação salva!");

            setTexto("");

        })
        .catch((error) => {
            console.error(error);
        });

    }

    return (
        <>
            <h1>Bem-vindo, usuário {usuarioId}</h1>

            <h2>Dashboard</h2>

            <input
                value={texto}
                placeholder="Digite uma anotação"
                onChange={(e) => setTexto(e.target.value)}
            />

            <button onClick={salvarAnotacao}>
                Salvar
            </button>

            <button onClick={carregarAnotacoes}>
                Mostrar
            </button>

            <hr />

            <h3>Minhas anotações</h3>

            {anotacoes.map((item) => (
                <div key={item.id}>
                    <p>{item.texto}</p>
                </div>
            ))}

            <hr />

            <p>ID: {usuarioId}</p>
            <p>Email: {email}</p>
        </>
    );
}

export default Home;
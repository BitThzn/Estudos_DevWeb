import { useState, useEffect } from 'react';
import axios from 'axios';

function App() {

    const [fodase, setfodase] = useState('');
    const [caguei, setCaguei] = useState('');

    function tabela_muito_foda() {

        axios.post(
            "http://localhost:3001/tabela_muito_foda",
            {
                fodase,
                caguei
            }
        )
            .then(() => {

                alert("Anotação salva!");

                setfodase("");
                setCaguei("");

            })
            .catch((error) => {
                console.error(error);
            });

    }

    function gettabela_muito_foda() {

        console.log("CLIQUEI NESSA PORRA");

        axios.get("http://localhost:3001/tabela_muito_foda")
            .then((response) => {
                console.log(response.data);
            })
            .catch((error) => {
                console.error(error);
            });
    }
    
    return (
        <>
            <h1>Prática 10</h1>
            <input
                type="text"
                placeholder="Fodase"
                value={fodase}
                onChange={(e) => setfodase(e.target.value)}
            />
            <input
                type="text"
                placeholder="Caguei"
                value={caguei}
                onChange={(e) => setCaguei(e.target.value)}
            />
            <button onClick={tabela_muito_foda}>
                Salvar
            </button>
            <p>eu n to aguentando mais XD </p>



            <button onClick={gettabela_muito_foda}>
                Mostrar essa bosta
            </button>
        </>
    )
}


export default App;

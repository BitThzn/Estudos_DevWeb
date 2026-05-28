const express = require("express");
const cors = require("cors");
const mysql = require("mysql2");

const app = express();

app.use(cors());
app.use(express.json());

const conexao = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "crud"
});

conexao.connect((erro) => {
    if (erro) {
        console.error("Erro ao conectar ao banco de dados:", erro);
    } else {
        console.log("Conectado ao banco de dados MySQL");
    }
});

app.post("/numbers", (req, res) => {
    const numero = req.body.numero;
    const nome = req.body.nome;

    conexao.query(
        "INSERT INTO numbers(numero, nome) VALUES (?, ?)", 
        [numero, nome], 
        (erro, resultado) => {
            if(erro){
                console.log(erro);
                res.status(500).send("Erro");
            } else {
                res.send("Dados cadastrados");
            }
        }
    );        
});


app.get("/numbers", (req, res) => {
    conexao.query("SELECT * FROM numbers", (erro, resultado) => {
        if(erro){
            console.log(erro);
            res.status(500).send("Erro");
        } else {
            console.log(resultado);
            res.send(resultado);
            
        }
    });
});

app.listen(3001, () => {
    console.log("Servidor rodando na porta 3001");
});
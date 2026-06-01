const express = require('express');
const cors = require('cors');
const mysql = require('mysql2');

const app = express();

app.use(cors());
app.use(express.json());

const conexao = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'pratica09'
});

conexao.connect((err) => {
    if (err) {
        console.error('Erro ao conectar ao banco de dados:', err);
        return;
    }

    console.log('Conectado ao banco de dados MySQL');
});

app.listen(3001, () => {
    console.log('Servidor rodando na porta 3001');
});

app.post('/usuarios', (req, res) => {

    const email = req.body.email;
    const senha = req.body.senha;

    conexao.query(
        'INSERT INTO usuarios (email, senha) VALUES (?, ?)',
        [email, senha],
        (erro, resultado) => {

            if (erro) {
                console.log(erro);
                return;
            }

            res.send('Usuário cadastrado');
        }
    );

});

app.post('/login', (req, res) => {

    const email = req.body.email;
    const senha = req.body.senha;

    conexao.query(
        'SELECT * FROM usuarios WHERE email = ? AND senha = ?',
        [email, senha],
        (erro, resultado) => {

            if (erro) {
                console.log(erro);
                return;
            }

            console.log(resultado);

            res.send(resultado);
        }
    );

});

app.post('/anotacoes', (req, res) => {

    const texto = req.body.texto;
    const usuarioId = req.body.usuarioId;

    conexao.query(
        'INSERT INTO anotacoes (texto, usuario_id) VALUES (?, ?)',
        [texto, usuarioId],
        (erro, resultado) => {

            if (erro) {
                console.log(erro);
                return;
            }

            res.send('Anotação criada');
        }
    );

});

app.get('/anotacoes/:usuarioId', (req, res) => {

    const usuarioId = req.params.usuarioId;

    console.log('Usuário recebido:', usuarioId);

    conexao.query(
        'SELECT * FROM anotacoes WHERE usuario_id = ?',
        [usuarioId],
        (erro, resultado) => {

            if (erro) {
                console.log(erro);
                return;
            }

            console.log(resultado);

            res.send(resultado);
        }
    );

});
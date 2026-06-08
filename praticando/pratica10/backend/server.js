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
    database: 'pratica10'
});

conexao.connect((erro) => {
    if (erro) {
        console.error('deu merda');
        return;
    }
    console.log('deu boa caralho');
});

app.listen(3001, () => {
    console.log('ta na caceta da porta 3001');
});

app.post('/tabela_muito_foda', (req, res) => {
    const fodase = req.body.fodase;
    const caguei = req.body.caguei;

    conexao.query(
        'insert into tabela_muito_foda (fodase, caguei) values (?, ?)',
        [fodase, caguei],
        (erro, resultado) => {
            if ( erro) {
              console.log(erro);
                return;
            }
                res.send('n aguento mais');
        }
    );
});

app.get('/tabela_muito_foda', (req, res) => {
    conexao.query('select * from tabela_muito_foda', (erro, resultados) => {
        if (erro) {
            console.log(erro);
            return;
        }
        res.json(resultados);
    });
});

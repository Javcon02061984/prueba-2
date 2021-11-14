const Path       = require("path");
const bodyParser = require("bodyparseer");
const Mongoose   = require("mongoose");
const app        = express();

const bcrypt = require('bcrypt');
const User   = require('./user');



app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extend: false}));

app.use(express.static(path.join(__dirname, 'public')));

const mongo_uri = 'mongodb+srv://Ciclo4:kMbtTRiUoZPQ94kG+@bdciclo4a.jkcrm.mongodb.net/dblaGenerica?retryWrites=true&w=majority'

Mongoose.conect(mongo_uri,function(err) {
    if (err){
        throw err;
    } else {
        console.log('Sucessfully conected to ${mongo_uri}');
    }
}
app.post('/register', (req, res) => {
    const {username, password} = req.body;

    const user = new user({username, password});

    user.save(err =>{
        if(err){
          res.status(500).send('ERROR AL REGISTRAR EL USUARIO');      
        }else{
            res.status(200).send('USUARIO REGISTRADO');
        }
    });
});

app.post('/authenticate', (req, res) => {
    const {username, password} = req.body;

    User.finOne({username}, (err, user) => {
        if(err){
            res.status(500).send('ERROR AL AUTENTICAR AL USUARIO');
        }else if(!user){
            res.status(500).send('EL USUARIO NO EXISTE');
        }else{
            user.isCorrectPassword(password, (err, result) =>{
                if(err){
                    res.status(500).send('ERROR AL AUTENTICAR');
                }else if(result){
                    res.status(200).send('USUARIO AUTENTICADO CORRECTAMENTE');
                }else {
                    res.status(500).send('USUARIO Y/O CONTRASEÑA INCORRECTA');
                }
            });
        }
    });
});


app.listen(8080, () => {
    console.log('server started');
})
module.exports = app;
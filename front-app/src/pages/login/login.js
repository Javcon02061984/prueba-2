import React, { useState } from 'react';
import './login.css';
import Title from './components/title/title.jsx';
import Label from './components/label/label.jsx';
import Input from './components/input/input.jsx';

const Login =() => {

    const [user, setUser] = useState(''); 
    const [password, setPassword] = useState('')
    
    function handleChange (name, value) {
        if (name === 'usuario') {
            setUser(value)
        }else{
            setPassword(value)
        }
    };

    return(
        <div className = 'Login-container'>
            <Title text='text 1'   />
            <Label text='User'     />
            <Input 
                attribute={{
                    id: 'usuario',
                    name: 'usuario',
                    type: 'text',
                    placeholder: 'Ingresa tu usario'
                }} 
                handleChange={handleChange}
            />
            <Label text='Password' />
            <Input 
                attribute={{
                    id: 'password',
                    name: 'password',
                    type: 'password',
                    placeholder: 'Ingresa tu password'
                }} 
                handleChange={handleChange}
            />
        </div>   
    )
};
export default Login;
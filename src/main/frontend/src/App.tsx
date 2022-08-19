import React from 'react';
import LoginForm from "./containers/loginform";
import {useEffect} from "react";
import checkAuth from "./utils/checkAuth";
import {useNavigate} from "react-router-dom"

function App() {
    // TODO: check if user already has token saved in LS
    const navigate = useNavigate();
    useEffect(() => {
        const exist = localStorage.getItem("Bearer");
        if(exist){
            // setIsLogged(true);
           checkAuth().then(auth => {
               console.log(auth)
               if(auth){
                    // reroute
                   navigate("/dashboard")
               }
               else{
                    localStorage.removeItem("Bearer");
               }
           });

        }
    }, [])

  return (
    <main>
        <LoginForm />
    </main>
  );
}

export default App;

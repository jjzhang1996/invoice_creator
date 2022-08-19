import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {MantineProvider} from "@mantine/core";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Dashboard from "./routes/Dashboard";

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <MantineProvider
        withNormalizeCSS
        withGlobalStyles
        theme={{
            // Override any other properties from default theme
            // fontFamily: 'Open Sans, sans serif',
            spacing: { xs: 15, sm: 20, md: 25, lg: 30, xl: 40 },
            colorScheme: "dark"
        }}
    >
       <BrowserRouter>
            <Routes>
                <Route path={"/"} element={<App />} />
                <Route path={"dashboard"} element={<Dashboard />} />
            </Routes>
       </BrowserRouter>
    </MantineProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

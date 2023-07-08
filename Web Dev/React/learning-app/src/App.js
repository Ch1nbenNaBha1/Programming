import React from "react";
import "./App.css";
import NavBar from "./components/navbar";
import Projects from "./pages/Projects";
import Home from "./pages/Home";

function App() {
  let Page;
  switch (window.location.pathname) {
    default:
      Page = <Home />;
      break;
    case "/Projects":
      Page = <Projects />;
      break;
    case "/Home":
      Page = <Home />;
      break;
  }

  return (
    <>
      <NavBar />
      <div className="container">{Page}</div>
    </>
  );
}

export default App;

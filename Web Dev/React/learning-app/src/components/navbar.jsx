import React from "react";
import "./navbar.css";

export default function NavBar() {
  return (
    <nav className="NavBar">
      <a className="site-title" href="/">
        {" "}
        Abid's Portfolio
      </a>
      <ul className="nav-links">
        <li>
          <a href="/Home">Home</a>
        </li>

        <li>
          <a href="/Projects">Projects</a>
        </li>
      </ul>
    </nav>
  );
}

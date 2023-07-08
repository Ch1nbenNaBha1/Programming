import React from "react";
import "./Projects.css";
export default function Projects() {
  return (
    <div className="App">
      <h1 className="page-title">Projects I have done</h1>
      <ul className="list">
        <li className="heading">
          <a
            className="links"
            href="https://github.com/Ch1nbenNaBha1/QuickTasks"
            target="_blank"
          >
            Project 1: Quicktasks
          </a>
        </li>

        <li className="heading">Project 2</li>
        <li className="heading">Project 3</li>
      </ul>

      <h1 className="page-title">Projects I am working on</h1>
    </div>
  );
}

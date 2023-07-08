import React from "react";
import logo from "../logo.svg";

const FunFacts = () => {
  return (
    <div className="FunFacts">
      <img className="ReactLogo" src={logo} alt="reactLogo" />
      <div className="textContainer">
        <div className="heading">
          <h1>Fun Facts About react</h1>
        </div>
        <div className="list">
          <ul>
            <li>Was first released in 2013</li>
            <li>Was originally created by Jordan Walke</li>
            <li>Has well over 100k starts on github</li>
            <li>Is maintained by Facebook</li>
            <li>Is used by Netflix, Instagram, Airbnb, and many more</li>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default FunFacts;

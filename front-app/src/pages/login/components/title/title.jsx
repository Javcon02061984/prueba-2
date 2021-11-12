import React from "react";
import './title.css';

const Title = ({text}) =>{
    return(
        <div className='Title-container'>
          <label className='Title-label'> {text} </label>
        </div>
    )
};
export default Title;
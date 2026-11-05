
  let btn = document.querySelector("button");

  btn.addEventListener("click",function(){
    let h3 = document.querySelector("h3");   // here i access h3
    let randomColor = getRandomColor();
    h3.innerText = randomColor;

    let div = document.querySelector("div"); 
    div.style.backgroundColor = randomColor;

    console.log("color update");
  });

  function getRandomColor() {
    let red = Math.floor(Math.random() * 255);        // generate random color
    let green = Math.floor(Math.random() * 255);
    let blue = Math.floor(Math.random() * 255);

    let color = `rgb(${red},${green},${blue})`;
    return color;
  }
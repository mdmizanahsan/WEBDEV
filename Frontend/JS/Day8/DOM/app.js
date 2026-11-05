   // Add the following elements to the container using only javaScript and the DOM methods.
   // 1) a <p> with red text that says "hey i'm red"
   // 2) an <h3> with blue text that says "i am a blue h3".
   // 3) a <div> with a black border and pink background color with the following element inside of it.
   //     (a) another <h1> that says" i am un a div"
   //     (b) a <p> that says "Me too"

      let para1 = document.createElement('p');
    para1.innerText = "hey I am prince";
    document.querySelector("body").append(para1);

    // add to css
    para1.classList.add("red");

    // 2 ans

      // create element in html 
    let h3 = document.createElement("H3");

    h3.innerText = "i am blue";
    document.querySelector("body").append(h3);

    h3.classList.add("blue");

    // 3 ans
  
    let div = document.createElement("div");
    let h1 = document.createElement("h1");
    let p = document.createElement("p");

    h1.innerText = "i am under a div";
    p.innerText = "Me Too !!"

    div.append(h1);
    div.append(p);

    div.classList.add("box");

    document.querySelector("body").append(div);




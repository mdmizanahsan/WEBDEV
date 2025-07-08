let gameseq = [];
let userseq = [];

let btns = ["yellow","red","pink","green"];

let started = false;
let level = 0;

let h2 = document.querySelector("h2");


document.addEventListener("keypress",function(){
    if(started == false){
        console.log("game start");
        started = true;

        levelUp();
    }
});

    function btnFlash(btn) {
        btn.classList.add("flash");
        setTimeout(function() {
            btn.classList.remove("flash");
        },300);
    }

   function levelUp(){
   level++;
   h2.innerText = `level ${level}`;

      let randomidx = Math.floor(Math.random() * 3);
      let randomcolor = btns[randomidx];
      let randomBtn = document.querySelector(`.${randomcolor}`);

      console.log(randomidx);
            console.log(randomcolor);
      console.log(randomBtn);

   btnFlash(randomBtn);
   }
 

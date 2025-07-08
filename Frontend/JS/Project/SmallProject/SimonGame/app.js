let gameSeq = [];
let userSeq = [];

let btns = ["yellow","red","pink","green"];

let started = false;
let level = 0;

let h2 = document.querySelector("h2");


document.addEventListener("keypress",function() {
    if(started == false){
        console.log("game started");
        started = true;

        levelUp();
    }
});

    function gameFlash(btn) {
        btn.classList.add("flash");
        setTimeout(function() {
            btn.classList.remove("flash");
        },300);
    }
     function userFlash(btn) {
        btn.classList.add("userflash");
        setTimeout(function() {
            btn.classList.remove("userflash");
        },500);
    }

   function levelUp(){
    userseq = [];
   level++;
   h2.innerText = `level ${level}`;

   let randomidx = Math.floor(Math.random() * 3);
   let randomcolor = btns[randomidx];
   let randomBtn = document.querySelector(`.${randomcolor}`);
   gameseq.push(randomcolor);
   console.log(gameseq);
   gameFlash(randomBtn);
   }

   function checkAns() {
    // console.log("curr level : ",level);
       if(userSeq[index] === gameSeq[index]){
        if(userSeq.length == gameSeq.length) {
            levelUp();
        }

    // console.log("same value");
    } else {
       // h2.innerText= `Game over press any to start`;
    }
   }
 
      function btnPress() {
      let btn = this;
      userFlash(btn);

      userColor = btn.getAttribute("id");
      console.log(userColor);

      checkAns(userSeq.length - 1);
    }

      let allBtns = document.querySelectorAll(".btn");
      for(btn of allBtns) {
        btn.addEventListener("click",btnPress);
      }

      function reset() {
        started = false;
        gameSeq = [];

      }

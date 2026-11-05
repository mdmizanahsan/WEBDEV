const max = prompt("Enter the max number");

 const random = Math.floor(Math.random() * max) +1;

  let guess = prompt("guess the number");
    while(true){
        if(guess == random){
            console.log("The number is correct");
            break;
        } else if(guess < random){
            guess = prompt("your guess is small . please try again");
        } else {
            guess = prompt("your guessis large . please try again");
        }
       
        if(guess == "quit"){
            console.log("user quit the game");
            break;
        }
    }

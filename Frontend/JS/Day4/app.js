console.log("***********for loop*************");

for(let i=1; i<= 5;i++){
    console.log(i);
}
 
// print odd number
 console.log("******* print odd number *******");

 for(let i=1; i<=15; i=i+2){
    console.log(i);
 }
 
 console.log("*********While loop**********");
  // print number
  let i =1;
  while(i <= 10){
    console.log(i);
    i++;
  }
  // question 
    let fav = "ironman";
      let guess = prompt("guess my fav movie");
      while((guess != fav) && (guess != "quit")){
        console.log("Wrong");
      guess = prompt("Please try again");
      }
       if(guess == fav){
        console.log("congrats");
       } else{
        console.log("you quit");
       }

    
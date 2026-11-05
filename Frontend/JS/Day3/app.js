let age = 23;
if(age >= 18) {
    console.log("you can vote");
}

// create a system to calculate popcorn prices based on the size customer asked for:
//  if size is 'XL',price is Rs.250
//  if size is 'L',price is Rs.200


    let size = "XL";

     if(size === "XL") {
        console.log("Price is Rs.250");
     }  else if (size === "L"){
        console.log("Price is Rs.200");
     }  else if(size === "M"){
        console.log("Price is Rs.150");
     } else if(size === "S"){
        console.log("Price is Rs.100");
     }

     // example
     let firstname = prompt("Enter first name");
     let lastname = prompt("Enter last name");
          console.log("Welcome",firstname,lastname, "!");
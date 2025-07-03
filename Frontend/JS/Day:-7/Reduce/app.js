  let nums = [1,2,3,4];

  let finalval = nums.reduce((res,el) => res + el);

   console.log(finalval);

   // or
     // if i want to see result

   let num1 = [1,2,3,4,5];

   let result = num1.reduce((res,el) => {
      console.log(res);
      return res + el;
   });

   console.log(result);

   console.log("******* print max number using reduce********");

     let arr = [1,2,34,54,23,66];

     let ans = arr.reduce((max,el) => {
        if(max < el){
            return el;
        }else {
            return max;
        }
     });
     console.log(ans);
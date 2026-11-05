let student = [
    {
        name : "ram",
        marks:90,
    },{
        name : "shyam",
        marks:60,
    },{
        name : "mohan",
        marks:50,
    },
];

   let gpa = student.map((el)  => {
     return el.marks / 10;
   });
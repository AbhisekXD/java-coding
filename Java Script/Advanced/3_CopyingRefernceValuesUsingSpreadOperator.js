var a = [1,2,3,4,5];
//using spread operator to copy reference value
var b = [...a];

console.log(a);
console.log(b);
console.log(" ");

b.pop();
console.log(a);
console.log(b);
console.log(" ");

var obj = {name: "Abhisek"};
var obj2 = {...obj};
console.log(obj);
console.log(obj2);
console.log(" ");

obj2.name = "Abinash";
console.log(obj);
console.log(obj2);






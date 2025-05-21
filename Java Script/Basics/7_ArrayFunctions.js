// adding a last element
var a = [1,2,3,4,5,6,7,8,9];
console.log(a);
a.push(10);
console.log(a);

console.log(" ");
//deleting the last element
var b = [10,20,30,40,50];
console.log(b);
b.pop();
console.log(b);

console.log(" ");
//deleting the first element
var c = [100,200,300,400,500];
console.log(c);
c.shift();
console.log(c);

console.log(" ");
//adding a first element also
var d = [2,4,6,8]
console.log(d);
d.unshift(0);
console.log(d);

console.log(" ");
//deleting the  elements in between
var e = [1,3,5,7,9,11,13,15,17,19];
console.log(e);
e.splice(2,4)
console.log(e);

function abc(){
    for (var i = 0; i < 5; i++) 
    {
    console.log(i);
    }
    console.log(i);
}
abc();
//var is printing the 'i' after the loop becauses it is function scoped

console.log(" ")
function xyz(){
    //we can use also const instead of let
    for (let i = 10; i < 26; i++) 
    {
    console.log(i);
    }
    //console.log(i); -> This line will give an error, cause both 'let' & 'const' are bracecs scoped
}
xyz();


//var adds itself to the window object while let & const doesn't
var express = require('express'); 
var app = express(); 
app.get('/', function(req, res){
    res.send("Hello World 8888 ");  
    console.log("Hello World 8888 ");  
}); 
app.listen('8888');
console.log("nodejs start listen 8888 port!");
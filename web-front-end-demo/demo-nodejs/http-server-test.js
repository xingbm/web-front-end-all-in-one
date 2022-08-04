var http = require("http");
http.createServer(function(request, response) {  
    response.writeHead(200, {"Content-Type": "text/plain"});  
    response.write("Hello World 9999 ");  
    response.end();
}).listen(9999);
console.log("nodejs start listen 9999 port!");
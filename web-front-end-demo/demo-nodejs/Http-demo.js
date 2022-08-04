//引入默认的http模块，require中文意思是得到：
var http = require("http");
var url = require( 'url' );

//创建一个服务器，创建的服务器用于server来引用
//req表示请求request，res表示响应response
var server = http.createServer(function(req,res) {
    //这是一个回调函数，表示当服务器创建成功之后做的时候
    console.log(req.headers);//http上行请求头 user-agent
    console.log(req.headers['user-agent']);
    console.log(req.method); //请求类型 GET POST
    console.log(req.url);
    
    res.writeHead(200,{'Content-Type':'text/plain'})
    res.end("hello,world\n");

    var h_name = req.headers.host;
    var h_path = url.parse( req.url ).pathname;

    if( h_name === 'localhost:8887' && h_path === '/exit' ){
        res.end('Bye!');
        server.close(); 
        console.log( 'Bye!' );
    }

});

// 让服务器监听8080端口，端口是可以任意修改
server.listen(8080, "127.0.0.1");
console.log('服务器创建成功');

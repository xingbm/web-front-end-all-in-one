var fs = require('fs');
/*fs.readFile('readme.txt', 'utf-8', function(err, data){
	if(err){
		console.log(err);
	} else {
		console.log(data);
	}
});*/
var data = fs.readFileSync('readme.txt', 'utf-8');
console.log(data);

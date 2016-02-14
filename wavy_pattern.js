function processData(input) {
    //Enter your code here
    var n = 14;
    var pattern;
    var fslash =  "\u2571";
    var bslash = "\u2572";
    for(var i = 0; i < n; i++){
        pattern = '';
        for (var j = 0; j < n; j++) {
            if(j % 2 === 0){
                pattern += fslash;
            } else {
                pattern += bslash;
            }
        }
        console.log(pattern);
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});

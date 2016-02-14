process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var n = parseInt(readLine());
        var h = [1];
        for(var j=1; j <= n; j++ ) {
            if(j % 2 === 1){
                h[j] = 2 * h[j-1];
            } else {
                h[j] = h[j-1] + 1;
            }
        }
        console.log(h[h.length -1]);
        //H1 = 2H0
        //H2 = H1 + 1
        //H3 = 2*H2
        //H4 = H3 + 1

    }

}

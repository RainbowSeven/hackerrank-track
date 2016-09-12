function processData(input) {
    //Enter your code here
    var tc = input.split('\n');
    var r = Number(tc[0]);
    var c = Number(tc[1]);
    var ar = [];
    var lkUp = [];
    var found = false;

    for(var i = 2, len = tc.length; i < len ; i++){
        ar.push(tc[i].split(' ').map(a=>Number(a)));
        lkUp.push([]);
    } //Make ar
    var max = 0;
    var findOnes =  function (ar, i, j, count, r, c) {
        if(i < 0 || j < 0 || i >= r || j >= c) return 0;
        if(lkUp[i][j]) return 0;
        lkUp[i][j] = true;
        if(ar[i][j] == 0) return 0;
        else return 1 +
            findOnes(ar, i-1, j-1, count, r, c) +
            findOnes(ar, i-1, j, count, r, c) + 
            findOnes(ar, i-1, j+1, count, r, c) + 
            findOnes(ar, i, j-1, count, r, c) + 
            findOnes(ar, i, j, count, r, c) + 
            findOnes(ar, i, j+1, count, r, c) + 
            findOnes(ar, i+1, j-1, count, r, c) + 
            findOnes(ar, i+1, j, count, r, c) + 
            findOnes(ar, i+1, j+1, count, r, c);
    }
    for(i = 0; i < r; i++) {
            for(j = 0; j < c; j++) {
                if(!lkUp[i][j]) 
                    max = Math.max(max, findOnes(ar, i, j, 0, r, c));
            }
     }
        
    console.log(max);
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

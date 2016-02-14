function processData(input) {
    //Enter your code here
    var iAr = input.split('\n');
    var iAr = iAr.slice(1, iAr.length); // input array
    
    var checkOps = function (aStr) {
        var str2Ar = aStr.split('');
        var count = 0, j =0;
        var rvStrAr = str2Ar.slice().reverse();

        for(var i=0, l=str2Ar.length; i<l; i++){
            while (str2Ar[i] != rvStrAr[i]){
                
                if (rvStrAr[i] == 'a'){
                    break;
                }
                if(str2Ar[i] > rvStrAr[i]){
                    xCode = (str2Ar[i].charCodeAt()) - 1;
                    str2Ar[i] = String.fromCharCode(xCode);  
                    continue;
                } else {
                    xCode = (rvStrAr[i].charCodeAt()) - 1;
                    rvStrAr[i] = String.fromCharCode(xCode);
                }
                count += 1;

            }
           
        }
        return count;    
    }
    for(var i = 0, l = iAr.length; i< l; i++){
        console.log(checkOps(iAr[i]));
    }
    //console.log(rStr);
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

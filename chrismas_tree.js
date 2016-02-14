var r = 18;
var br = '';
var t = '*';
var makeRow = function(sym, nSpace){
    var tStr = ''; //temporal string
    var half = nSpace / 2;
    for (var i=0; i< half; i++){
        tStr += ' ';
    }
    tStr += sym;
    for (var j=0; j< half; j++){
        tStr += ' ';
    }
    return tStr;
}
console.log(makeRow('*', 16));
var j = 0;
var sp;
for (var i = 0; i< r; i++){
    j = i + 1;
    if (i === 0){
      console.log(makeRow('0', 16));
      continue;
    }
    if (j % 2 === 1){
       for (var k = 0; k < j; k++){
             br += '0' ; 
        }
    // 1.14: 2:12: 3:10
    //console.log(i);
    sp = 16 - (2*(i/2));
    console.log(makeRow(br, sp));
    }
    br = ''; // reset branch;
}
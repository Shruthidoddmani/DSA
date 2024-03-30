const isAnagram = function(s, t) {
    let str1 = new Map();
    let str2 = new Map();
    if(s.length !== t.length) return false;
    for(let i=0; i< s.length; i++){
        let str1Value = str1.get(s[i]) ? str1.get(s[i]) : 0;
        let str2Value = str2.get(t[i]) ? str2.get(t[i]) : 0;
        str1.set(s[i] , 1 + str1Value);
        str2.set(t[i] , 1 + str2Value);
    }
    for(let x of str1.keys()) {
        if(str1.get(x) !== str2.get(x)) {return false;}
    }
    return true;
};

console.log(isAnagram('anagram', 'nagaram'))
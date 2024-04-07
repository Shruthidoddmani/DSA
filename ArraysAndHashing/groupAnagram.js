// give inputs ----> array of anagram like ['eat', 'ate', 'tan', 'ban', 'nat']
// give outputs ---> [['eat', 'ate'],['tan', 'nat'], ['ban']]

var groupAnagrams = function (strs) {
    const res = new Map();
    for( const str of strs) {
        const sortedStr = str.split('').sort().join('');
        if(res.has(sortedStr)) { res.get(sortedStr).push(str)}
        else res.set(sortedStr, [str]);
    }
    return Array.from(res.values())
};

let checkIsAnagram = groupAnagrams(["eat","tea","tan","ate","nat","bat"])
console.log(checkIsAnagram);
console.log(["a"]) // [["a"]]
console.log(['']) // [['']]
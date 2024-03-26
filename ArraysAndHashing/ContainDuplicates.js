// will check duplicates elements in the given input array
// return true if duplicates present
// return false if duplicates are not present




const conatinDuplicatecheckHandler = (numsArray) => {
// -------------------1st way--------------- time 0{n^2}
        // let isDuplicate = false;
        //     for(let i=0; i < numsArray.length; i++){  
        //             for(let j=i+1; j < numsArray.length; j++){
        //                 console.log(numsArray[i], numsArray[j]);
        //                 if(numsArray[i] === numsArray[j]) return true;
        //         }
        //     }
        //     return isDuplicate;

//  ----------------------2nd way ------------------------time 0(nlogn)
            // let isDuplicate = false;
            // let sortedArray = numsArray.sort();
            // console.log(sortedArray)
            // for(let i=0; i< sortedArray.length ; i++){
            //     if(sortedArray[i] === sortedArray[i+1]) return true;
            // }
            // return isDuplicate

// ---------------------------- 3rd way --------------------------time 0(n) space 0(n) 
// Set is a collection of unique values.Each value can only occur once in a Set.
    const newSetData = new Set();
    let isDuplicate = false
    for(i=0; i< numsArray.length ; i++){
        if(newSetData.has(numsArray[i])) return isDuplicate =  true;
        newSetData.add(numsArray[i]);
    }
    return isDuplicate;
}
console.log(conatinDuplicatecheckHandler([1,2,3,4])); // true
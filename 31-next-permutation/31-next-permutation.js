/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(arr) {
    let N=arr.length;
    
    let peak=findpeak(arr,N);
    
    // console.log(peak)
    
    if(peak==-1){
        console.log(arr.reverse().join(" "))
        return;
    }
    else{
        
    let justG= justgraterthanpeak(arr,peak,N);
        
        [arr[peak],arr[justG]]=[arr[justG],arr[peak]];
    
    revers(arr,peak+1,N-1);
    
    
    console.log(arr.join(" "));
        
    }      
  
};
function findpeak(arr,N){
      let rightpeak=-1;
    for(let i=N-2;i>=0;i--){
        
        if(arr[i]<arr[i+1]){
            rightpeak=i;
            break;
        }
    }
    return rightpeak;
    
}
function justgraterthanpeak(arr,peak,N){
    
    // let justG=Infinity;
    
    for(let i=N-1;i>=0;i--){
        
        if(arr[i]>arr[peak]){
            
           return i;
            
        }
    }
    // return i;
}

function revers(arr,l,r){
    while(l<=r){
        
        let temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    
}

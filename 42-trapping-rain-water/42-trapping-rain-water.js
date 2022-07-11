/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    
    let N=height.length;
    let leftArr=[];
    let rightArr=[];
    let ans=0;
    leftArr[0]=height[0]
    rightArr[N-1]=height[N-1];
    
    for(let i=1;i<N;i++){
        leftArr[i]=Math.max(leftArr[i-1],height[i]);
    }
    
    for(let i=N-2;i>=0;i--){
        rightArr[i]=Math.max(rightArr[i+1],height[i]);
    }
    
    for(let i=0;i<N;i++){
        let h=(Math.min(rightArr[i],leftArr[i]))-height[i];
        ans+=h;
    }
    
    return ans;
};
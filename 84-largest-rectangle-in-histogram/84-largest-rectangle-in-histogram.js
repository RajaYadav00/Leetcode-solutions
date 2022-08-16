var largestRectangleArea = function(arr) {
    arr.push(0)
    const stack = [];
    let maxArea = 0;
    let curr;
    let currH;
    let top; 
    let topH; 
    let area;

    for(let i = 0; i < arr.length; i++) {
        top = stack[stack.length-1];
        topH = arr[top];
        while(stack.length > 1 && topH > arr[i]) {
            curr = stack.pop();
            currH = arr[curr];
            top = stack[stack.length-1];
            topH = arr[top];
            area = currH * (i - 1 - top);
            maxArea = Math.max(area, maxArea);
        }
        
        if(stack.length && topH > arr[i]) {
            curr = stack.pop();
            currH = arr[curr];
            area = currH * i;
            maxArea = Math.max(area, maxArea);
        }
        stack.push(i);
    }
    return maxArea;
};
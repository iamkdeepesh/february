public int[] makeMiddle(int[] nums) {
    int[] a = new int[2];
    if(nums.length>1) {
        a[1]=nums[nums.length/2];
        a[0]=nums[nums.length/2-1];
        return a;
    } else {
        a[2]=nums[((nums.length+1)/2) -1];
    }
    return a;
}
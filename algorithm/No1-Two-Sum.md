Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

##Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

##C-Solution:

int* twoSum(int* nums, int numsSize, int target) {
    int i, j;
    int flag;
    int *result;
    result = (int*)malloc(2*sizeof(int));
    for(i=0;i<numsSize;i++)
    {
        flag=0;
        result[0]=i;
        for(j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                flag=1;
                result[1]=j;
                break;
            }
        }
        if(flag==1)
            break;
    }
    return result;
}
// The problem is to find the smallest integer which is atleast greater than (start) that is divisible by one of the elements of 
// divisors. Example- divisors is [2,3,4] and start is 13 then 14 would be produced as it is divisible by 2. 

int firstMultiple2(int[] divisors, int start) {
    for(int i = start; ; i++){
        int j = 0;
        for(; j < divisors.length; j++){
            if(i % divisors[j] == 0){
                return i;
            }
        }
    }
    //return -1;
}

// The function can easily be changed to find the smallest integer greater than start which is divisible by all the divisors. You
// could make an array at the start of all false values which is of size divisors and then change values to true in the loop if 
// they are divisible. Lastly, you could implement another small function which checks if all values in the array are true and if
// that is the case then you could return that value. 

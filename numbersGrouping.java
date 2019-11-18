// This is another easy problem where you are supposed to put each number of the array (a) into categories which each span 
// across 10000 numbers. So the first category spans across the first 10000 numbers, the second category goes from 10001 - 20000 and 
// so on...


// Ultimate goal is to print the number of lines these numbers would take. The document will have a line for categories and the numbers
// themselves. 

int numbersGrouping(int[] a) {
    HashSet<Integer> hash = new HashSet<Integer>();
    for(int i = 0; i < a.length; i++){
        hash.add((a[i]-1) / 10000);
    }
    return hash.size() + a.length;
}

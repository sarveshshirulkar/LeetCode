class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[10];
        for(int d : digits) freq[d]++;

        for(int i=100; i<999; i += 2){
            int a = i / 100;  // zeros place
            int b = (i / 10) % 10; //ones
            int c = i % 10; // tens

            freq[a]--; freq[b]--; freq[c]--;
            if(freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) list.add(i); 
            freq[a]++; freq[b]++; freq[c]++;

        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
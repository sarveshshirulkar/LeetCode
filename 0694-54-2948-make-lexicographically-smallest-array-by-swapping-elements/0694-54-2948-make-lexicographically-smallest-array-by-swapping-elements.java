class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        List<int[]> indexed = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            indexed.add(new int[]{nums[i], i});
        }
        indexed.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> groups = new ArrayList<>();
        groups.add(new ArrayList<>(Collections.singletonList(indexed.get(0)[1])));

        for (int i = 1; i < nums.length; ++i) {
            if (indexed.get(i)[0] - indexed.get(i - 1)[0] <= limit) {
                groups.get(groups.size() - 1).add(indexed.get(i)[1]);
            } else {
                groups.add(new ArrayList<>(Collections.singletonList(indexed.get(i)[1])));
            }
        }

        for (List<Integer> group : groups) {
            List<Integer> sortedVals = new ArrayList<>();
            for (int i : group) {
                sortedVals.add(nums[i]);
            }
            Collections.sort(sortedVals);
            Collections.sort(group);
            for (int i = 0; i < group.size(); ++i) {
                nums[group.get(i)] = sortedVals.get(i);
            }
        }

        return nums;
    }
}
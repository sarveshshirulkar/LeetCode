class Solution {
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> group) {
        visited[node] = true;
        group.add(node);
        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                dfs(nei, adj, visited, group);
            }
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < s1.length(); i++) {
            int u = s1.charAt(i) - 'a';
            int v = s2.charAt(i) - 'a';
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[26];
        char[] rep = new char[26];

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                List<Integer> group = new ArrayList<>();
                dfs(i, adj, visited, group);

                char minChar = 'z';
                for (int idx : group) {
                    minChar = (char)Math.min(minChar, (char)(idx + 'a'));
                }

                for (int idx : group) {
                    rep[idx] = minChar;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            res.append(rep[ch - 'a'] == 0 ? ch : rep[ch - 'a']);
        }

        return res.toString();
    }
}
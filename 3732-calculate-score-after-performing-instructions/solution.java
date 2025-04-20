class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        int i = 0;
        int n = instructions.length;
        boolean[] visited = new boolean[n];

        while (i >=0 && i < n && !visited[i]) {
            visited[i] = true;
            if (instructions[i].equals("add")) {
                score += values[i];
                i++;
            } else if (instructions[i].equals("jump")) {
                int nextindex = i + values[i];
                if (nextindex < 0 || nextindex >= n){
                    break;
                }
                i = nextindex;
            }else { 
                break;
                    }
            }
        return score;
        }
        public static void main(String[] args) {
            Solution sol = new Solution();
            String[] instructions = {"jump", "add", "add", "jump", "add", "jump"};
            int[] values = {2, 1, 3, 1, -2, -3};
            long result = sol.calculateScore(instructions, values);
            System.out.println(result);
        }
    }


/*
 * There are a total of n courses you have to take, labeled from 0 to n - 1.

 * Some courses may have prerequisites, for example to take course 0 you have 
 * to first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, is it 
 * possible for you to finish all courses?
 * 
 * For example:
 * 
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0. So it is possible.
 * 
 * 2, [[1,0],[0,1]]
 * There are a total of 2 courses to take. To take course 1 you should have 
 * finished course 0, and to take course 0 you should also have finished course 
 * 1. So it is impossible.
 * 
 * Note:
 * The input prerequisites is a graph represented by a list of edges, not 
 * adjacency matrices. Read more about how a graph is represented.
 * 
 * click to show more hints.
 * 
 * Hints:
 * This problem is equivalent to finding if a cycle exists in a directed graph. 
 * If a cycle exists, no topological ordering exists and therefore it will be 
 * impossible to take all courses.
 * Topological Sort via DFS - A great video tutorial (21 minutes) on Coursera 
 * explaining the basic concepts of Topological Sort.
 * Topological sort could also be done via BFS.
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> nodes = new ArrayList<Integer>();
        for (int i = 0; i < prequisites.length; ++i) {
            for (int j = 0; j < prequisites[0].length; ++j) {
                if (!nodes.contains(prequisites[i][j])) {
                    nodes.add(prequisites[i][j]);
                }
            }
        }
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nodes.size(); ++i) {
            map.put(nodes.get(i), new ArrayList<Integer>());
        }
        for (int i = 0; i < prequisites.length; ++i) {
            int key = prequisites[i][0];
            int value = prequites[i][1];
            List<Integer> list = map.get(key);
            list.add(value);
            map.put(key, list);
        }
    }

}

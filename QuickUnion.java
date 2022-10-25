public class QuickUnion {
    private int[] unions;

    public QuickUnion(int number) {
        unions = new int[number];
        for (int i = 0; i < number; i++) {
            unions[i] = i;
        }
    }

    public  void union(int i,int j){
        int rootI = root(i);
        int rootJ = root(j);
        unions[rootI] = rootJ;
    }

    private int root(int i) {
        if (unions[i] == i) return i;
        else return root(unions[i]);
    }

    public  boolean connected(int i,int j){
        return root(i)==root(j);
    }
}

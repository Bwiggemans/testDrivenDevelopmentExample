public class Counter {

    private int count = 0;

    public void add(int ammount){
        this.count += ammount;
    }

    public void add(){
        this.add(1);
    }

    public int current(){
        return this.count;
    }

    public String toString(){
        return "" + this.count;
    }
}

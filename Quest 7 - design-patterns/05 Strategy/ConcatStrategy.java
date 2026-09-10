public class ConcatStrategy implements OperationStrategy {
    public ConcatStrategy() {}
    public int execute(int a, int b) {
        return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
    }
}

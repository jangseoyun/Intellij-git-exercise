package codelion.week3.day14.file;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove() {
    }
    public PopulationMove(String fromSidoStr, String toSidoStr) {
        this.fromSido = Integer.parseInt(fromSidoStr);
        this.toSido = Integer.parseInt(toSidoStr);
    }

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

}

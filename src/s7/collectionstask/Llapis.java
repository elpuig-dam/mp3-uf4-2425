package s7.collectionstask;

public class Llapis implements Comparable<Llapis>{
    private int color;
    private float gruix;

    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    public Llapis(int color) {
        this.color = color;
        this.gruix = 1.0f;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }

    @Override
    public int compareTo(Llapis o) {
        if(color < o.getColor()) return -1;
        else if(color > o.getColor()) return 1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Llapis)) return false;

        Llapis llapis = (Llapis) o;

        return  getColor() == llapis.getColor();
    }

    @Override
    public int hashCode() {
        return getColor();
    }
}

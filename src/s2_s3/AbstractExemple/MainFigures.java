package s2_s3.AbstractExemple;

public class MainFigures {

    public static void main(String[] args) {
        Figure[] figureList = new Figure[10];
        for(int i=0; i<5; i++) {
            figureList[i] = new Circle((float) (Math.random()*10));
            figureList[9-i] = new Rectangle((float) Math.random()*4, (float) Math.random()*4);
        }

        for(Figure f : figureList) {
            System.out.print(f);
            System.out.println(" Àrea: " + f.getArea());
        }

    }
}

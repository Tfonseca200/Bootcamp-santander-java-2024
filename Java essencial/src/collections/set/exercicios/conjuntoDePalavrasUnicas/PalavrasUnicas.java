package collections.set.exercicios.conjuntoDePalavrasUnicas;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PalavrasUnicas{

   private String palavrasUnicas;

   public PalavrasUnicas(String palavrasUnicas){
       this.palavrasUnicas = palavrasUnicas;
   }

    public String getPalavrasUnicas() {
        return palavrasUnicas;
    }

    public void setPalavrasUnicas(String palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "palavrasUnicas='" + palavrasUnicas + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PalavrasUnicas that)) return false;
        return Objects.equals(getPalavrasUnicas(), that.getPalavrasUnicas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavrasUnicas());
    }
}


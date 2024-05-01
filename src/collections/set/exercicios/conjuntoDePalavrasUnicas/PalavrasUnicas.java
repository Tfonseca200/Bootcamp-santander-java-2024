package collections.set.exercicios.conjuntoDePalavrasUnicas;
import java.util.Objects;

public class PalavrasUnicas {

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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PalavrasUnicas other = (PalavrasUnicas) obj;
        return palavrasUnicas.equals(other.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavrasUnicas());
    }
}


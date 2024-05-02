import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private Integer age;

    // Constructeurs, getters et setters (omis pour la brièveté)

    public Etudiant() {
    }

    public Etudiant(String nom, Integer age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters et setters
}
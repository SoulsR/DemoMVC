import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestDemoDataController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    public void testCrudOperations() {
        // Création d'un étudiant
        Etudiant etudiant = new Etudiant("Francis Cabrel", 25);
        etudiantRepository.save(etudiant);

        // Lecture
        Etudiant retrievedEtudiant = etudiantRepository.findById(etudiant.getId()).orElse(null);
        assertEquals("Francis Cabrel", retrievedEtudiant.getNom());

        // Mise à jour
        retrievedEtudiant.setAge(30);
        etudiantRepository.save(retrievedEtudiant);
        assertEquals(30, retrievedEtudiant.getAge());

        // Suppression
        etudiantRepository.deleteById(etudiant.getId());
        assertEquals(0, etudiantRepository.count());
    }
}
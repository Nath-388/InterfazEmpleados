package ModuloUtillidades;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorIDs {
     private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int ID_LENGTH = 8;
    private static final Random random = new Random();
    private static Set<String> generatedIds = new HashSet<>();

    public static String generateUniqueId() {
        String id;
        do {
            StringBuilder sb = new StringBuilder(ID_LENGTH);
            for (int i = 0; i < ID_LENGTH; i++) {
                sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }
            id = sb.toString();
        } while (generatedIds.contains(id));
        
        generatedIds.add(id);
        return id;
    }
    
    public static void addExistingId(String id) {
        generatedIds.add(id);
    }
}

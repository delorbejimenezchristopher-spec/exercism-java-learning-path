import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    // Un Set elimina los duplicados automáticamente.
    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    // Set.add devuelve true solo si la carta no estaba en la colección.
    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    // Se puede intercambiar si cada uno tiene al menos una carta que el otro no tiene.
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !theirCollection.containsAll(myCollection)
                && !myCollection.containsAll(theirCollection);
    }

    // Intersección de todas las colecciones.
    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;
    }

    // Unión de todas las colecciones.
    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
    }
}

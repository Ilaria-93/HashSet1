/*Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = createHashSet();

        String element = "Mouse";

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String nextElement = iterator.next();
            if (nextElement.equals(element)) {
                iterator.remove();
            }
        }

        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);
    }

    public static HashSet<String> createHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Elephant");

        return hashSet;
    }
}
package pract5;
/**
 * Clase SetString. Implementación de un conjunto de String mediante 
 * una secuencia enlazada ordenada lexicográficamente.
 *
 * @author PRG - Parcial 2
 * @version Curso 2023/24
 */
public class SetStringExam {    
    private NodeString first;
    private int size;

    /**
     * Crea un conjunto vacío.
     */
    public SetStringExam() {
        this.first = null;
        this.size = 0;
    }

    /**
     * Inserta s en el conjunto.
     * Si s ya pertenece al conjunto, el conjunto no cambia.
     * @param s String, elemento que se inserta en el conjunto.
     */
    public void add(String s) {
        NodeString aux = this.first;
        NodeString prev = null;
        int compare = -1; // el valor de la comparacion
        while (aux != null && compare < 0) {
            compare = aux.data.compareTo(s); 
            if (compare < 0) {
                prev = aux;
                aux = aux.next;
            } 
        } // aux == null o s anterior o igual a aux.data  

        if (compare != 0) { // s menor que aux.data o s mayor que todos
            NodeString node = new NodeString(s, aux);
            if (aux == this.first) {
                this.first = node;
            } else { prev.next = node; }
            this.size++;
        }
    }

    /**
     * Devuelve la talla o cardinal del conjunto.
     * @return la talla del conjunto.
     */
    public int size() { return this.size; }

    /**
     * Devuelve el listado de los Strings en el conjunto, en orden
     * lexicográfico, y separados por saltos de línea.
     * Si el conjunto es vacío devuelve "", la String vacía.
     * @return el listado de los elementos del conjunto.
     */
    public String toString() {
        String result = "";
        NodeString aux = this.first;
        while (aux != null) {
            result += aux.data + "\n"; 
            aux = aux.next; 
        }
        return result;
    }

    /** Elimina del conjunto todas las palabras que contengan el substring dado. 
     *  @param str String, substring de las palabras a eliminar.
     *  Precondición: str.length() >= 1.
     */ 
    public void removeContains(String str) {
        /* COMPLETAR */
        
        NodeString aux = this.first;
        NodeString ant = null;
        
        boolean res = false;
        
        while (aux != null) {
            res = aux.data.contains(str);
            
            if (res) {
                if (ant == null) { first = first.next; }
                else { ant.next = aux.next; }
                aux = aux.next;
                size--;
            }
            else {
                ant = aux;
                aux = aux.next;
            }
        }  
    }
}

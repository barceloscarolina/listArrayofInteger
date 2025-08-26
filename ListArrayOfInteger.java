public class ListArrayOfInteger {

    private static final int INICIAL_SIZE = 10;
    private Integer[] data;
    private int count;

    public ListArrayOfInteger(int tam) {
        if (tam <= 0) {
            tam = INICIAL_SIZE;
        }

        data = new Integer[tam];
        count = 0;
    }

    public ListArrayOfInteger() {
        this(INICIAL_SIZE);
    }

    // exclui o objeto ao fazer uma nova referencia com o mesmo nome
    public void clear() { // O(1)
        data = new Integer[INICIAL_SIZE];
        count = 0;
    }

    public boolean isEmpty() { // O(1)
        return (count == 0);
    }

    public int size() { // O(1)
        return count;
    }

    public void add(Integer element) { // O(n)

        if (count == data.length) {
            setCapacity(data.length * 2);
        }

        data[count] = element;
        count++;

    }

    public Integer get(int index) { // O(1)

        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("ERRO" + index);
        }

        return data[index];
    }

    public void setCapacity(int newCapacity) { // O(n)
        if (newCapacity != data.length) {
            int min = 0;
            Integer[] newData = new Integer[newCapacity];
            if (data.length < newCapacity) {
                min = data.length;
            } else {
                min = newCapacity;
            }
            for (int i = 0; i < min; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

    }

    public String toString() { // O(n)
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(data[i]);
            if (i != (count - 1)) {
                s.append(",");
            }
        }
        s.append("\n");
        return s.toString();
    }

    public boolean remove(Integer valor_a_remover) { // O(n)

        for (int i = 0; i <= count; i++) {

            if (valor_a_remover.equals(data[i])) {

                for (int j = i; j <= count - 2; j++) {

                    data[j] = data[j + 1];

                }

                data[count - 1] = null;

                count--;

                return true;

            }

        }

        return false;

    }

    public int set(Integer novo_valor, int index_desejado) { // O(1)

        Integer valor_anterior = data[index_desejado];

        data[index_desejado] = novo_valor;

        return valor_anterior;

    }

    public boolean contains(Integer valor) { // O(n)

        for (int i = 0; i <= count; i++) {

            if (data[i] == valor) {
                return true;
            }

        }

        return false;

    }

}

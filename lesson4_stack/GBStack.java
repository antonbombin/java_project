package lesson4_stack;


//Реализовать стэк с помощью масива.
//Нужно реализовать методы:
//size() - возврат. размер
//isEmpty() - пуст ли стэк
//push() - добавить на вершину
//peek() - вернуть верхний
//pop() - возвр. верхний и удалить его


public class GBStack<T> {

    private int size = 0;
    private int capacity = 2;
    private int top = -1;
    private int[] stack = new int[capacity];

    private void addCapacity() {

        capacity = capacity * 2;
        int[] copy = new int[capacity];
        System.arraycopy(stack, 0, copy, 0, size); // откуда, с какой позиции копируем, куда копируем
        // с какой позиции вставляем, сколько вставляем
        stack = copy; // на этом моменте сборщик мусора(GarbageCollector) сам удалит старый массив
    }

    public boolean isEmpty() {
        return size == 0;
        // return top == -1;
    }

    public int size() {
        return size;
    }

    public void push(int value) {
        if (isFull()) {
            addCapacity();
        }
        stack[++top] = value; //top++
        size++; //size += 1;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[top];
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        size--;
        capacity = capacity - 1;

        return stack[top--];
    }

    private boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(stack[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}


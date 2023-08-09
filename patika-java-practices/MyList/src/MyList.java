//Collection kullanmadan kendi list sınıfımızı yazalım.
public class MyList<T> {
  private T[] arr;
  private int capacity;
  private int size;

  public MyList() {
    this.capacity = 10;
    this.size = 0;
    this.arr = (T[]) new Object[this.capacity];
  }
  public MyList(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.arr = (T[]) new Object[this.capacity];
  }
  public int size(){
    return arr.length;
  }
  public int getCapacity(){
    return this.capacity;
  }
  public void add(T data){
    if(this.size == this.capacity){
      this.capacity *= 2;
      T[] temp = (T[]) new Object[this.capacity];
      for(int i = 0; i < this.size; i++){
        temp[i] = this.arr[i];
      }
      this.arr = temp;
    }
    this.arr[this.size] = data;
    this.size++;
  }
  public T get(int index){
    if(index < 0 || index >= this.size){
      throw new ArrayIndexOutOfBoundsException("Index out of bounds exception. Index: " + index);
    }
    return this.arr[index];
  }
  public void remove(int index){
    if(index < 0 || index >= this.size){
      throw new ArrayIndexOutOfBoundsException("Index out of bounds exception. Index: " + index);
    }
    for(int i = index; i < this.size - 1; i++){
      this.arr[i] = this.arr[i + 1];
    }
    this.size--;
  }
  public void set(int index, T data){
    if(index < 0 || index >= this.size){
      throw new ArrayIndexOutOfBoundsException("Index out of bounds exception. Index: " + index);
    }
    this.arr[index] = data;
  }
  public String toString(){
    for(int i = 0; i < this.size; i++){
      System.out.print(this.arr[i] + " ");
    }
    return "";
  }
  public int indexOf(T data){
    for(int i=0;i<this.size;i++){
      if(this.arr[i]==data){
        return i;
      }
    }
    return -1;
  }
  public boolean isEmpty(){
    return this.size == 0;
  }
  public boolean contains(T data){
    return this.indexOf(data) != -1;
  }
  public void clear(){
    this.size = 0;
  }
  public void addAll(MyList<T> list){
    for(int i = 0; i < list.size; i++){
      this.add(list.get(i));
    }
  }
}

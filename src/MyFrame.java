class SimplePair<T>{
    T fruit1;
    T fruit2;
    public SimplePair(T fruit1, T fruit2){
       this.fruit1=fruit1;
        this.fruit2=fruit2;
    }
    public T getFirst(){
        return fruit1;
    }
    public T getSecond(){
        return fruit2;
    }
}
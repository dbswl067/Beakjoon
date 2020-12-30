class Test {
    long sum(int[] a){
        long sm = 0;
        for(int i = 0; i < a.length; i++){
            sm += a[i];
        }
        return sm;
    }
}
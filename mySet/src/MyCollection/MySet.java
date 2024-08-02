package MyCollection;


public class MySet implements MyCollection {

    MyArrayList myArrayList = new MyArrayList();
    private final boolean isEmpty = true;
    private int size;

    @Override
    public void add(Object e) {
        size++;
        myArrayList.add(e);
    }
//        if(myArrayList.contains(e)) myArrayList.isEmpty();
//        else { myArrayList.add(e); size++;}
//
//    }
////
////    private void ensureUniqueValues(Object e){
////        for(Object itemsInList : myArrayList.myArrayList){
////            if(myArrayList.contains(itemsInList)){
////                myArrayList.remove(itemsInList);
////                size--;
////            }
////        }
////    }
    @Override
    public void remove(Object e) {
        size--;
            if (myArrayList.contains(e)) {
               myArrayList.remove(e);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int e) {
        return myArrayList.get(e);
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) return false;
        return isEmpty;
    }

    @Override
    public Object[] clear() {
        return myArrayList.clear();
    }

//    public Integer findIndexOf(String element) {
//        for(int counter = 0; counter < myArrayList.length; counter++){
//            if(element.equals(myArrayList[counter])) return counter;
//        }
//        return 0;
//    }

    @Override
    public void increaseCapacity() {

    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

}

package org.example.Lesson_21_11.Range;


public class IteratorRange {
    public static void main(String[] args) {
        for (int i : Range.fromTo(1, 99)) {
            System.out.print(i + " ");
        }
    }

    public static class Range implements Iterable<Integer> {

        public Range(int low, int high) {
            this.low = low;
            this.high = high;
        }

        private int low;
        private int high;

//        два поля
      public  static Range fromTo(int low, int high){
          return new Range(low, high);
      }

//        void fromTo(){
////            for (Integer t : this)      action.accept(t);
//        }

        @Override
        public Iterator iterator() {
            return new Iterator(this);
        }
    }

    static class Iterator implements java.util.Iterator<Integer> {

        public Iterator(Range range) {
            this.count = range.low;
            this.range = range;
        }

        //   одно поле
        private Range range;
        private int count;


        @Override
        public boolean hasNext() {
            return count <= range.high;
        }

        @Override
        public Integer next() {
            return count++;
        }
    }

}



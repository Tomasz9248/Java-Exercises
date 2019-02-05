package Algorithms.BinarySearch;

public class Algorithm {

    public int find (long searchKey, int[] a) {
        int lowerBound =0; // for odered array 1st element has the lowest value
        int upperBound =  a.length -1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) /2; // half divide an array
            if (a[currentIndex] == searchKey) {
                return currentIndex; // if we're looking for a middle element we found it
            } else if (lowerBound > upperBound) {
                return a.length;       //can't find searchKey
            }
            else {
                if (a[currentIndex] < searchKey) { // we know searchKey is in upper half
                    lowerBound = currentIndex +1; //  so we increment lower bound to currentIndex
                } else {
                    upperBound = currentIndex -1; // we know searchKey is in lower half so we decrement upperBound
                } // the method continue to split array in half to narrow down possible solution till it finds searchKey
            }
        }
    }
}

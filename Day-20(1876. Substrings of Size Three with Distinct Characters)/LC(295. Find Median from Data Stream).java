import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> maxHeap;// to store the smaller half of the numbers
    PriorityQueue<Integer> minHeap;// to store the larger half of the numbers

    public MedianFinder() {

        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max heap to store the smaller half of the numbers
        minHeap = new PriorityQueue<>();// min heap to store the larger half of the numbers
    }

    public void addNum(int num) {

        maxHeap.offer(num);// add number to max heap
        minHeap.offer(maxHeap.poll());// move the largest number from max heap to min heap

        if (maxHeap.size() < minHeap.size()) {//        balance the heaps if min heap has more elements than max heap
            maxHeap.offer(minHeap.poll());// move the smallest number from min heap to max heap if min heap has more elements than max heap
        }
    }

    public double findMedian() {

        if (maxHeap.size() > minHeap.size()) {// if max heap has more elements than min heap, the median is the top of the max heap
            return maxHeap.peek();// return the top of the max heap as the median
        }

        return (maxHeap.peek() + minHeap.peek()) / 2.0;// if both heaps have the same number of elements, the median is the average of the tops of both heaps
    }
}
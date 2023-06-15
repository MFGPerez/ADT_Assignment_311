package utilities;

import java.util.ArrayList;
import java.util.Collections;

import comparators.CompareByBaseArea;
import comparators.CompareByVolume;
import shapes.Shape;

/**
 * Class description: class containing various sorting algorithms for shapes.
 * bubbleSort, insertionSort, selectionSort, quickSort, one unique sort these
 * algorithms will rely on compateTo(), compareBaseArea, CompareByVolume for
 * logic
 *
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 */
public class SortingAlgorithms {

	private Shape[] inputArray;
	
	private final int SHAPE_ARRAY_SIZE;
	private char argForCompare; 
	private long timeTakenInMs; 

	/**
	 * Description: SortingAlgorithms constructor 
	 * 
	 * Pre-Conditions: must have shape array 
	 * 
	 * Post-Condition: Initialize the newly created SortingAlgorithms object 
	 * 
	 * @param array - array of type shape 
	 */
	public SortingAlgorithms(Shape[] array, char arg) {
		
		this.inputArray = array;
		argForCompare = arg; 
		SHAPE_ARRAY_SIZE = array.length;

	}

	// use these for algorithms

	CompareByBaseArea compareBaseArea = new CompareByBaseArea();

	CompareByVolume compareVolume = new CompareByVolume();

	/*
	 * outer loop is for how many times the inner loop will execute it moves to the
	 * next element in the array then the inner loop swaps the element we are on to
	 * all the other elements in the array
	 */
	
	/**
	 * Description: bubble sort method 
	 * 
	 * Pre-Conditions: SortingAlgorithms object created
	 *  
	 * Post-Condition: array is sorted largest to smallest 
	 * 
	 * @param debugLevel - debugger used for development 
	 */
	public void bubbleSort(Debug debugLevel) { // works - sorts by shape height

		// char arg
		long startTime = System.nanoTime();

		for (int i = 0; i < SHAPE_ARRAY_SIZE - 1; i++) {

			/*
			 * inner loop searches through array and pushes up the largest number to the end
			 * then loop ends, j then increases and the inner array skipps the last number
			 * since its already where it needs to be.
			 */

			for (int j = 0; j < SHAPE_ARRAY_SIZE - 1; j++) {

				/* these vars could be the issue */
				// int currentIndex = inputArray[j]; // index 0
				// int nextIndex = inputArray[j + 1]; // index 0 + 1

			
				if (argForCompare == 'h') {
					
					// inputArray[j].compareTo(inputArray[j + 1]) > 1 // smallest to largest
					if (inputArray[j].compareTo(inputArray[j + 1]) <= -1) { // largest to smallest

						swap(inputArray, j, j += 1);

						

					}
					
				   }
	               else if (argForCompare == 'a') {
						
                      if (compareBaseArea.compare(inputArray[j], inputArray[j + 1])  <= -1) {
							
							swap(inputArray, j, j += 1);
							
						} 
                      
						
						
					}
	               else if (argForCompare == 'v') {
	            	   
	            	   if (compareVolume.compare(inputArray[j], inputArray[j + 1])  <= -1) {
							
							swap(inputArray, j, j += 1);
							
						} 
	               }
				
						
					

				}
				
				
			}
		
		//debugLevel.output(1, "Finished");

		/* NOT WORKING */
		long endTime = System.nanoTime(); // time ended
		timeTakenInMs = (endTime - startTime) / 1000000; 
		

	}

	/**
	 * Description: selectionSort method 
	 * 
	 * Pre-Conditions: SortingAlgorithms object created 
	 * 
	 * Post-Condition: array is sorted largest to smallest 
	 * 
	 * @param debugLevel - debugger used for development 
	 */
	public void selectionSort(Debug debugLevel) { // works - sorts by shape height

		long startTime = System.nanoTime();

		// sets the min to be the element in the array at i
		for (int i = 0; i < SHAPE_ARRAY_SIZE - 1; i++) {

			// start at fist element
			// int currentMin = i; // make this element the minimum

			int currentLargest = i;
			/*
			 * loop through the array just serching for the smallest element at index i + 1
			 * (index 1)
			 */
			for (int j = i + 1; j < SHAPE_ARRAY_SIZE; j++) {

				Shape currentElement = inputArray[j]; // element at index 1

				/*
				 * if the element is smaller than our minimum set the element to be the new
				 * minimum we are looking through the array for the smallest num
				 */
			
				
				
				if (argForCompare == 'h') {
					
					// currentElement.compareTo(inputArray[currentMin]) <= -1 smallest to largest
					if (currentElement.compareTo(inputArray[currentLargest]) >= 1) { // largest to smallest

						currentLargest = j; // set the min to be the smallest element


					}
					
				   }
	               else if (argForCompare == 'a') {
						
                      if (compareBaseArea.compare(currentElement, inputArray[currentLargest])  >= 1) {
							
                    	  currentLargest = j;
							
						} 
                      
						
						
					}
	               else if (argForCompare == 'v') {
	            	   
	            	   if (compareVolume.compare(currentElement, inputArray[currentLargest])   >= 1) {
							
	            		   currentLargest = j;
							
						} 
	               }
				
				
				
				// debugLevel.output(1, "how man min asssigned " + minCounter);
			}

			/*
			 * once minimum is found we exsit inner loop and swap the min with the element
			 * in the first index
			 */
			swap(inputArray, currentLargest, i);
		}

		
		long endTime = System.nanoTime(); // time ended
		timeTakenInMs = (endTime - startTime) / 1000000; 

	}

	/**
	 * Description: insertionSort method 
	 * 
	 * Pre-Conditions: SortingAlgorithms object created 
	 * 
	 * Post-Condition: array is sorted largest to smallest 
	 * 
	 * @param debugLevel - debugger used for development 
	 */
	public void insertionSort(Debug debugLevel) {

		long startTime = System.nanoTime();

		for (int i = 0; i < SHAPE_ARRAY_SIZE - 1; i++) {

			
	
			if (argForCompare == 'h') {
				
				// inputArray[j].compareTo(inputArray[j + 1]) > 1 // smallest to largest
				if (i >= 0 && inputArray[i].compareTo(inputArray[i + 1]) <= -1) { // largest to smallest

					swap(inputArray, i + 1, i);

					i = i - 1; // lets us move backwards

				}
				
			   }
               else if (argForCompare == 'a') {
					
                  if (compareBaseArea.compare(inputArray[i], inputArray[i + 1])  <= -1) {
						
                	  swap(inputArray, i + 1, i);

  					  i = i - 1; // lets us move backwards

						
					} 
                  
					
					
				}
               else if (argForCompare == 'v') {
            	   
            	   if (compareVolume.compare(inputArray[i], inputArray[i + 1])  <= -1) {
						
            		   swap(inputArray, i + 1, i);

   					   i = i - 1; // lets us move backwards

 						
						
					} 
               }
			
			
			
		}

		long endTime = System.nanoTime(); // time ended
		timeTakenInMs = (endTime - startTime) / 1000000; 

	}
	
	
	public void quickSort(Debug debugLevel) {
	  
		
		long startTime = System.nanoTime();
		
	    doQuickSort(inputArray, 0, SHAPE_ARRAY_SIZE - 1,  argForCompare);
	    
	    long endTime = System.nanoTime(); // time ended
	    timeTakenInMs = (endTime - startTime) / 1000000; 
	}

	 

	private void doQuickSort(Shape[] array, int start, int end,  char arg) {
		
	    int firstIndexOfRightPart = partition(array, start, end, argForCompare);
	    // If the right partition starts immediately after the start index,
	    // there is only one element in the left partition, so there is no need to sort it.
	    // Therefore, we recursively call this function only when the right partition has a difference of more than one from the start index.
	    if (start < firstIndexOfRightPart - 1) {
	        // This is the current left partition; the start index remains the same, and the end index is adjusted to just before the start of the right partition.
	        doQuickSort(array, start, firstIndexOfRightPart - 1,  arg);
	    }
	    // And only if the right partition has one or more elements, we call it.
	    // Sort the right partition only if the start index of the right partition is smaller than the end of the array.
	    if (firstIndexOfRightPart < end) {
	        // Adjust the start value to the beginning of the right partition.
	        doQuickSort(array, firstIndexOfRightPart, end, arg);
	    }
	}

	 

	private int partition(Shape[] array, int start, int end, char arg) {
	    // The value at the middle of the array.
	    Shape pivot = array[(start + end) / 2];
	    // Move the pointers one step forward from both ends repeatedly
	    // as long as the start index is less than or equal to the end index.
	    while (start <= end) {
	        // If the value at the start pointer is greater than the pivot value, ignore it and continue moving forward.
	        // If the value in the array is less than or equal to the pivot value, stay in that position.
	    	if (arg == 'h') {
	    		
	    		 while (array[start].compareTo(pivot) > 0) {
	 	            start++;
	 	        }
	 	        // If the value at the end pointer, starting from the back, is less than the pivot value, ignore it and continue moving forward.
	 	        // If the value in the array is greater than or equal to the pivot value, exit the loop.
	 	        while (array[end].compareTo(pivot) < 0) {
	 	            end--;
	 	        }
	 	        // Make sure that the start and end pointers do not pass each other.
	 	        // If the two values eventually meet or pass each other, the start pointer contains the index for the new right partition, and we return it.
	 	        if (start <= end) {
	 	            swap(array, start, end);
	 	            start++;
	 	            end--;
	 	        }
	    	}
	    	else if (arg == 'a') {
	    		
	    		 while (compareBaseArea.compare(array[start], pivot) > 0) {
		 	            start++;
		 	        }
		 	        // If the value at the end pointer, starting from the back, is less than the pivot value, ignore it and continue moving forward.
		 	        // If the value in the array is greater than or equal to the pivot value, exit the loop.
		 	        while (compareBaseArea.compare(array[end], pivot)  < 0) {
		 	            end--;
		 	        }
		 	        // Make sure that the start and end pointers do not pass each other.
		 	        // If the two values eventually meet or pass each other, the start pointer contains the index for the new right partition, and we return it.
		 	        if (start <= end) {
		 	            swap(array, start, end);
		 	            start++;
		 	            end--;
		 	        }
	    	}
	    	else if (arg == 'v') { 
	    		

	    		 while (compareVolume.compare(array[start], pivot) > 0) {
		 	            start++;
		 	        }
		 	        // If the value at the end pointer, starting from the back, is less than the pivot value, ignore it and continue moving forward.
		 	        // If the value in the array is greater than or equal to the pivot value, exit the loop.
		 	        while (compareVolume.compare(array[end], pivot)  < 0) {
		 	            end--;
		 	        }
		 	        // Make sure that the start and end pointers do not pass each other.
		 	        // If the two values eventually meet or pass each other, the start pointer contains the index for the new right partition, and we return it.
		 	        if (start <= end) {
		 	            swap(array, start, end);
		 	            start++;
		 	            end--;
		 	        }
	    	}
	       
	    }
	    return start;
	}

	/**
	 * Description: quickSort method 
	 * 
	 * Pre-Conditions: SortingAlgorithms object created 
	 * 
	 * Post-Condition: array is sorted largest to smallest 
	 * 
	 * @param debugLevel - debugger used for development 
	 */
	public void oldQuickSort(Debug debugLevel) {

		// sorted array can cause isues - make it longer to sort - you will keep picking
		// the highest num if you do pivot at the end
		// get pivot - random
		// compare all number to pivot
		// iff there less put them in left then biigger go right
		// repeat for each side - till we get one

		// get pivot via dividing - usually random
		// then compare the pivot to all elments in the left and right
		// if less than pivot put left not including pivot else put right side
		// repeat - untill we have one
		// then combine

		long startTime = System.nanoTime();
		
		
		doOldQuickSort(inputArray, 0, SHAPE_ARRAY_SIZE - 1 , debugLevel);

		long endTime = System.nanoTime(); // time ended
		System.out.println("Time Taken In Sorting Method in ms: " + (endTime - startTime) / 1000000);

	}

	
	/**
	 * Description: doQuickSort method
	 * 
	 * Pre-Conditions: must have shape array, 2 int values 
	 * 
	 * Post-Condition: 
	 * 
	 * @param array shape array 
	 * @param low 
	 * @param high
	 */
	private void doOldQuickSort(Shape[] array, int low, int high , Debug debugLevel) {


		
		
		if (low < high) {
			
			int pivotIndex = oldQuickSortPartition(array, low, high, debugLevel);

			// left partition
			doOldQuickSort(array, low, pivotIndex - 1 , debugLevel);
			// right partition
			doOldQuickSort(array, pivotIndex + 1, high , debugLevel);
		}
	}

	/**
	 * Description: doQuickSort method
	 * 
	 * Pre-Conditions: must have shape array, 2 int values 
	 * 
	 * Post-Condition: 
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	private int oldQuickSortPartition(Shape[] array, int low, int high , Debug debugLevel) {
		
		Shape pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// array[j].compareTo(pivot) >= 1 largest to smallest 
			if (array[j].compareTo(pivot) <= -1) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, high);

		return i + 1;
	}

	// divides
	/**
	 * Description: mergeSort method
	 * 
	 * Pre-Conditions: must have shape array 
	 * 
	 * Post-Condition: array is divided recursively then merge method is called 
	 * 
	 * @param array
	 */
	public void mergeSort(Shape[] array , Debug debugLevel, char arg) {

		long startTime = System.nanoTime();

		if (array.length <= 1) {
			return; // Array is already sorted
		}

		int mid = array.length / 2;

		Shape[] left = new Shape[mid];
		Shape[] right = new Shape[array.length - mid];

		// split the array into two
		System.arraycopy(array, 0, left, 0, left.length);
		System.arraycopy(array, mid, right, 0, right.length);

		// sort the two arrays
		mergeSort(left , debugLevel, argForCompare);
		mergeSort(right , debugLevel, argForCompare);

		// merge two the sorted arrays
		merge(array, left, right , debugLevel, argForCompare);
		
		long endTime = System.nanoTime(); // time ended
		timeTakenInMs = (endTime - startTime) / 1000000; 
	}

	// combines
	/**
	 * Description: mergeSorts merge method 
	 * 
	 * Pre-Conditions: must have shape array, left and right sub arrays 
	 * 
	 * Post-Condition: both sub arrays are compared via first index then merged into one array 
	 * 
	 * @param array
	 * @param leftArray
	 * @param rightArray
	 */
	private void merge(Shape[] array, Shape[] leftArray, Shape[] rightArray , Debug debugLevel, char arg) {
		int indexOfLeft = 0, indexOfRight = 0, indexOfMerged = 0;

		while (indexOfLeft < leftArray.length && indexOfRight < rightArray.length) {

			

			if (argForCompare == 'h') {
				
				// inputArray[j].compareTo(inputArray[j + 1]) > 1 // smallest to largest
				if (leftArray[indexOfLeft].compareTo(rightArray[indexOfRight]) <= -1) { // largest to smallest

					array[indexOfMerged++] = leftArray[indexOfLeft++];

				}
				else {
					array[indexOfMerged++] = rightArray[indexOfRight++];
				}
				
			   }
               else if (argForCompare == 'a') {
					
                  if (compareBaseArea.compare(leftArray[indexOfLeft], rightArray[indexOfRight])  <= -1) {
						
                	  array[indexOfMerged++] = leftArray[indexOfLeft++];
						
				  } 
                  else {
  					  array[indexOfMerged++] = rightArray[indexOfRight++];
  				 }
                  
					
					
				}
               else if (argForCompare == 'v') {
            	   
            	   if (compareVolume.compare(leftArray[indexOfLeft], rightArray[indexOfRight])  <= -1) {
						
            		   array[indexOfMerged++] = leftArray[indexOfLeft++];

						
					}
            	   else {
   					  array[indexOfMerged++] = rightArray[indexOfRight++];
   				 }
               }
			
			
	
		}

		while (indexOfLeft < leftArray.length) {
			array[indexOfMerged++] = leftArray[indexOfLeft++];
		}

		while (indexOfRight < rightArray.length) {
			array[indexOfMerged++] = rightArray[indexOfRight++];
		}
	}

	
	

	 public  void shellSort(Debug debugLevel ) {
		 
	        long startTime = System.currentTimeMillis();

	 
	        int n = inputArray.length;
	        int gap = n / 2;

	        while (gap > 0) {
	        	
	            for (int i = gap; i < n; i++) {
	                Shape temp = inputArray[i];
	                int j = i;

	 
	            	if (argForCompare == 'h') {
						
						
						if (j >= gap && inputArray[j - gap].compareTo(temp) < 0) { 

							inputArray[j] = inputArray[j - gap];
		                    j -= gap;
						}
						
					   }
		               else if (argForCompare == 'a') {
							
	                      if ( j >= gap && compareBaseArea.compare(inputArray[j - gap], temp)  <= -1) {
								
	                    	  inputArray[j] = inputArray[j - gap];
			                    j -= gap;
							} 
	                      
						}
		               else if (argForCompare == 'v') {
		            	   
		            	   if (compareVolume.compare(inputArray[j - gap], temp)  <= -1) {
								
		            		   inputArray[j] = inputArray[j - gap];
			                    j -= gap;
							} 
		               }

	 
	                inputArray[j] = temp;
	            }

	            gap /= 2;
	        }

	 

	        long endTime = System.currentTimeMillis();
	        timeTakenInMs = (endTime - startTime) / 1000000; 
	        
	    }
	
	
	
	
	
	public void veryDumbSort(Debug debugLevel) {
		
		ArrayList<Shape> arrayList = new ArrayList<Shape>(); 
		
		for (int i = 0; i < SHAPE_ARRAY_SIZE; i++) {
			
			arrayList.add(inputArray[i]); 
			
			
		}
		
		while (!isListSorted(inputArray)) {
			Collections.shuffle(arrayList);
			
		}
		
	}
	
	private boolean isListSorted(Shape[] array) {
		
		int sorted = 0; 
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i].compareTo(array[i + 1]) <= -1) {
				
				sorted++;
				
			}
			
		}
		
		if (sorted == array.length) {
			
			return true; 
		}
		
		return false;
	}
	
	public void gnomeSort(Debug debugLevel ) {
		
		long startTime = System.nanoTime();
		
		int index = 0; 
		
		
		while (index < SHAPE_ARRAY_SIZE - 1) {
			
			if (index == 0) {
				
				index++;
				
			} 
			
			
			
			
			if (argForCompare == 'h') {
				
				
				if (inputArray[index].compareTo(inputArray[index - 1]) <= -1) { 

					index++;

				}
				else {
					swap(inputArray , index , index - 1);
					index--;
				}
				
			   }
               else if (argForCompare == 'a') {
					
                  if (compareBaseArea.compare(inputArray[index], inputArray[index - 1])  <= -1) {
						
                	  index++;
						
					}
                  else {
  					swap(inputArray , index , index - 1);
  					index--;
  				}
                  
					
					
				}
               else if (argForCompare == 'v') {
            	   
            	   if (compareVolume.compare(inputArray[index], inputArray[index - 1])  <= -1) {
						
            		   index++;
						
					} 
            	   else {
   					swap(inputArray , index , index - 1);
   					index--;
   				}
            	   
               }
			
	
			
		}
		
		long endTime = System.nanoTime(); // time ended
		System.out.println("Time Taken In Sorting Method in ms: " + (endTime - startTime) / 1000000);
	}
	


	/**
	 * Description: swap method 
	 * 
	 * Pre-conditions: must have shape array, current index and index to swap 
	 * 
	 * Post-Condition: currentIndex is swaped with indexToSwap in the given array, array is then returned 
	 * 
	 * @param array
	 * @param currentIndex
	 * @param indexToSwap
	 */
	private void swap(Shape[] array, int currentIndex, int indexToSwap) {

		Shape temp = array[currentIndex];

		array[currentIndex] = array[indexToSwap];
		
		array[indexToSwap] = temp;

	}
	
	public long getTimeTaken() {
		
		return timeTakenInMs; 
	}

}

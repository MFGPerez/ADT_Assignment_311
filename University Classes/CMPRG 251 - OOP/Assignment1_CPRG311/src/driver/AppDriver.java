package driver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import shapes.Shape;
import utilities.Debug;
import utilities.FileReader;
import utilities.SortingAlgorithms;

/**
 * Class description: Main class used to create FileReader, SortingAlgorithms,
 * to sort a shape array
 * 
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class AppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
	
		
		/* VARIABLES */ 
		
		String filePath;
		Debug debug;
		Shape shapeArray[];
		SortingAlgorithms algorithm;
		FileReader reader;
		

	
		
		
		
		/* ARGS */ 

		// -Fpolyfor1.txt -Tv -Sb 
		// run file java -jar sort.jar 
		
		if (args.length < 3) {
			throw new RuntimeException("Not Enough Arguments");

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 'b' ) {

		
			char compareArg = args[1].charAt(2); 
			
			// file path 
			filePath = args[0].substring(2);
		
			debug = new Debug(0); // debugger - set as level 1
			
			reader = new FileReader(filePath, debug); // reader passing file path and debugger 

			shapeArray = reader.populateShapeArray(); // populate array 

			algorithm = new SortingAlgorithms(shapeArray, compareArg); // pass array into the sorting algorithm constructor 

			algorithm.bubbleSort(debug); // call bubble sort 

			/* Get shape arrays  height */ 
			
			if (compareArg == 'h') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getHeight() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size = " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Bubble Sort, compare by Height ");
			}
			else if (compareArg == 'a') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseArea() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Bubble Sort, compare by Area ");
			}
			else if (compareArg == 'v') {
				
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseVolume() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Bubble Sort, compare by Volume ");
				
			}
			

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 's') {

			
			char compareArg = args[1].charAt(2); 
			
			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray , compareArg);

			algorithm.selectionSort(debug);

              /* Get shape arrays  height */ 
			
			if (compareArg == 'h') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getHeight() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Selection Sort, compare by Height ");
			}
			else if (compareArg == 'a') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseArea() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Selection Sort, compare by Area ");
			}
			else if (compareArg == 'v') {
				
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseVolume() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Selection Sort, compare by Volume ");
				
			}
			

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 'i') {

			char compareArg = args[1].charAt(2); 
			
			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray, compareArg);

			algorithm.insertionSort(debug);

             /* Get shape arrays  height */ 
			
			if (compareArg == 'h') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getHeight() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Insertion Sort, compare by Height ");
			}
			else if (compareArg == 'a') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseArea() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Insertion Sort, compare by Area ");
			}
			else if (compareArg == 'v') {
				
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseVolume() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Insertion Sort, compare by Volume ");
				
			}
			

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 'm') {

			
			char compareArg = args[1].charAt(2); 
			
			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray, compareArg);

			algorithm.mergeSort(shapeArray, debug, compareArg);

			
	        /* Get shape arrays  height */ 
			
				if (compareArg == 'h') {
					
					for (Shape a : shapeArray) {
						System.out.println(a.getHeight() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Merge Sort, compare by Height ");
				}
				else if (compareArg == 'a') {
					
					for (Shape a : shapeArray) {
						System.out.println(a.getBaseArea() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Merge Sort, compare by Area ");
				}
				else if (compareArg == 'v') {
					
					
					for (Shape a : shapeArray) {
						System.out.println(a.getBaseVolume() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Merge Sort, compare by Volume ");
					
				}
		

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 'q') {
			
			char compareArg = args[1].charAt(2); 

			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - to set level
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray, compareArg);

			algorithm.quickSort(debug);

            /* Get shape arrays  height */ 
			
			if (compareArg == 'h') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getHeight() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Quick Sort, compare by Height ");
			}
			else if (compareArg == 'a') {
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseArea() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Quick Sort, compare by Area ");
			}
			else if (compareArg == 'v') {
				
				
				for (Shape a : shapeArray) {
					System.out.println(a.getBaseVolume() + " ");
				}
				System.out.println("-----------------------------");
				System.out.println("array size " + shapeArray.length);
				System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
				System.out.println("Sort used: Quick Sort, compare by Volume ");
				
			}
		}
		else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'T' && args[2].charAt(1) == 'S' && args[2].charAt(2) == 'z') {

			
			char compareArg = args[1].charAt(2); 
			
			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - to set level
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray, compareArg);

			 algorithm.shellSort(debug);

			 /* Get shape arrays  height */ 
				
				if (compareArg == 'h') {
					
					for (Shape a : shapeArray) {
						System.out.println(a.getHeight() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Shell Sort, compare by Height ");
				}
				else if (compareArg == 'a') {
					
					for (Shape a : shapeArray) {
						System.out.println(a.getBaseArea() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Shell Sort, compare by Area ");
				}
				else if (compareArg == 'v') {
					
					
					for (Shape a : shapeArray) {
						System.out.println(a.getBaseVolume() + " ");
					}
					System.out.println("-----------------------------");
					System.out.println("array size " + shapeArray.length);
					System.out.println("Time Taken In Sorting Method in ms: " + algorithm.getTimeTaken());
					System.out.println("Sort used: Shell Sort, compare by Volume ");
					
				}
		}
		
		
		
		
		
		/* REFLECTION */ 
		
		try {
			Class myClass = Class.forName("utilities.SortingAlgorithms");
			
			Class[] types = {Debug.class};
			
			String d = args[0]; 
			Method myMethod =  myClass.getDeclaredMethod("bubbleSort", types);
			
			System.out.println(myMethod.invoke(null, d));
			
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			
			e.printStackTrace();
		} 
		
	}

}

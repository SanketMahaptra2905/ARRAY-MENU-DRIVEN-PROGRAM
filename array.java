import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nMenu: Choose an operation (1-10)");
            System.out.println("1. Sum of all elements");
            System.out.println("2. Factorial of each element");
            System.out.println("3. Search an element");
            System.out.println("4. Delete an element");
            System.out.println("5. Find Maximum");
            System.out.println("6. Find Second Maximum");
            System.out.println("7. Find Minimum");
            System.out.println("8. Find Second Minimum");
            System.out.println("9. Sort array (Bubble Sort)");
            System.out.println("10. Sort array (Selection Sort)");
            System.out.println("11. Sort array (Insertion Sort)");
            System.out.println("12. Sort array (Merge Sort)");
            System.out.println("13. Sort array (Quick Sort)");
            System.out.println("14. Reverse the array");
            System.out.println("15. Rotate the array");
            System.out.println("16. Check if array is palindrome");
            System.out.println("17. Remove duplicates");
            System.out.println("18. Find the frequency of each element");
            System.out.println("19. Find the odd/even sum");
            System.out.println("20. Check if array is sorted");
            System.out.println("21. Find the sum of digits of each element");
            System.out.println("22. Find the Element that Appears Most Frequently");
            System.out.println("23. Find the second largest element");
            System.out.println("24. Find the first duplicate element");
            System.out.println("25. Count the number of prime numbers in the array");
            System.out.println("26. Find the largest prime number");
            System.out.println("27. Find the sum of positive numbers");
            System.out.println("28. Find the sum of negative numbers");
            System.out.println("29. Find the maximum difference between elements");
            System.out.println("30. Find the middle element of the array");
            System.out.println("31. Reverse the array");
            System.out.println("32. Find the frequency of each element");
            System.out.println("33. Find the intersection of two arrays");
            System.out.println("34. Find the union of two arrays");
            System.out.println("35. Check if array is a palindrome");
            System.out.println("36. Rotate the array left by one position");
            System.out.println("37. Rotate the array right by one position");
            System.out.println("38. Find the element with the most occurrences");
            System.out.println("39. Convert array to a string");
            System.out.println("40. Remove duplicate elements");
            System.out.println("41. Find the sum of even numbers");
            System.out.println("42. Find the sum of odd numbers");
            System.out.println("43. Find the product of all elements");
            System.out.println("44. Find the square of each element");
            System.out.println("45. Remove all negative elements");
            System.out.println("46. Find the largest difference between elements");
            System.out.println("47. Find the first non-repeated element");
            System.out.println("48. Find the element at a specific position");
            System.out.println("49. Replace an element at a specific position");
            System.out.println("50. Sum of the first N even numbers");
            System.out.println("51. Reverse the array");
            System.out.println("52. Check if the array is a palindrome");
            System.out.println("53. Find the GCD of all elements");
            System.out.println("54. Find the LCM of all elements");
            System.out.println("55. Merge two arrays");
            System.out.println("56. Intersect two arrays");
            System.out.println("57. Check if the array is sorted");
            System.out.println("58. Find the sum of prime numbers");
            System.out.println("59. Find the sum of squares of odd numbers");
            System.out.println("60. Find all pairs that add up to a given sum");
            System.out.println("61. Sum of odd digits of all elements");
            System.out.println("62. Count even digits in each element");
            System.out.println("63. Remove all prime numbers");
            System.out.println("64. Replace negative numbers with zero");
            System.out.println("65. Sum of even digits in each element");
            System.out.println("66. Check if there is any element divisible by 5");
            System.out.println("67. Find the sum of numbers at even positions");
            System.out.println("68. Check if all elements are prime");
            System.out.println("69. Find the product of odd numbers");
            System.out.println("70. Find the longest sequence of consecutive elements");
            System.out.println("71. Count occurrences of a digit in each element");
            System.out.println("72. Reverse each element in the array");
            System.out.println("73. Check if any number is a perfect square");
            System.out.println("74. Remove all duplicates from the array");
            System.out.println("75. Count odd digits in each element");
            System.out.println("76. Check if there is any negative number");
            System.out.println("77. Reverse the entire array");
            System.out.println("78. Replace even numbers with their square");
            System.out.println("79. Count numbers divisible by 3");
            System.out.println("80. Find the sum of all elements that are multiples of 4");
            System.out.println("81. Find the maximum and minimum number in the array");
            System.out.println("82. Find the second largest element in the array");
            System.out.println("83. Find the difference between the largest and smallest numbers");
            System.out.println("84. Check if the array is sorted in ascending order");
            System.out.println("85. Count how many times a number appears in the array");
            System.out.println("86. Find the average of all elements in the array");
            System.out.println("87. Replace odd numbers with their cube");
            System.out.println("88. Find the sum of digits of each element");
            System.out.println("89. Check if all elements are positive");
            System.out.println("90. Find the product of all elements");
            System.out.println("91. Find the second smallest element in the array");
            System.out.println("92. Remove all duplicate elements");
            System.out.println("93. Find the sum of squares of all elements");
            System.out.println("94. Reverse the array");
            System.out.println("95. Merge two arrays");
            System.out.println("96. Rotate the array by a given number of positions");
            System.out.println("97. Find the mode of the array");
            System.out.println("98. Find the longest sequence of consecutive elements");
            System.out.println("99. Check if the array contains a given number");
            System.out.println("100. Print the array in a spiral order");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum of all elements: " + sumOfElements(arr));
                    break;
                case 2:
                    System.out.println("Factorial of each element: " + Arrays.toString(factorialOfEachElement(arr)));
                    break;
                case 3:
                    System.out.println("Enter element to search:");
                    int searchElement = scanner.nextInt();
                    System.out.println("Element found: " + searchElement(arr, searchElement));
                    break;
                case 4:
                    System.out.println("Enter element to delete:");
                    int deleteElement = scanner.nextInt();
                    arr = deleteElement(arr, deleteElement);
                    System.out.println("Array after deletion: " + Arrays.toString(arr));
                    break;
                case 5:
                    System.out.println("Maximum element: " + findMax(arr));
                    break;
                case 6:
                    System.out.println("Second Maximum element: " + findSecondMax(arr));
                    break;
                case 7:
                    System.out.println("Minimum element: " + findMin(arr));
                    break;
                case 8:
                    System.out.println("Second Minimum element: " + findSecondMin(arr));
                    break;
                case 9:
                    System.out.println("Array after Bubble Sort: " + Arrays.toString(bubbleSort(arr)));
                    break;
                case 10:
                    System.out.println("Array after Selection Sort: " + Arrays.toString(selectionSort(arr)));
                    break;
                case 11:
                    System.out.println("Array after Insertion Sort: " + Arrays.toString(insertionSort(arr)));
                    break;
                case 12:
                    System.out.println("Array after Merge Sort: " + Arrays.toString(mergeSort(arr)));
                    break;
                case 13:
                    System.out.println("Array after Quick Sort: " + Arrays.toString(quickSort(arr, 0, arr.length - 1)));
                    break;
                case 14:
                    reverseArray(arr);
                    System.out.println("Array after reversal: " + Arrays.toString(arr));
                    break;
                case 15:
                    System.out.println("Enter the number of positions to rotate:");
                    int positions = scanner.nextInt();
                    rotateArray(arr, positions);
                    System.out.println("Array after rotation: " + Arrays.toString(arr));
                    break;
                case 16:
                    System.out.println("Is array palindrome? " + isPalindrome(arr));
                    break;
                case 17:
                    System.out.println("Array after removing duplicates: " + Arrays.toString(removeDuplicates(arr)));
                    break;
                case 18:
                    System.out.println("Frequency of each element: " + Arrays.toString(frequencyOfElements(arr)));
                    break;
                case 19:
                    System.out.println("Sum of odd elements: " + sumOddElements(arr));
                    System.out.println("Sum of even elements: " + sumEvenElements(arr));
                    break;
                case 20:
                    System.out.println("Is array sorted? " + isSorted(arr));
                    break;
                 case 21:
                    System.out.println("You chose to find the Element that Appears Most Frequently.");
                    findElementThatAppearsMostFrequently(array1);
                    break;
                 case 22:
                    System.out.println("You chose to find the Element that Appears Most Frequently.");
                    findElementThatAppearsMostFrequently(array);
                    break;

                case 23:
                    System.out.println("Second largest element: " + secondLargestElement(arr));
                    break;
                case 24:
                    System.out.println("First duplicate element: " + firstDuplicateElement(arr));
                    break;
                case 25:
                    System.out.println("Count of prime numbers: " + countPrimeNumbers(arr));
                    break;
                case 26:
                    System.out.println("Largest prime number: " + largestPrimeNumber(arr));
                    break;
                case 27:
                    System.out.println("Sum of positive numbers: " + sumPositiveNumbers(arr));
                    break;
                case 28:
                    System.out.println("Sum of negative numbers: " + sumNegativeNumbers(arr));
                    break;
                case 29:
                    System.out.println("Maximum difference between elements: " + maxDifference(arr));
                    break;
                case 30:
                    System.out.println("Middle element: " + middleElement(arr));
                    break;
                case 31:
                    reverseArray(arr);
                    System.out.println("Reversed array: " + Arrays.toString(arr));
                    break;
                case 32:
                    System.out.println("Frequency of each element: " + Arrays.toString(frequencyOfElements(arr)));
                    break;
                case 33:
                    System.out.println("Enter the size of second array:");
                    int m = scanner.nextInt();
                    int[] arr2 = new int[m];
                    System.out.println("Enter the second array elements:");
                    for (int i = 0; i < m; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    System.out.println("Intersection of arrays: " + Arrays.toString(intersectionOfArrays(arr, arr2)));
                    break;
                case 34:
                    System.out.println("Union of arrays: " + Arrays.toString(unionOfArrays(arr, arr2)));
                    break;
                case 35:
                    System.out.println("Is array a palindrome? " + isPalindrome(arr));
                    break;
                case 36:
                    rotateArrayLeft(arr);
                    System.out.println("Array after left rotation: " + Arrays.toString(arr));
                    break;
                case 37:
                    rotateArrayRight(arr);
                    System.out.println("Array after right rotation: " + Arrays.toString(arr));
                    break;
                case 38:
                    System.out.println("Element with most occurrences: " + elementWithMostOccurrences(arr));
                    break;
                case 39:
                    System.out.println("Array as a string: " + arrayToString(arr));
                    break;
                case 40:
                    removeDuplicates(arr);
                    System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
                    break;
                case 41:
                    System.out.println("Sum of even numbers: " + sumOfEvenNumbers(arr));
                    break;
                case 42:
                    System.out.println("Sum of odd numbers: " + sumOfOddNumbers(arr));
                    break;
                case 43:
                    System.out.println("Product of all elements: " + productOfAllElements(arr));
                    break;
                case 44:
                    System.out.println("Square of each element: " + Arrays.toString(squareOfElements(arr)));
                    break;
                case 45:
                    removeNegativeElements(arr);
                    System.out.println("Array after removing negative elements: " + Arrays.toString(arr));
                    break;
                case 46:
                    System.out.println("Largest difference between elements: " + largestDifference(arr));
                    break;
                case 47:
                    System.out.println("First non-repeated element: " + firstNonRepeatedElement(arr));
                    break;
                case 48:
                    System.out.println("Enter the position to get the element:");
                    int position = scanner.nextInt();
                    System.out.println("Element at position " + position + ": " + getElementAtPosition(arr, position));
                    break;
                case 49:
                    System.out.println("Enter the position to replace the element:");
                    int replacePosition = scanner.nextInt();
                    System.out.println("Enter the new value:");
                    int newValue = scanner.nextInt();
                    replaceElementAtPosition(arr, replacePosition, newValue);
                    System.out.println("Array after replacing element: " + Arrays.toString(arr));
                    break;
                case 50:
                    System.out.println("Enter N to sum first N even numbers:");
                    int N = scanner.nextInt();
                    System.out.println("Sum of first " + N + " even numbers: " + sumOfFirstNEvenNumbers(N));
                    break;
                  case 51:
                    System.out.println("Reversed array: " + Arrays.toString(reverseArray(arr)));
                    break;
                case 52:
                    System.out.println("Is the array palindrome? " + isPalindrome(arr));
                    break;
                case 53:
                    System.out.println("GCD of all elements: " + findGCD(arr));
                    break;
                case 54:
                    System.out.println("LCM of all elements: " + findLCM(arr));
                    break;
                case 55:
                    System.out.println("Enter the size of the second array:");
                    int m = scanner.nextInt();
                    int[] arr2 = new int[m];
                    System.out.println("Enter the elements of the second array:");
                    for (int i = 0; i < m; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    int[] mergedArray = mergeArrays(arr, arr2);
                    System.out.println("Merged array: " + Arrays.toString(mergedArray));
                    break;
                case 56:
                    System.out.println("Enter the size of the second array:");
                    int n2 = scanner.nextInt();
                    int[] arr3 = new int[n2];
                    System.out.println("Enter the elements of the second array:");
                    for (int i = 0; i < n2; i++) {
                        arr3[i] = scanner.nextInt();
                    }
                    System.out.println("Intersected array: " + Arrays.toString(intersectArrays(arr, arr3)));
                    break;
                case 57:
                    System.out.println("Is the array sorted? " + isSorted(arr));
                    break;
                case 58:
                    System.out.println("Sum of prime numbers: " + sumOfPrimeNumbers(arr));
                    break;
                case 59:
                    System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOfOddNumbers(arr));
                    break;
                case 60:
                    System.out.println("Enter the sum for pairs:");
                    int sum = scanner.nextInt();
                    findPairsWithSum(arr, sum);
                    break;
                case 61:
                int sumOddDigits = 0;
                for (int num : arr) {
                    sumOddDigits += sumOddDigits(num);
                }
                System.out.println("Sum of odd digits of all elements: " + sumOddDigits);
                break;

                case 62:
                    for (int num : arr) {
                        System.out.println("Number " + num + " has " + countEvenDigits(num) + " even digits.");
                    }
                    break;
    
                case 63:
                    arr = removePrimes(arr);
                    System.out.println("Array after removing primes: " + Arrays.toString(arr));
                    break;
    
                case 64:
                    replaceNegativeWithZero(arr);
                    System.out.println("Array after replacing negative numbers with zero: " + Arrays.toString(arr));
                    break;
    
                case 65:
                    int sumEvenDigits = 0;
                    for (int num : arr) {
                        sumEvenDigits += sumEvenDigits(num);
                    }
                    System.out.println("Sum of even digits of all elements: " + sumEvenDigits);
                    break;
    
                case 66:
                    boolean divisibleBy5 = false;
                    for (int num : arr) {
                        if (num % 5 == 0) {
                            divisibleBy5 = true;
                            break;
                        }
                    }
                    if (divisibleBy5) {
                        System.out.println("There is an element divisible by 5.");
                    } else {
                        System.out.println("No element is divisible by 5.");
                    }
                    break;
    
                case 67:
                    int sumEvenPositions = 0;
                    for (int i = 0; i < arr.length; i += 2) {
                        sumEvenPositions += arr[i];
                    }
                    System.out.println("Sum of numbers at even positions: " + sumEvenPositions);
                    break;
    
                case 68:
                    boolean allPrime = true;
                    for (int num : arr) {
                        if (!isPrime(num)) {
                            allPrime = false;
                            break;
                        }
                    }
                    if (allPrime) {
                        System.out.println("All elements are prime.");
                    } else {
                        System.out.println("Not all elements are prime.");
                    }
                    break;
    
                case 69:
                    int productOdd = 1;
                    boolean oddFound = false;
                    for (int num : arr) {
                        if (num % 2 != 0) {
                            productOdd *= num;
                            oddFound = true;
                        }
                    }
                    if (oddFound) {
                        System.out.println("Product of odd numbers: " + productOdd);
                    } else {
                        System.out.println("No odd numbers found.");
                    }
                    break;
    
                case 70:
                    int maxLength = findLongestConsecutiveSequence(arr);
                    System.out.println("Length of longest consecutive sequence: " + maxLength);
                    break;
                 case 71:
                System.out.print("Enter the digit to count occurrences of: ");
                int digitToCount = sc.nextInt();
                for (int num : arr) {
                    System.out.println("Number " + num + " has " + countDigitOccurrences(num, digitToCount) + " occurrences of the digit " + digitToCount);
                }
                break;
    
                case 72:
                    for (int num : arr) {
                        System.out.println("Reversed of " + num + " is: " + reverseNumber(num));
                    }
                    break;
    
                case 73:
                    boolean perfectSquareFound = false;
                    for (int num : arr) {
                        if (isPerfectSquare(num)) {
                            perfectSquareFound = true;
                            break;
                        }
                    }
                    if (perfectSquareFound) {
                        System.out.println("There is at least one perfect square.");
                    } else {
                        System.out.println("No perfect squares found.");
                    }
                    break;
    
                case 74:
                    arr = removeDuplicates(arr);
                    System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
                    break;
    
                case 75:
                    for (int num : arr) {
                        System.out.println("Number " + num + " has " + countOddDigits(num) + " odd digits.");
                    }
                    break;
    
                case 76:
                    boolean negativeFound = false;
                    for (int num : arr) {
                        if (num < 0) {
                            negativeFound = true;
                            break;
                        }
                    }
                    if (negativeFound) {
                        System.out.println("There is a negative number.");
                    } else {
                        System.out.println("No negative numbers found.");
                    }
                    break;
    
                case 77:
                    reverseArray(arr);
                    System.out.println("Array after reversal: " + Arrays.toString(arr));
                    break;
    
                case 78:
                    replaceEvenWithSquare(arr);
                    System.out.println("Array after replacing even numbers with their square: " + Arrays.toString(arr));
                    break;
    
                case 79:
                    int countDivisibleBy3 = countDivisibleBy3(arr);
                    System.out.println("Count of numbers divisible by 3: " + countDivisibleBy3);
                    break;
    
                case 80:
                    int sumMultiplesOf4 = sumMultiplesOf4(arr);
                    System.out.println("Sum of all elements that are multiples of 4: " + sumMultiplesOf4);
                    break;
                
                case 81:
                findMaxAndMin(arr);
                break;

                case 82:
                    findSecondLargest(arr);
                    break;
    
                case 83:
                    findDifferenceBetweenMaxAndMin(arr);
                    break;
    
                case 84:
                    checkIfSorted(arr);
                    break;
    
                case 85:
                    System.out.print("Enter the number to count occurrences of: ");
                    int numberToCount = sc.nextInt();
                    System.out.println("The number " + numberToCount + " appears " + countOccurrences(arr, numberToCount) + " times.");
                    break;
    
                case 86:
                    double avg = findAverage(arr);
                    System.out.println("The average of all elements is: " + avg);
                    break;
    
                case 87:
                    replaceOddWithCube(arr);
                    System.out.println("Array after replacing odd numbers with their cube: " + Arrays.toString(arr));
                    break;
    
                case 88:
                    sumOfDigits(arr);
                    break;
    
                case 89:
                    checkIfAllPositive(arr);
                    break;
    
                case 90:
                    int product = findProduct(arr);
                    System.out.println("The product of all elements is: " + product);
                    break;

                case 91:
                findSecondSmallest(arr);
                break;

                case 92:
                    removeDuplicates(arr);
                    break;
    
                case 93:
                    findSumOfSquares(arr);
                    break;
    
                case 94:
                    reverseArray(arr);
                    System.out.println("Array after reversal: " + Arrays.toString(arr));
                    break;
    
                case 95:
                    System.out.print("Enter the size of the second array: ");
                    int m = sc.nextInt();
                    int[] arr2 = new int[m];
                    System.out.println("Enter the elements of the second array: ");
                    for (int i = 0; i < m; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    mergeArrays(arr, arr2);
                    break;
    
                case 96:
                    System.out.print("Enter the number of positions to rotate: ");
                    int positions = sc.nextInt();
                    rotateArray(arr, positions);
                    System.out.println("Array after rotation: " + Arrays.toString(arr));
                    break;
    
                case 97:
                    findMode(arr);
                    break;
    
                case 98:
                    findLongestConsecutiveSequence(arr);
                    break;
    
                case 99:
                    System.out.print("Enter the number to check for: ");
                    int numberToCheck = sc.nextInt();
                    checkIfContains(arr, numberToCheck);
                    break;
    
                case 100:
                    printSpiralOrder(arr, n);
                    break;


                    
                    default:
                        System.out.println("Invalid choice. Please choose a number between 1 and 10.");
                }
            }
    }

    // 1. Sum of all elements
    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 2. Factorial of each element
    public static int[] factorialOfEachElement(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = factorial(arr[i]);
        }
        return result;
    }

    // Factorial helper function
    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 3. Search for an element
    public static boolean searchElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // 4. Delete an element
    public static int[] deleteElement(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) return arr;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // 5. Find Maximum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 6. Find Second Maximum element
    public static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num != max && num > secondMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    // 7. Find Minimum element
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 8. Find Second Minimum element
    public static int findSecondMin(int[] arr) {
        int min = findMin(arr);
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num != min && num < secondMin) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    // 9. Bubble Sort
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 10. Selection Sort
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
 // 11. Insertion Sort
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    // 12. Merge Sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
        return result;
    }

    // 13. Quick Sort
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // 14. Reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 15. Rotate the array by n positions
    public static void rotateArray(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n; // In case positions is greater than length
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + positions) % n] = arr[i];
        }
        System.arraycopy(temp, 0, arr, 0, n);
    }

    // 16. Check if array is palindrome
    public static boolean isPalindrome(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 17. Remove duplicates
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArr[index++] = num;
        }
        return newArr;
    }

    // 18. Find the frequency of each element
    public static int[] frequencyOfElements(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[freqMap.size()];
        int index = 0;
        for (int freq : freqMap.values()) {
            result[index++] = freq;
        }
        return result;
    }

    // 19. Find the odd and even sum
    public static int sumOddElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumEvenElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 20. Check if array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
// 21. Find the sum of digits of each element
    public static int[] sumOfDigits(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int num = Math.abs(arr[i]);
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            result[i] = sum;
        }
        return result;
    }

    //22. Find the element that appears most frequently in the array
    public static void findMostFrequentElement(int[] arr) {
        // Logic to find the most frequent element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFreq = 0;
        int mostFrequentElement = arr[0];

        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
            if (frequencyMap.get(i) > maxFreq) {
                maxFreq = frequencyMap.get(i);
                mostFrequentElement = i; // Update most frequent element
            }
        }

        System.out.println("Most Frequent Element: " + mostFrequentElement + " with frequency: " + maxFreq);
    }

    // 23. Find the second largest element
    public static int secondLargestElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second;
    }

    // 24. Find the first duplicate element
    public static int firstDuplicateElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1; // No duplicates found
    }

    // 25. Count the number of prime numbers in the array
    public static int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 26. Find the largest prime number
    public static int largestPrimeNumber(int[] arr) {
        int largestPrime = -1;
        for (int num : arr) {
            if (isPrime(num) && num > largestPrime) {
                largestPrime = num;
            }
        }
        return largestPrime;
    }

    // 27. Find the sum of positive numbers
    public static int sumPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 28. Find the sum of negative numbers
    public static int sumNegativeNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num < 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 29. Find the maximum difference between elements
    public static int maxDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    // 30. Find the middle element of the array
    public static int middleElement(int[] arr) {
        if (arr.length % 2 == 0) {
            return -1; // No middle element in an even-length array
        }
        return arr[arr.length / 2];
    }
}
// 31. Reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 32. Find the frequency of each element
    public static int[] frequencyOfElements(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int[] freqArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freqArr[i] = freqMap.get(arr[i]);
        }
        return freqArr;
    }

    // 33. Find the intersection of two arrays
    public static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> resultSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (Integer num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    // 34. Find the union of two arrays
    public static int[] unionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }

    // 35. Check if array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 36. Rotate the array left by one position
    public static void rotateArrayLeft(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    // 37. Rotate the array right by one position
    public static void rotateArrayRight(int[] arr) {
        if (arr.length == 0) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }

    // 38. Find the element with the most occurrences
    public static int elementWithMostOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int maxElement = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        return maxElement;
    }

    // 39. Convert array to a string
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    // 40. Remove duplicate elements
    public static void removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        int writeIndex = 0;
        for (int num : arr) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                arr[writeIndex++] = num;
            }
        }
        // Fill remaining elements with 0 (optional)
        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }
    }
}
// 41. Find the sum of even numbers
    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 42. Find the sum of odd numbers
    public static int sumOfOddNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 43. Find the product of all elements
    public static int productOfAllElements(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }

    // 44. Find the square of each element
    public static int[] squareOfElements(int[] arr) {
        int[] squares = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
        }
        return squares;
    }

    // 45. Remove all negative elements
    public static void removeNegativeElements(int[] arr) {
        int writeIndex = 0;
        for (int num : arr) {
            if (num >= 0) {
                arr[writeIndex++] = num;
            }
        }
        // Fill remaining elements with 0 (optional)
        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }
    }

    // 46. Find the largest difference between elements
    public static int largestDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    // 47. Find the first non-repeated element
    public static int firstNonRepeatedElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }
        return -1; // Return -1 if no non-repeated element is found
    }

    // 48. Find the element at a specific position
    public static int getElementAtPosition(int[] arr, int position) {
        if (position >= 0 && position < arr.length) {
            return arr[position];
        }
        return -1; // Return -1 if the position is invalid
    }

    // 49. Replace an element at a specific position
    public static void replaceElementAtPosition(int[] arr, int position, int newValue) {
        if (position >= 0 && position < arr.length) {
            arr[position] = newValue;
        }
    }

    // 50. Sum of the first N even numbers
    public static int sumOfFirstNEvenNumbers(int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * i;
        }
        return sum;
    }
 // 51. Reverse the array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }
        return reversed;
    }

    // 52. Check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 53. Find the GCD of all elements
    public static int findGCD(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        return gcd;
    }

    // Helper function for GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 54. Find the LCM of all elements
    public static int findLCM(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    // Helper function for LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 55. Merge two arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    // 56. Intersect two arrays
    public static int[] intersectArrays(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        return result;
    }

    // 57. Check if the array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 58. Find the sum of prime numbers
    public static int sumOfPrimeNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 59. Find the sum of squares of odd numbers
    public static int sumOfSquaresOfOddNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num * num;
            }
        }
        return sum;
    }

    // 60. Find all pairs that add up to a given sum
    public static void findPairsWithSum(int[] arr, int sum) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = sum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
// Function to sum odd digits of a number
    public static int sumOddDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    // Function to count even digits in a number
    public static int countEvenDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to remove prime numbers from the array
    public static int[] removePrimes(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!isPrime(num)) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Function to replace negative numbers with zero
    public static void replaceNegativeWithZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    // Function to sum even digits of a number
    public static int sumEvenDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    // Function to find the length of the longest consecutive sequence
    public static int findLongestConsecutiveSequence(int[] arr) {
        Arrays.sort(arr);
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else if (arr[i] != arr[i - 1]) {
                currentLength = 1;
            }
        }
        return maxLength;
    }
// Function to count occurrences of a digit in a number
    public static int countDigitOccurrences(int num, int digit) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    // Function to count odd digits in a number
    public static int countOddDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    // Function to check if the array has any negative numbers
    public static void checkNegativeNumbers(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.println("Array contains negative numbers.");
                return;
            }
        }
        System.out.println("No negative numbers in the array.");
    }

    // Function to reverse the entire array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to replace even numbers in the array with their square
    public static void replaceEvenWithSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * arr[i];
            }
        }
    }

    // Function to count numbers divisible by 3
    public static int countDivisibleBy3(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    // Function to find the sum of all elements that are multiples of 4
    public static int sumMultiplesOf4(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 4 == 0) {
                sum += num;
            }
        }
        return sum;
    }
 // Function to find the maximum and minimum numbers in the array
    public static void findMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    // Function to find the second largest element in the array
    public static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    // Function to find the difference between the largest and smallest numbers
    public static void findDifferenceBetweenMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Difference between maximum and minimum: " + (max - min));
    }

    // Function to check if the array is sorted in ascending order
    public static void checkIfSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    // Function to count how many times a number appears in the array
    public static int countOccurrences(int[] arr, int numberToCount) {
        int count = 0;
        for (int num : arr) {
            if (num == numberToCount) {
                count++;
            }
        }
        return count;
    }

    // Function to find the average of all elements in the array
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / (double) arr.length;
    }

    // Function to replace odd numbers with their cube
    public static void replaceOddWithCube(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] * arr[i] * arr[i];
            }
        }
    }

    // Function to find the sum of digits of each element
    public static void sumOfDigits(int[] arr) {
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of digits of " + num + " is: " + sum);
        }
    }

    // Function to check if all elements are positive
    public static void checkIfAllPositive(int[] arr) {
        boolean allPositive = true;
        for (int num : arr) {
            if (num <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            System.out.println("All elements are positive.");
        } else {
            System.out.println("Not all elements are positive.");
        }
    }

    // Function to find the product of all elements
    public static int findProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
// Function to find the maximum and minimum numbers in the array
    public static void findMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    // Function to find the second largest element in the array
    public static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    // Function to find the difference between the largest and smallest numbers
    public static void findDifferenceBetweenMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Difference between maximum and minimum: " + (max - min));
    }

    // Function to check if the array is sorted in ascending order
    public static void checkIfSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    // Function to count how many times a number appears in the array
    public static int countOccurrences(int[] arr, int numberToCount) {
        int count = 0;
        for (int num : arr) {
            if (num == numberToCount) {
                count++;
            }
        }
        return count;
    }

    // Function to find the average of all elements in the array
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / (double) arr.length;
    }

    // Function to replace odd numbers with their cube
    public static void replaceOddWithCube(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] * arr[i] * arr[i];
            }
        }
    }

    // Function to find the sum of digits of each element
    public static void sumOfDigits(int[] arr) {
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of digits of " + num + " is: " + sum);
        }
    }

    // Function to check if all elements are positive
    public static void checkIfAllPositive(int[] arr) {
        boolean allPositive = true;
        for (int num : arr) {
            if (num <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            System.out.println("All elements are positive.");
        } else {
            System.out.println("Not all elements are positive.");
        }
    }

    // Function to find the product of all elements
    public static int findProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}

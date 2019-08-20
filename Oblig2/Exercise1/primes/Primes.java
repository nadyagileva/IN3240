package primes;
import java.util.ArrayList;

public class Primes {
	
	boolean numbers[];
	int limit;
	public Primes(int n) {
        limit = n;
		numbers = new boolean[limit+1];
		//Setting all elements in the array to true
		for(int i = 0; i < limit; i++) {
            numbers[i] = true; 
        }
        setPrimes();
    }
	
	public void setPrimes() {
        for(int p = 2; p*p <=limit; p++){ 
            // If numbers[p] is not changed to false, then it is a prime number
            if(numbers[p] == true){ 
                // Changes all multiples of p to false
                for(int i = p*p; i <= limit; i += p) {
                    numbers[i] = false; 
                }
            } 
        } 
    }
    
	//1.1 Checks if a given number is prime or not
	public boolean isPrime(int a) {
		if(numbers[a] == true) {
			return true;
		}
		return false;
	}
	
	//1.2 method to find and return the prime numbers in a ArrayList
    public ArrayList<Integer> returnPrimes(){
    	ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 0; i<=limit; i++){
            if(numbers[i] == true){
                primes.add(i);
            }
        }
        return primes;
    }
}


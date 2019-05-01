
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester {

	public static ArrayList<music> musics = new ArrayList<>();
	public static ArrayList<music> result = new ArrayList<>();

	public static void main(String[] args) {
		
		long nano_startTime = System.nanoTime(); 
        long millis_startTime = System.currentTimeMillis(); 

		Scanner fin = null;
		
		try {
			fin = new Scanner(new File("Music_list.txt"));
			if(fin.hasNextLine()) fin.nextLine();
			while(fin.hasNextLine())
				musics.add(new music(fin));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fin != null) fin.close();
		}
		
		

		
		
		String[] types = {"purple", "blue", "Funk"};
		String[] artists = {"Ed Sheeran", "Taylor Swift", "Pharrell Williams"};
		
		for(music m : musics) {
			for(int i=0; i<types.length; i++) {
				if(m.getType().equalsIgnoreCase(types[i]))
					m.setGrade(m.getGrade() + 0.5);
			}
			for(int i=0; i<artists.length; i++) {
				if(m.getArtist().equalsIgnoreCase(artists[i]))
					m.setGrade(m.getGrade() + 0.5);
			}
		}
		
		mergeSort(musics, 0, musics.size()-1);
		Collections.reverse(musics);

		
		for(int i=0; i<20; i++) {
			result.add(musics.get(i));
		}
		
		for(music r : result) {
			System.out.println(r);
		}
		long nano_endTime = System.nanoTime(); 
        long millis_endTime = System.currentTimeMillis(); 
  
        // Print the time taken by subtracting 
        // the end-time from the start-time 
        System.out.println("Time taken in nano seconds: "
                           + (nano_endTime - nano_startTime)); 
        System.out.println("Time taken in milli seconds: "
                           + (millis_endTime - millis_startTime)); 
			
	}
		
	
	
    private static void merge(ArrayList<music> mus, int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        ArrayList<music> left = new ArrayList<>();
        ArrayList<music> right = new ArrayList<>();
  
        for (int i=0; i<n1; ++i)
        	left.add(mus.get(l+i));
        for (int j=0; j<n2; ++j) 
        	right.add(mus.get(m+1+j));
  

        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (left.get(i).getGrade() <= right.get(j).getGrade())
            { 
                mus.set(k, left.get(i));
                i++; 
            } 
            else
            { 
                mus.set(k, right.get(j));
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            mus.set(k, left.get(i));
            i++; 
            k++; 
        } 
 
        while (j < n2) 
        { 
        	mus.set(k, right.get(j));
            j++; 
            k++; 
        } 
    } 

    private static void mergeSort(ArrayList<music> mus, int l, int r) { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
  
            mergeSort(mus, l, m); 
            mergeSort(mus , m+1, r); 
  
            merge(mus, l, m, r); 
        } 
    } 
}
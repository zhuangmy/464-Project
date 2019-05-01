import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester2 {
	
	public static ArrayList<music2> musics2 = new ArrayList<>();
	public static ArrayList<music2> result2 = new ArrayList<>();
	public static ArrayList<music2> input = new ArrayList<>();
	
	public static void main(String[] args) {
		
		long nano_startTime = System.nanoTime(); 
        long millis_startTime = System.currentTimeMillis(); 
  
    
		Scanner fin = null;
		
		try {
			fin = new Scanner(new File("Music_list2.txt"));
			if(fin.hasNextLine()) fin.nextLine();
			while(fin.hasNextLine())
				input.add(new music2(fin));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fin != null) fin.close();
		}
		
		try {
			fin = new Scanner(new File("Music_list3.txt"));
			if(fin.hasNextLine()) fin.nextLine();
			while(fin.hasNextLine())
				musics2.add(new music2(fin));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fin != null) fin.close();
		}
		
		
		for(music2 m: musics2) {
			for(music2 i: input) {
				if(i.getSong1().equals(m.getSong1()) || i.getSong1().equals(m.getSong2()) || i.getSong1().equals(m.getSong3()) || i.getSong1().equals(m.getSong4()) || i.getSong1().equals(m.getSong5()) || i.getSong1().equals(m.getSong6()) || i.getSong1().equals(m.getSong7()) || i.getSong1().equals(m.getSong8()) || i.getSong1().equals(m.getSong9()) || i.getSong1().equals(m.getSong10()) ||
				   i.getSong1().equals(m.getSong11()) || i.getSong1().equals(m.getSong12()) || i.getSong1().equals(m.getSong13()) || i.getSong1().equals(m.getSong14()) || i.getSong1().equals(m.getSong15()) || i.getSong1().equals(m.getSong16()) || i.getSong1().equals(m.getSong17()) || i.getSong1().equals(m.getSong18()) || i.getSong1().equals(m.getSong19()) || i.getSong1().equals(m.getSong20())) {
					m.setCommon(m.getCommon()+1);
				}
				if(i.getSong2().equals(m.getSong1()) || i.getSong2().equals(m.getSong2()) || i.getSong2().equals(m.getSong3()) || i.getSong2().equals(m.getSong4()) || i.getSong2().equals(m.getSong5()) || i.getSong2().equals(m.getSong6()) || i.getSong2().equals(m.getSong7()) || i.getSong2().equals(m.getSong8()) || i.getSong2().equals(m.getSong9()) || i.getSong2().equals(m.getSong10()) ||
						   i.getSong2().equals(m.getSong11()) || i.getSong2().equals(m.getSong12()) || i.getSong2().equals(m.getSong13()) || i.getSong2().equals(m.getSong14()) || i.getSong2().equals(m.getSong15()) || i.getSong2().equals(m.getSong16()) || i.getSong2().equals(m.getSong17()) || i.getSong2().equals(m.getSong18()) || i.getSong2().equals(m.getSong19()) || i.getSong2().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong3().equals(m.getSong1()) || i.getSong3().equals(m.getSong2()) || i.getSong3().equals(m.getSong3()) || i.getSong3().equals(m.getSong4()) || i.getSong3().equals(m.getSong5()) || i.getSong3().equals(m.getSong6()) || i.getSong3().equals(m.getSong7()) || i.getSong3().equals(m.getSong8()) || i.getSong3().equals(m.getSong9()) || i.getSong3().equals(m.getSong10()) ||
						   i.getSong3().equals(m.getSong11()) || i.getSong3().equals(m.getSong12()) || i.getSong3().equals(m.getSong13()) || i.getSong3().equals(m.getSong14()) || i.getSong3().equals(m.getSong15()) || i.getSong3().equals(m.getSong16()) || i.getSong3().equals(m.getSong17()) || i.getSong3().equals(m.getSong18()) || i.getSong3().equals(m.getSong19()) || i.getSong3().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong4().equals(m.getSong1()) || i.getSong4().equals(m.getSong2()) || i.getSong4().equals(m.getSong3()) || i.getSong4().equals(m.getSong4()) || i.getSong4().equals(m.getSong5()) || i.getSong4().equals(m.getSong6()) || i.getSong4().equals(m.getSong7()) || i.getSong4().equals(m.getSong8()) || i.getSong4().equals(m.getSong9()) || i.getSong4().equals(m.getSong10()) ||
						   i.getSong4().equals(m.getSong11()) || i.getSong4().equals(m.getSong12()) || i.getSong4().equals(m.getSong13()) || i.getSong4().equals(m.getSong14()) || i.getSong4().equals(m.getSong15()) || i.getSong4().equals(m.getSong16()) || i.getSong4().equals(m.getSong17()) || i.getSong4().equals(m.getSong18()) || i.getSong4().equals(m.getSong19()) || i.getSong4().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong5().equals(m.getSong1()) || i.getSong5().equals(m.getSong2()) || i.getSong5().equals(m.getSong3()) || i.getSong5().equals(m.getSong4()) || i.getSong5().equals(m.getSong5()) || i.getSong5().equals(m.getSong6()) || i.getSong5().equals(m.getSong7()) || i.getSong5().equals(m.getSong8()) || i.getSong5().equals(m.getSong9()) || i.getSong5().equals(m.getSong10()) ||
						   i.getSong5().equals(m.getSong11()) || i.getSong5().equals(m.getSong12()) || i.getSong5().equals(m.getSong13()) || i.getSong5().equals(m.getSong14()) || i.getSong5().equals(m.getSong15()) || i.getSong5().equals(m.getSong16()) || i.getSong5().equals(m.getSong17()) || i.getSong5().equals(m.getSong18()) || i.getSong5().equals(m.getSong19()) || i.getSong5().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong6().equals(m.getSong1()) || i.getSong6().equals(m.getSong2()) || i.getSong6().equals(m.getSong3()) || i.getSong6().equals(m.getSong4()) || i.getSong6().equals(m.getSong5()) || i.getSong6().equals(m.getSong6()) || i.getSong6().equals(m.getSong7()) || i.getSong6().equals(m.getSong8()) || i.getSong6().equals(m.getSong9()) || i.getSong6().equals(m.getSong10()) ||
						   i.getSong6().equals(m.getSong11()) || i.getSong6().equals(m.getSong12()) || i.getSong6().equals(m.getSong13()) || i.getSong6().equals(m.getSong14()) || i.getSong6().equals(m.getSong15()) || i.getSong6().equals(m.getSong16()) || i.getSong6().equals(m.getSong17()) || i.getSong6().equals(m.getSong18()) || i.getSong6().equals(m.getSong19()) || i.getSong6().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if	(i.getSong7().equals(m.getSong1()) || i.getSong7().equals(m.getSong2()) || i.getSong7().equals(m.getSong3()) || i.getSong7().equals(m.getSong4()) || i.getSong7().equals(m.getSong5()) || i.getSong7().equals(m.getSong6()) || i.getSong7().equals(m.getSong7()) || i.getSong7().equals(m.getSong8()) || i.getSong7().equals(m.getSong9()) || i.getSong7().equals(m.getSong10()) ||
						   i.getSong7().equals(m.getSong11()) || i.getSong7().equals(m.getSong12()) || i.getSong7().equals(m.getSong13()) || i.getSong7().equals(m.getSong14()) || i.getSong7().equals(m.getSong15()) || i.getSong7().equals(m.getSong16()) || i.getSong7().equals(m.getSong17()) || i.getSong7().equals(m.getSong18()) || i.getSong7().equals(m.getSong19()) || i.getSong7().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong8().equals(m.getSong1()) || i.getSong8().equals(m.getSong2()) || i.getSong8().equals(m.getSong3()) || i.getSong8().equals(m.getSong4()) || i.getSong8().equals(m.getSong5()) || i.getSong8().equals(m.getSong6()) || i.getSong8().equals(m.getSong7()) || i.getSong8().equals(m.getSong8()) || i.getSong8().equals(m.getSong9()) || i.getSong8().equals(m.getSong10()) ||
						   i.getSong8().equals(m.getSong11()) || i.getSong8().equals(m.getSong12()) || i.getSong8().equals(m.getSong13()) || i.getSong8().equals(m.getSong14()) || i.getSong8().equals(m.getSong15()) || i.getSong8().equals(m.getSong16()) || i.getSong8().equals(m.getSong17()) || i.getSong8().equals(m.getSong18()) || i.getSong8().equals(m.getSong19()) || i.getSong8().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong9().equals(m.getSong1()) || i.getSong9().equals(m.getSong2()) || i.getSong9().equals(m.getSong3()) || i.getSong9().equals(m.getSong4()) || i.getSong9().equals(m.getSong5()) || i.getSong9().equals(m.getSong6()) || i.getSong9().equals(m.getSong7()) || i.getSong9().equals(m.getSong8()) || i.getSong9().equals(m.getSong9()) || i.getSong9().equals(m.getSong10()) ||
						   i.getSong9().equals(m.getSong11()) || i.getSong9().equals(m.getSong12()) || i.getSong9().equals(m.getSong13()) || i.getSong9().equals(m.getSong14()) || i.getSong9().equals(m.getSong15()) || i.getSong9().equals(m.getSong16()) || i.getSong9().equals(m.getSong17()) || i.getSong9().equals(m.getSong18()) || i.getSong9().equals(m.getSong19()) || i.getSong9().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong10().equals(m.getSong1()) || i.getSong10().equals(m.getSong2()) || i.getSong10().equals(m.getSong3()) || i.getSong10().equals(m.getSong4()) || i.getSong10().equals(m.getSong5()) || i.getSong10().equals(m.getSong6()) || i.getSong10().equals(m.getSong7()) || i.getSong10().equals(m.getSong8()) || i.getSong10().equals(m.getSong9()) || i.getSong10().equals(m.getSong10()) ||
						   i.getSong10().equals(m.getSong11()) || i.getSong10().equals(m.getSong12()) || i.getSong10().equals(m.getSong13()) || i.getSong10().equals(m.getSong14()) || i.getSong10().equals(m.getSong15()) || i.getSong10().equals(m.getSong16()) || i.getSong10().equals(m.getSong17()) || i.getSong10().equals(m.getSong18()) || i.getSong10().equals(m.getSong19()) || i.getSong10().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong11().equals(m.getSong1()) || i.getSong11().equals(m.getSong2()) || i.getSong11().equals(m.getSong3()) || i.getSong11().equals(m.getSong4()) || i.getSong11().equals(m.getSong5()) || i.getSong11().equals(m.getSong6()) || i.getSong11().equals(m.getSong7()) || i.getSong11().equals(m.getSong8()) || i.getSong11().equals(m.getSong9()) || i.getSong11().equals(m.getSong10()) ||
						   i.getSong11().equals(m.getSong11()) || i.getSong11().equals(m.getSong12()) || i.getSong11().equals(m.getSong13()) || i.getSong11().equals(m.getSong14()) || i.getSong11().equals(m.getSong15()) || i.getSong11().equals(m.getSong16()) || i.getSong11().equals(m.getSong17()) || i.getSong11().equals(m.getSong18()) || i.getSong11().equals(m.getSong19()) || i.getSong11().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong12().equals(m.getSong1()) || i.getSong12().equals(m.getSong2()) || i.getSong12().equals(m.getSong3()) || i.getSong12().equals(m.getSong4()) || i.getSong12().equals(m.getSong5()) || i.getSong12().equals(m.getSong6()) || i.getSong12().equals(m.getSong7()) || i.getSong12().equals(m.getSong8()) || i.getSong12().equals(m.getSong9()) || i.getSong12().equals(m.getSong10()) ||
						   i.getSong12().equals(m.getSong11()) || i.getSong12().equals(m.getSong12()) || i.getSong12().equals(m.getSong13()) || i.getSong12().equals(m.getSong14()) || i.getSong12().equals(m.getSong15()) || i.getSong12().equals(m.getSong16()) || i.getSong12().equals(m.getSong17()) || i.getSong12().equals(m.getSong18()) || i.getSong12().equals(m.getSong19()) || i.getSong12().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong13().equals(m.getSong1()) || i.getSong13().equals(m.getSong2()) || i.getSong13().equals(m.getSong3()) || i.getSong13().equals(m.getSong4()) || i.getSong13().equals(m.getSong5()) || i.getSong13().equals(m.getSong6()) || i.getSong13().equals(m.getSong7()) || i.getSong13().equals(m.getSong8()) || i.getSong13().equals(m.getSong9()) || i.getSong13().equals(m.getSong10()) ||
						   i.getSong13().equals(m.getSong11()) || i.getSong13().equals(m.getSong12()) || i.getSong13().equals(m.getSong13()) || i.getSong13().equals(m.getSong14()) || i.getSong13().equals(m.getSong15()) || i.getSong13().equals(m.getSong16()) || i.getSong13().equals(m.getSong17()) || i.getSong13().equals(m.getSong18()) || i.getSong13().equals(m.getSong19()) || i.getSong13().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong14().equals(m.getSong1()) || i.getSong14().equals(m.getSong2()) || i.getSong14().equals(m.getSong3()) || i.getSong14().equals(m.getSong4()) || i.getSong14().equals(m.getSong5()) || i.getSong14().equals(m.getSong6()) || i.getSong14().equals(m.getSong7()) || i.getSong14().equals(m.getSong8()) || i.getSong14().equals(m.getSong9()) || i.getSong14().equals(m.getSong10()) ||
						   i.getSong14().equals(m.getSong11()) || i.getSong14().equals(m.getSong12()) || i.getSong14().equals(m.getSong13()) || i.getSong14().equals(m.getSong14()) || i.getSong14().equals(m.getSong15()) || i.getSong14().equals(m.getSong16()) || i.getSong14().equals(m.getSong17()) || i.getSong14().equals(m.getSong18()) || i.getSong14().equals(m.getSong19()) || i.getSong14().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong15().equals(m.getSong1()) || i.getSong15().equals(m.getSong2()) || i.getSong15().equals(m.getSong3()) || i.getSong15().equals(m.getSong4()) || i.getSong15().equals(m.getSong5()) || i.getSong15().equals(m.getSong6()) || i.getSong15().equals(m.getSong7()) || i.getSong15().equals(m.getSong8()) || i.getSong15().equals(m.getSong9()) || i.getSong15().equals(m.getSong10()) ||
						   i.getSong15().equals(m.getSong11()) || i.getSong15().equals(m.getSong12()) || i.getSong15().equals(m.getSong13()) || i.getSong15().equals(m.getSong14()) || i.getSong15().equals(m.getSong15()) || i.getSong15().equals(m.getSong16()) || i.getSong15().equals(m.getSong17()) || i.getSong15().equals(m.getSong18()) || i.getSong15().equals(m.getSong19()) || i.getSong15().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong16().equals(m.getSong1()) || i.getSong16().equals(m.getSong2()) || i.getSong16().equals(m.getSong3()) || i.getSong16().equals(m.getSong4()) || i.getSong16().equals(m.getSong5()) || i.getSong16().equals(m.getSong6()) || i.getSong16().equals(m.getSong7()) || i.getSong16().equals(m.getSong8()) || i.getSong16().equals(m.getSong9()) || i.getSong16().equals(m.getSong10()) ||
						   i.getSong16().equals(m.getSong11()) || i.getSong16().equals(m.getSong12()) || i.getSong16().equals(m.getSong13()) || i.getSong16().equals(m.getSong14()) || i.getSong16().equals(m.getSong15()) || i.getSong16().equals(m.getSong16()) || i.getSong16().equals(m.getSong17()) || i.getSong16().equals(m.getSong18()) || i.getSong16().equals(m.getSong19()) || i.getSong16().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong17().equals(m.getSong1()) || i.getSong17().equals(m.getSong2()) || i.getSong17().equals(m.getSong3()) || i.getSong17().equals(m.getSong4()) || i.getSong17().equals(m.getSong5()) || i.getSong17().equals(m.getSong6()) || i.getSong17().equals(m.getSong7()) || i.getSong17().equals(m.getSong8()) || i.getSong17().equals(m.getSong9()) || i.getSong17().equals(m.getSong10()) ||
						   i.getSong17().equals(m.getSong11()) || i.getSong17().equals(m.getSong12()) || i.getSong17().equals(m.getSong13()) || i.getSong17().equals(m.getSong14()) || i.getSong17().equals(m.getSong15()) || i.getSong17().equals(m.getSong16()) || i.getSong17().equals(m.getSong17()) || i.getSong17().equals(m.getSong18()) || i.getSong17().equals(m.getSong19()) || i.getSong17().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong18().equals(m.getSong1()) || i.getSong18().equals(m.getSong2()) || i.getSong18().equals(m.getSong3()) || i.getSong18().equals(m.getSong4()) || i.getSong18().equals(m.getSong5()) || i.getSong18().equals(m.getSong6()) || i.getSong18().equals(m.getSong7()) || i.getSong18().equals(m.getSong8()) || i.getSong18().equals(m.getSong9()) || i.getSong18().equals(m.getSong10()) ||
						   i.getSong18().equals(m.getSong11()) || i.getSong18().equals(m.getSong12()) || i.getSong18().equals(m.getSong13()) || i.getSong18().equals(m.getSong14()) || i.getSong18().equals(m.getSong15()) || i.getSong18().equals(m.getSong16()) || i.getSong18().equals(m.getSong17()) || i.getSong18().equals(m.getSong18()) || i.getSong18().equals(m.getSong19()) || i.getSong18().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong19().equals(m.getSong1()) || i.getSong19().equals(m.getSong2()) || i.getSong19().equals(m.getSong3()) || i.getSong19().equals(m.getSong4()) || i.getSong19().equals(m.getSong5()) || i.getSong19().equals(m.getSong6()) || i.getSong19().equals(m.getSong7()) || i.getSong19().equals(m.getSong8()) || i.getSong19().equals(m.getSong9()) || i.getSong19().equals(m.getSong10()) ||
						   i.getSong19().equals(m.getSong11()) || i.getSong19().equals(m.getSong12()) || i.getSong19().equals(m.getSong13()) || i.getSong19().equals(m.getSong14()) || i.getSong19().equals(m.getSong15()) || i.getSong19().equals(m.getSong16()) || i.getSong19().equals(m.getSong17()) || i.getSong19().equals(m.getSong18()) || i.getSong19().equals(m.getSong19()) || i.getSong19().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
				if(i.getSong20().equals(m.getSong1()) || i.getSong20().equals(m.getSong2()) || i.getSong20().equals(m.getSong3()) || i.getSong20().equals(m.getSong4()) || i.getSong20().equals(m.getSong5()) || i.getSong20().equals(m.getSong6()) || i.getSong20().equals(m.getSong7()) || i.getSong20().equals(m.getSong8()) || i.getSong20().equals(m.getSong9()) || i.getSong20().equals(m.getSong10()) ||
						   i.getSong20().equals(m.getSong11()) || i.getSong20().equals(m.getSong12()) || i.getSong20().equals(m.getSong13()) || i.getSong20().equals(m.getSong14()) || i.getSong20().equals(m.getSong15()) || i.getSong20().equals(m.getSong16()) || i.getSong20().equals(m.getSong17()) || i.getSong20().equals(m.getSong18()) || i.getSong20().equals(m.getSong19()) || i.getSong20().equals(m.getSong20())) {
							m.setCommon(m.getCommon()+1);
						}
			}
		}
		
		mergeSort(musics2, 0, musics2.size()-1);
		Collections.reverse(musics2);	 
		for(int i=0; i<3; i++) {
			
			result2.add(musics2.get(i));
		}
		System.out.println(result2);
		
		long nano_endTime = System.nanoTime(); 
        long millis_endTime = System.currentTimeMillis(); 
  
        // Print the time taken by subtracting 
        // the end-time from the start-time 
        System.out.println("Time taken in nano seconds: "
                           + (nano_endTime - nano_startTime)); 
        System.out.println("Time taken in milli seconds: "
                           + (millis_endTime - millis_startTime)); 
			
	}
	
	private static void merge(ArrayList<music2> mus, int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        ArrayList<music2> left = new ArrayList<>();
        ArrayList<music2> right = new ArrayList<>();
  
        for (int i=0; i<n1; ++i)
        	left.add(mus.get(l+i));
        for (int j=0; j<n2; ++j) 
        	right.add(mus.get(m+1+j));
  

        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (left.get(i).getCommon() <= right.get(j).getCommon())
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

    private static void mergeSort(ArrayList<music2> mus, int l, int r) { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
  
            mergeSort(mus, l, m); 
            mergeSort(mus , m+1, r); 
  
            merge(mus, l, m, r); 
        } 
    } 
    
	
}

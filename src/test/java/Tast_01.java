

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import java.util.ArrayList;



import org.junit.Test;

public class Tast_01 {
	
	
	public void test_1() {
		
		ADD add=new ADD();
		int ret=add.getResult(1,2);
		assertEquals(3,ret);
		
	}
	
	@Test
	public void test_read_sort() {
		
		Read_Sort read_sort=new Read_Sort();
		ArrayList list=new ArrayList();
		list.add(8);
		list.add(9);
		list.add(2);
		int[]array= read_sort.read(list);
		int[] origin_array = list.stream().mapToInt(t -> Integer.valueOf(t.toString())).toArray();

		//int[] origin_array = list.stream().mapToInt(t -> Integer.parseInt((String) t)).toArray();
		//assertArrayEquals(origin_array, array);
		read_sort.set_Sort_Interface(new Sort());
		assertArrayEquals(new int[] {9,8,2}, read_sort.readsort(list));
		
		
	}
}

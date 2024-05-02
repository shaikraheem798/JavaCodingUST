package testnew;

import utils1.fileNameMaker;

public class TestFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileNameMaker fn = new fileNameMaker();
	
		String currfilename = fn.fileNameForLogin("abc", "def");
		System.out.println(currfilename);

	}

}

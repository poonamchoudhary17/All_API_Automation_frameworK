package Driver_Package;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import Common_API_Methods.Common_Utility_Method_Post;

public class dynamicdriverpractice {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		ArrayList<String>TestCasetorun=Common_Utility_Method_Post.ReadDataExcel("TestCase","TestCase2Execute");
		System.out.println(TestCasetorun);
		
		int count=TestCasetorun.size();
		for(int i=1; i<count;i++)
		{
			String TestCaseName=TestCasetorun.get(i);
			System.out.println(TestCaseName);
			
			Class<?>testclassname=Class.forName("Test_Classes"+TestCaseName);
			
			Method executemethod=testclassname.getDeclaredMethod("extractor");
			
			executemethod.setAccessible(true);
			
			Object Instanceoftestclass=testclassname.getDeclaredConstructor().newInstance();
			executemethod.invoke(Instanceoftestclass);
		}

	}

}


public class StringPractice {

	public static void main(String[] args) {
    String s1="vasu";
    String s2=new String("vasu");
    String s3=new String("vasu");
    System.out.println(s1==s2);
    System.out.println(s2==s3);
    String s5=s3.intern();
    System.out.println(s5==s3);
    System.out.println(s1==s5);
	}

}

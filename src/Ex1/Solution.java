package Ex1;
import java.io.FileInputStream;
import java.util.Scanner;

/* ����ϴ� Ŭ�������� Solution �̾�� �ϸ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� ������ �� �� �ֽ��ϴ�. */

class Solution {
	public static void main(String args[]) throws Exception	{
		int T, num, value, result=0;
        int test_case;
        /* �Ʒ� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸ� ���� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
           ���� ������ PC ���� �׽�Ʈ �� ����, �Է°��� input.txt�� ������ �� �� �ڵ带 ù �κп� �߰��ϸ�,
           �� �Ʒ����� �Է��� ������ �� ǥ�� �Է� ��� input.txt ���Ϸ� ���� �Է°��� �о� �� �� �ֽ��ϴ�.
           ���� ������ PC ���� �׽�Ʈ �� ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �˴ϴ�.
           ��, �� �ý��ۿ��� "�����ϱ�" �� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�. */
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
        
//		Scanner sc = new Scanner(System.in);
        
		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
			//	�� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
			num = sc.nextInt();
			for(int i = 0; i < num; i++) {
				result ^= sc.nextInt();
			}
			
			//	�� �κп��� ������ ����Ͻʽÿ�.
			System.out.println("Case #" + test_case);
			System.out.println(result);
			
		}
	}
}
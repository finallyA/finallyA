package xiaozuoye;

public class sanjiaoxing {
      public static void main(String[] args) {
    	  for (int i=0;i<5 ;i++ )
    		       {
    		            for (int j=0;j<=5-i ;j++ )//����ո�����ѭ���ǵݼ���
    		            {
    		               System.out.print(" ");
    		            }
    		            for (int k=0;k<=i*2 ;k++ )//���*��������ѭ���ǵ�����,��k<=iʱ ֻ��ӡ�����ε�һ��,����k�Ǵ�0��ʼ��
    		           {
    		               System.out.print("*");
    		           }
                        System.out.println();
    		          }
	  
	}
}

package combridgelaz1;

public class Couponnumbers {

	public static void main(String[] args) 
	{
			{
			char[] chars="a-z".toCharArray();
			int max=100000000;
			int random=(int) (Math.random()*max);	
			StringBuffer stringbuffer=new StringBuffer();

			while (random>0)
			{
				stringbuffer.append(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=stringbuffer.toString();
			System.out.println("Coupon Code: "+couponCode);	
		}

	    } 

		

	}



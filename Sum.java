public class Sum
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
            int X=Integer.parseInt(args[i]);
            sum+=X;
        }
        System.out.println("Sum is: "+sum);
    }
}
        

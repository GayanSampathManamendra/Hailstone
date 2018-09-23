class Hailstone {
    //Hailstone recursive function by Hasee Amarathunga
    public static void main(String[] args){
        
        halistone(Integer.parseInt(args[1]));
    }
    
    public static void halistone(int x) {
        System.out.print(x + ", ");
        if (x!=1) {
            if(x%2==0) x = x/2;
            else x = x*3 + 1;
            halistone(x);
            
        }
    }

}

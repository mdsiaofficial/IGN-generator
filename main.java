
class NICKNAME

{ 
    public static void main(String[] args) { 
        String[] pre = {"Mate", "Dark", "Pro", "Pot", "Unreal", "Extra" ,"Mr.", "Alpha", "*uck", "White", "Crazy" ,}; 
        
        String[] suf = {"Hang", "Lad", "Black","King", "king", "BackSeat", "ash","op", "Ass" ,"Fat", "Splash", "Swag", "Wizard", "dark", "port", "Drop", }; 
        
        
        int name0 = pre.length;
        int name00 = suf.length;
        
        int rand0 = (int) (Math.random() * name0); 
        int rand00 = (int) (Math.random() * name00); 
        

        String sum = pre[rand0] + suf[rand00];

        System.out.println ("Your name is : "+ sum); 
    } 
}

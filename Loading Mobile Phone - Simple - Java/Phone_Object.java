public class Phone_Object{

    private static double load = 0;
    public static double call_rate = 7.50;
    public static int text_rate = 1;

    public void Phone_Object(double call_rate){
        this.call_rate = call_rate;
    }   
    
    public void Phone_Object(int text_rate){
        this.text_rate = text_rate; 
    }

    public boolean reload(double amount){
        if(amount >= 0){
            load += amount;
            return true;
        }
        return false;
    }

    public boolean call(int minutes){
        if(minutes > 0){
            
            if(load > call_rate && load > 0){
                double pass = 0;
                pass = load;
                pass -= (call_rate * minutes);
                if(pass > 0){
                    load = pass;
                    return true;
                }else
                    return false;
            }else{
                return false;
            }
        }
        return false;
    }

    public boolean text(int length){
        if(length >= 1 && length <= 164){
            load -= text_rate;
            return true;
        }else
            return false;
    }
    
    public double getLoad(){
        return load;
    }
    public double getCallRate(){
        return call_rate;
    }
    public int getTextRate(){
        return text_rate;
    }

}
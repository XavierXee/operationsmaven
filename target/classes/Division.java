package operations;

public class Division {
    
    public Division (){}
    
    public int exe (int a, int b) throws BananeException{
        if(b == 0){            
            throw new BananeException("Caprice du client");
        } else {
            return a/b;
        }
    }
}


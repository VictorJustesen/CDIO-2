package spil;

public class Konto {
    private int b =0;
    public Konto(int balance)
    {
        b = balance;
    }
    public int update(int b)
    {
        this.b+=b;
        return this.b;

    }
    public int getBalance(){
        return b;
    }
}

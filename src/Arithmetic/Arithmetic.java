package Arithmetic;

public class Arithmetic<T extends Number> {
    private Number first;
    private Number second;

    public Arithmetic(Number first, Number second) {
        this.first = first;
        this.second = second;
    }

    public Number add(){
        return first.doubleValue() + second.doubleValue();
    }

    public Number subtract(){
        return first.doubleValue() - second.doubleValue();
    }

    public Number multiply(){
        return first.doubleValue() * second.doubleValue();
    }

    public Number divide(){
        double answer = 0;

        try{
            answer = first.doubleValue() / second.doubleValue();
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        return answer;
    }

    public Number getMin(){
        return Math.min(first.doubleValue(), second.doubleValue());
    }

    public Number getMax(){
        return Math.max(first.doubleValue(), second.doubleValue());
    }
}

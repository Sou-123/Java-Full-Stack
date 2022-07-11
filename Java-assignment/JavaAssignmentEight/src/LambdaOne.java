
@FunctionalInterface
interface ArithematicOperations
{
    void display(int a, int b);
}
class LambdaOne
{
    public static void main(String[] args) {
        ArithematicOperations operations=(firstNumber,secondNumber)->{
            System.out.println("The result of addition is: "+(firstNumber+secondNumber));
            System.out.println("The result of subtraction is: "+(firstNumber-secondNumber));
            System.out.println("The result of multiplication is:"+(firstNumber*secondNumber));
            System.out.println("The result of division is :" +(firstNumber/secondNumber)+" and the remainder"+(firstNumber%secondNumber));
        };
            operations.display(4,8);
        System.out.println(" ");
        operations.display(6,3);


    }
}
package SecondClass;

public class Operator {
    public void UnaryOperator(){
        System.out.println("Unary Operator");
        int number = 15;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(number);
        System.out.println(--number);
        System.out.println(number);
        System.out.println(number--);
        System.out.println(++number);
    }
    public void ArithmeticOperator(){
        System.out.println("Arithmatic Operator");
        int num1 = 10, num2 = 15;
        System.out.println(num1+"+"+num2+"="+ (num1+num2));
        System.out.println(num2+"-"+num1+"="+ (num2-num1));
        System.out.println(num2+"/"+num1+"="+ (num2/num1));
        System.out.println(num2+"*"+num1+"="+ (num2*num1));
        System.out.println(num2+"%"+num1+"="+ (num2%num1));
    }
    public void RelationalOperator(){
        System.out.println("Relational Operator");
        int num1 = 10, num2 = 15;

        System.out.println(num1 != num2); //true
        System.out.println(num1 == num2); //false
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); // true
        System.out.println(num1 >= num2);//false
        System.out.println(num1 <= num2); //true
    }
    public void LogicalOperator(){
        System.out.println("Logical Operator");//Logical Operator: && ||
        int num1 = 10, num2 = 15;

        System.out.println((num1 != num2) && (num1 < num2)); //true
        System.out.println((num1 == num2) && (num1 > num2)); //false
        System.out.println((num1 > num2) || (num1 < num2)); //true
        System.out.println((num1 < num2) || (num1 >= num2)); // true
    }
    public void TernaryOperator(){
        System.out.println("Ternary Operator");//Logical Operator: && ||
        int num1 = 10, num2 = 15, num3;
        num3 = (num1 > num2) ? num1 : num2;
        System.out.println(num1);
        System.out.println(num3);
    }
    public void AssignmentOperator(){
        System.out.println("Assignment Operator");//Logical Operator: && ||
        int num1 = 10, num2 = 15; //Assignment Operator: = += -= *= /= %=
        num1+=num2;
        System.out.println(num1);
        num2-=num1;
        System.out.println(num2);
        num1*=num2;
        System.out.println(num1);
        num1/=num2;
        System.out.println(num1);
        num2%=num1;
        System.out.println(num2);

    }
    public static void main(String[] args) {
        Operator unio = new Operator();
        unio.UnaryOperator();
        Operator ario = new Operator();
        ario.ArithmeticOperator();
        Operator relationO = new Operator();
        relationO.RelationalOperator();
        Operator logicO = new Operator();
        logicO.LogicalOperator();
        Operator terO = new Operator();
        terO.TernaryOperator();
        Operator assinO = new Operator();
        assinO.AssignmentOperator();
    }
}
